package com.blackknight.dmndemo.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"borrowerSection"})
@XmlRootElement(name = "Borrower")
public class Borrower implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @XmlElement(name = "BorrowerSection", required = true)
  protected BorrowerSection borrowerSection;
  
  @XmlAttribute(name = "BorrowerNumber")
  protected Byte borrowerNumber;
  
  @XmlAttribute(name = "ssn")
  protected String ssn;
  
  @XmlAttribute(name = "ssnSource")
  protected String ssnSource;
  
  @XmlAttribute(name = "messages", required = false)
  protected String messages;
  
  public String getMessages() {
    return this.messages;
  }
  
  public void setMessages(String messages) {
    this.messages = messages;
  }
  
  public BorrowerSection getBorrowerSection() {
    return this.borrowerSection;
  }
  
  public void setBorrowerSection(BorrowerSection value) {
    this.borrowerSection = value;
  }
  
  public Byte getBorrowerNumber() {
    return this.borrowerNumber;
  }
  
  public void setBorrowerNumber(Byte value) {
    this.borrowerNumber = value;
  }
  
  public String getSsn() {
    return this.ssn;
  }
  
  public void setSsn(String value) {
    this.ssn = value;
  }
  
  public String getSsnSource() {
    return this.ssnSource;
  }
  
  public void setSsnSource(String value) {
    this.ssnSource = value;
  }
}
