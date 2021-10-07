package com.blackknight.dmndemo.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"other"})
@XmlRootElement(name = "LoanApplicationSummary")
public class LoanApplicationSummary implements Serializable {
  @XmlElement(name = "Other", required = true)
  protected Other other;
  
  @XmlAttribute(name = "extended")
  protected String extended;
  
  @XmlAttribute(name = "subjectPropertyAddress")
  protected String subjectPropertyAddress;
  
  public Other getOther() {
    return this.other;
  }
  
  public void setOther(Other value) {
    this.other = value;
  }
  
  public String getExtended() {
    return this.extended;
  }
  
  public void setExtended(String value) {
    this.extended = value;
  }
  
  public String getSubjectPropertyAddress() {
    return this.subjectPropertyAddress;
  }
  
  public void setSubjectPropertyAddress(String value) {
    this.subjectPropertyAddress = value;
  }
}
