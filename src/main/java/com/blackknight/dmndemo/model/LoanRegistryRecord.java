package com.blackknight.dmndemo.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"value"})
@XmlRootElement(name = "LoanRegistryRecord")
public class LoanRegistryRecord implements Serializable {
  @XmlValue
  protected String value;
  
  @XmlAttribute(name = "addressReceived")
  protected String addressReceived;
  
  @XmlAttribute(name = "addressStandardized")
  protected String addressStandardized;
  
  @XmlAttribute(name = "addressStandardizedSuccess")
  protected String addressStandardizedSuccess;
  
  @XmlAttribute(name = "borrowerFirstName")
  protected String borrowerFirstName;
  
  @XmlAttribute(name = "borrowerLastName")
  protected String borrowerLastName;
  
  @XmlAttribute(name = "cityReceived")
  protected String cityReceived;
  
  @XmlAttribute(name = "cityStandardized")
  protected String cityStandardized;
  
  @XmlAttribute(name = "loanAmount")
  protected Integer loanAmount;
  
  @XmlAttribute(name = "minNumber")
  protected Long minNumber;
  
  @XmlAttribute(name = "noteDate")
  protected String noteDate;
  
  @XmlAttribute(name = "reportedDate")
  protected String reportedDate;
  
  @XmlAttribute(name = "servicer")
  protected String servicer;
  
  @XmlAttribute(name = "stateReceived")
  protected String stateReceived;
  
  @XmlAttribute(name = "stateStandardized")
  protected String stateStandardized;
  
  @XmlAttribute(name = "status")
  protected String status;
  
  @XmlAttribute(name = "subjectAddress")
  protected String subjectAddress;
  
  @XmlAttribute(name = "within120Days")
  protected String within120Days;
  
  @XmlAttribute(name = "zipReceived")
  protected Integer zipReceived;
  
  @XmlAttribute(name = "zipStandardized")
  protected Integer zipStandardized;
  
  @XmlAttribute(name = "result")
  protected String result;
  
  public String getResult() {
    return this.result;
  }
  
  public void setResult(String result) {
    this.result = result;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public String getAddressReceived() {
    return this.addressReceived;
  }
  
  public void setAddressReceived(String value) {
    this.addressReceived = value;
  }
  
  public String getAddressStandardized() {
    return this.addressStandardized;
  }
  
  public void setAddressStandardized(String value) {
    this.addressStandardized = value;
  }
  
  public String getAddressStandardizedSuccess() {
    return this.addressStandardizedSuccess;
  }
  
  public void setAddressStandardizedSuccess(String value) {
    this.addressStandardizedSuccess = value;
  }
  
  public String getBorrowerFirstName() {
    return this.borrowerFirstName;
  }
  
  public void setBorrowerFirstName(String value) {
    this.borrowerFirstName = value;
  }
  
  public String getBorrowerLastName() {
    return this.borrowerLastName;
  }
  
  public void setBorrowerLastName(String value) {
    this.borrowerLastName = value;
  }
  
  public String getCityReceived() {
    return this.cityReceived;
  }
  
  public void setCityReceived(String value) {
    this.cityReceived = value;
  }
  
  public String getCityStandardized() {
    return this.cityStandardized;
  }
  
  public void setCityStandardized(String value) {
    this.cityStandardized = value;
  }
  
  public Integer getLoanAmount() {
    return this.loanAmount;
  }
  
  public void setLoanAmount(Integer value) {
    this.loanAmount = value;
  }
  
  public Long getMinNumber() {
    return this.minNumber;
  }
  
  public void setMinNumber(Long value) {
    this.minNumber = value;
  }
  
  public String getNoteDate() {
    return this.noteDate;
  }
  
  public void setNoteDate(String value) {
    this.noteDate = value;
  }
  
  public String getReportedDate() {
    return this.reportedDate;
  }
  
  public void setReportedDate(String value) {
    this.reportedDate = value;
  }
  
  public String getServicer() {
    return this.servicer;
  }
  
  public void setServicer(String value) {
    this.servicer = value;
  }
  
  public String getStateReceived() {
    return this.stateReceived;
  }
  
  public void setStateReceived(String value) {
    this.stateReceived = value;
  }
  
  public String getStateStandardized() {
    return this.stateStandardized;
  }
  
  public void setStateStandardized(String value) {
    this.stateStandardized = value;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String value) {
    this.status = value;
  }
  
  public String getSubjectAddress() {
    return this.subjectAddress;
  }
  
  public void setSubjectAddress(String value) {
    this.subjectAddress = value;
  }
  
  public String getWithin120Days() {
    return this.within120Days;
  }
  
  public void setWithin120Days(String value) {
    this.within120Days = value;
  }
  
  public Integer getZipReceived() {
    return this.zipReceived;
  }
  
  public void setZipReceived(Integer value) {
    this.zipReceived = value;
  }
  
  public Integer getZipStandardized() {
    return this.zipStandardized;
  }
  
  public void setZipStandardized(Integer value) {
    this.zipStandardized = value;
  }
}
