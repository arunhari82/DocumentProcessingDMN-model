package com.blackknight.dmndemo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"loanRegistryRecord"})
@XmlRootElement(name = "LoanRegistry")
public class LoanRegistry implements Serializable {
  @XmlElement(name = "LoanRegistryRecord")
  protected List<LoanRegistryRecord> loanRegistryRecord;
  
  @XmlAttribute(name = "available")
  protected String available;
  
  @XmlAttribute(name = "loanRegCount")
  protected Byte loanRegCount;
  
  @XmlAttribute(name = "resultCode")
  protected String resultCode;
  
  public List<LoanRegistryRecord> getLoanRegistryRecord() {
    if (this.loanRegistryRecord == null)
      this.loanRegistryRecord = new ArrayList<>(); 
    return this.loanRegistryRecord;
  }
  
  public String getAvailable() {
    return this.available;
  }
  
  public void setAvailable(String value) {
    this.available = value;
  }
  
  public Byte getLoanRegCount() {
    return this.loanRegCount;
  }
  
  public void setLoanRegCount(Byte value) {
    this.loanRegCount = value;
  }
  
  public String getResultCode() {
    return this.resultCode;
  }
  
  public void setResultCode(String value) {
    this.resultCode = value;
  }
}
