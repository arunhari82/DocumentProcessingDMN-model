package com.blackknight.dmndemo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class XMLTest {
  public static void main(String[] args) throws Exception {
    String xmlContent = new String(Files.readAllBytes(Paths.get("/Users/arunhariharan/Downloads/Mini DMN Exercise - Request.xml", new String[0])));
    HashMap<String, Object> map = DocProcessUtil.parseXML(xmlContent);
    ObjectMapper mapper = new ObjectMapper();
    System.out.println(mapper.writeValueAsString(map.get("Borrowers")));
  }
}
