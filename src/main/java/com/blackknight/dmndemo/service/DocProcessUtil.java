package com.blackknight.dmndemo.service;

import com.blackknight.dmndemo.model.Borrower;
import com.blackknight.dmndemo.model.BorrowerSubset;
import com.blackknight.dmndemo.model.Borrowers;
import com.blackknight.dmndemo.model.LoanRegistryRecord;
import com.blackknight.dmndemo.model.MatchResult;
import com.blackknight.dmndemo.model.Record06G;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DocProcessUtil {
  public String helloWorld() {
    return "Hello World";
  }
  
  private static XPath configXPath() {
    XPath xPath = null;
    try {
      xPath = XPathFactory.newInstance().newXPath();
      HashMap<String, String> prefMap = new HashMap<String, String>() {
        
        };
      SimpleNamespaceContext nsContext = new SimpleNamespaceContext(prefMap);
      xPath.setNamespaceContext(nsContext);
    } catch (Exception exception) {}
    return xPath;
  }
  
  public static String aggregateFinalResults(HashMap<String, Object> dmnResult) {
    String jsonResult = null;
    Borrowers borrowers = new Borrowers();
    ArrayList<Borrower> borrowerList = (ArrayList<Borrower>)dmnResult.get("FilteredBorrowers");
    ArrayList<HashMap<String, Object>> list = (ArrayList<HashMap<String, Object>>)dmnResult.get("Match Address");
    ObjectMapper mapper = new ObjectMapper();
    StringWriter xmlString = new StringWriter();
    try {
      for (Borrower borrower : borrowerList) {
        String messages = "";
        for (LoanRegistryRecord record : borrower.getBorrowerSection().getLoanRegistry().getLoanRegistryRecord()) {
          for (HashMap<String, Object> rec : list) {
            String json = mapper.writeValueAsString(rec);
            MatchResult result = (MatchResult)(new ObjectMapper()).readValue(json, MatchResult.class);
            System.out.println(borrower.getBorrowerNumber().intValue() + " == " + result.getBorrowerNumber() + " , " + record.getMinNumber() + "==" + result.getResultRec().getMinnumber());
            if (borrower.getBorrowerNumber().intValue() == result.getBorrowerNumber() && record.getMinNumber().longValue() == result.getResultRec().getMinnumber()) {
              record.setResult(result.getResultRec().getResult());
              if (borrower.getMessages() != null) {
                borrower.setMessages(borrower.getMessages() + messages + "Result : " + result.getResultRec().getResult() + " ,  Address : " + record.getAddressStandardized() + " - ");
                continue;
              } 
              borrower.setMessages(messages + "Result : " + result.getResultRec().getResult() + " ,  Address : " + record.getAddressStandardized() + " - ");
            } 
          } 
        } 
      } 
      borrowers.getBorrower().addAll(borrowerList);
      JAXB.marshal(borrowers, xmlString);
      System.out.println("mapper : " + mapper.writeValueAsString(borrowers));
      System.out.println("xml : " + xmlString.toString());
    } catch (Exception e) {
      e.printStackTrace();
    } 
    return xmlString.toString();
  }
  
  public static ArrayList<Borrower> finalizeResult(ArrayList<Borrower> borrowerList, ArrayList<HashMap<String, Object>> list) {
    ObjectMapper mapper = new ObjectMapper();
    try {
      for (Borrower borrower : borrowerList) {
        for (LoanRegistryRecord record : borrower.getBorrowerSection().getLoanRegistry().getLoanRegistryRecord()) {
          for (HashMap<String, Object> rec : list) {
            String json = mapper.writeValueAsString(rec);
            MatchResult result = (MatchResult)(new ObjectMapper()).readValue(json, MatchResult.class);
            System.out.println(borrower.getBorrowerNumber().intValue() + " == " + result.getBorrowerNumber() + " , " + record.getMinNumber() + "==" + result.getResultRec().getMinnumber());
            if (borrower.getBorrowerNumber().intValue() == result.getBorrowerNumber() && record.getMinNumber().longValue() == result.getResultRec().getMinnumber())
              record.setResult(result.getResultRec().getResult()); 
          } 
        } 
      } 
    } catch (Exception e) {
      e.printStackTrace();
    } 
    return borrowerList;
  }
  
  public static List<Record06G> getRecords(String xmlData) {
    return getRecord06GRec(get06GRecords(xmlData));
  }
  
  private static List<Record06G> getRecord06GRec(ArrayList<String> records) {
    List<Record06G> list = new ArrayList<>();
    try {
      System.out.println("Processsing getRecord06GRec");
      for (String rec : records) {
        Record06G rec06G = new Record06G();
        rec06G.setAddress(rec.substring(12, 35).trim());
        rec06G.setType(rec.substring(94, 96));
        list.add(rec06G);
      } 
    } catch (Exception e) {
      e.printStackTrace();
    } 
    return list;
  }
  
  public static HashMap<String, Object> parseXML(String xml) {
    HashMap<String, Object> map = new HashMap<>();
    map.put("Record96G", getRecord06GRec(get06GRecords(xml)));
    map.put("Borrowers", getBorrowers(xml));
    return map;
  }
  
  public static List<Borrower> aggregateMessages(List<Borrower> borrowerList, List<BorrowerSubset> borrowerSubsetList) {
    for (Borrower borrower : borrowerList) {
      for (BorrowerSubset subset : borrowerSubsetList) {
        if (subset.getBorrowerNumber() == borrower.getBorrowerNumber().byteValue())
          for (LoanRegistryRecord record : borrower.getBorrowerSection().getLoanRegistry().getLoanRegistryRecord()) {
            for (LoanRegistryRecord curRecord : subset.getLoanRegistryRecordList()) {
              if (record.getMinNumber().equals(curRecord.getMinNumber())) {
                record.setResult(curRecord.getResult());
                if (borrower.getMessages() == null) {
                  borrower.setMessages(curRecord.getAddressReceived() + " - " + curRecord.getResult());
                  continue;
                } 
                borrower.setMessages(borrower.getMessages() + " , " + curRecord.getAddressReceived() + " - " + curRecord.getResult());
              } 
            } 
          }  
      } 
    } 
    return borrowerList;
  }
  
  public static List<BorrowerSubset> updateResult(BorrowerSubset subset, LoanRegistryRecord record, String result, List<BorrowerSubset> list) {
    BorrowerSubset subset2 = new BorrowerSubset();
    subset2.setBorrowerNumber(subset.getBorrowerNumber());
    record.setResult(result);
    subset2.setLoanRegistryRecordList(new ArrayList());
    subset2.getLoanRegistryRecordList().add(record);
    list.add(subset2);
    return list;
  }
  
  public static BorrowerSubset getLoanRegistryRecords(Borrower borrower) {
    System.out.println("Borrower from LoanRegistry Record : " + borrower);
    BorrowerSubset subset = new BorrowerSubset();
    subset.setBorrowerNumber(borrower.getBorrowerNumber().byteValue());
    ArrayList<LoanRegistryRecord> address = new ArrayList<>();
    for (LoanRegistryRecord record : borrower.getBorrowerSection().getLoanRegistry().getLoanRegistryRecord())
      address.add(record); 
    subset.setLoanRegistryRecordList(address);
    return subset;
  }
  
  public static String getFNMAData(String xmlData) {
    String FNMAData = null;
    try {
      InputStream targetXMLStream = new ByteArrayInputStream(xmlData.getBytes());
      DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
      builderFactory.setNamespaceAware(true);
      DocumentBuilder builder = builderFactory.newDocumentBuilder();
      Document xmlDocument = builder.parse(targetXMLStream);
      XPath xPath = configXPath();
      String expression = "//bkfs:DOCUMENT_CONTENT[1]";
      NodeList nodeList = (NodeList)xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);
      System.out.println("test " + nodeList.getLength());
      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);
        if (i == 0)
          FNMAData = node.getTextContent().trim(); 
      } 
    } catch (Exception e) {
      e.printStackTrace();
    } 
    return FNMAData;
  }
  
  public static ArrayList<Borrower> sortBorrowersDesc(Borrowers borrowers) {
    ArrayList<Borrower> borrowerList = new ArrayList<>();
    borrowerList.addAll(borrowers.getBorrower());
    Collections.sort(borrowerList, new Comparator<Borrower>() {
          public int compare(Borrower l, Borrower r) {
            if (l.getBorrowerNumber().byteValue() >= r.getBorrowerNumber().byteValue())
              return -1; 
            return 1;
          }
        });
    return borrowerList;
  }
  
  public static String trim(String input) {
    return input.trim();
  }
  
  public static ArrayList<String> get06GRecords(String xmlData) {
    return extract06GRecords(getFNMAData(xmlData));
  }
  
  public static ArrayList<String> extract06GRecords(String FNMAData) {
    ArrayList<String> RecordList_069G = new ArrayList<>();
    if (FNMAData == null)
      System.out.println("FNMADATA is null"); 
    String[] data = FNMAData.split("\n");
    for (String i : data) {
      if (i.startsWith("06G")) {
        System.out.println("Adding record : " + i);
        RecordList_069G.add(i);
      } 
    } 
    return RecordList_069G;
  }
  
  public static String[] testNewMethod(String FNMAData) {
    System.out.println("Its Invoked");
    return null;
  }
  
  private static String nodeToString(Node node) {
    StringWriter sw = new StringWriter();
    try {
      Transformer t = TransformerFactory.newInstance().newTransformer();
      t.setOutputProperty("omit-xml-declaration", "yes");
      t.setOutputProperty("indent", "yes");
      t.transform(new DOMSource(node), new StreamResult(sw));
    } catch (TransformerException te) {
      System.out.println("nodeToString Transformer Exception");
    } 
    return sw.toString();
  }
  
  public static Borrowers getBorrowers(String xmlData) {
    Borrowers borrowers = null;
    try {
      InputStream targetXMLStream = new ByteArrayInputStream(xmlData.getBytes());
      DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
      builderFactory.setNamespaceAware(true);
      DocumentBuilder builder = builderFactory.newDocumentBuilder();
      Document xmlDocument = builder.parse(targetXMLStream);
      XPath xPath = configXPath();
      String expression = "//Borrowers";
      NodeList nodeList = (NodeList)xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);
      System.out.println("test " + nodeList.getLength());
      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);
        if (i == 0) {
          String data = nodeToString(node);
          System.out.println("Data : " + data);
          JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] { Borrowers.class });
          Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
          borrowers = (Borrowers)jaxbUnmarshaller.unmarshal(new StringReader(data));
        } 
      } 
    } catch (Exception e) {
      e.printStackTrace();
    } 
    return borrowers;
  }
  
  public static ArrayList<Borrower> getSortedBorrower(String xmlData) {
    Borrowers borrowers = getBorrowers(xmlData);
    System.out.println("borrowers : " + borrowers.getBorrower());
    return sortBorrowersDesc(borrowers);
  }
}
