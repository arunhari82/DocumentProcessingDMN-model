package com.blackknight.dmndemo.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"value"})
@XmlRootElement(name = "UndisclosedDebtActivity")
public class UndisclosedDebtActivity implements Serializable {
  @XmlValue
  protected String value;
  
  @XmlAttribute(name = "activityDate")
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar activityDate;
  
  @XmlAttribute(name = "address")
  protected String address;
  
  @XmlAttribute(name = "addressLine1")
  protected String addressLine1;
  
  @XmlAttribute(name = "addressLine2")
  protected String addressLine2;
  
  @XmlAttribute(name = "borrowerName")
  protected String borrowerName;
  
  @XmlAttribute(name = "brokerCode")
  protected String brokerCode;
  
  @XmlAttribute(name = "channel")
  protected String channel;
  
  @XmlAttribute(name = "city")
  protected String city;
  
  @XmlAttribute(name = "firstName")
  protected String firstName;
  
  @XmlAttribute(name = "fullAddress")
  protected String fullAddress;
  
  @XmlAttribute(name = "insertDate")
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar insertDate;
  
  @XmlAttribute(name = "lastName")
  protected String lastName;
  
  @XmlAttribute(name = "loanStatus")
  protected String loanStatus;
  
  @XmlAttribute(name = "loanStatusCode")
  protected String loanStatusCode;
  
  @XmlAttribute(name = "recordKey")
  protected Integer recordKey;
  
  @XmlAttribute(name = "state")
  protected String state;
  
  @XmlAttribute(name = "stdCity")
  protected String stdCity;
  
  @XmlAttribute(name = "stdHouseNumber")
  protected Short stdHouseNumber;
  
  @XmlAttribute(name = "stdPostDirectional")
  protected String stdPostDirectional;
  
  @XmlAttribute(name = "stdPreDirectional")
  protected String stdPreDirectional;
  
  @XmlAttribute(name = "stdState")
  protected String stdState;
  
  @XmlAttribute(name = "stdStreetName")
  protected String stdStreetName;
  
  @XmlAttribute(name = "stdStreetSuffix")
  protected String stdStreetSuffix;
  
  @XmlAttribute(name = "stdUnit")
  protected String stdUnit;
  
  @XmlAttribute(name = "stdZip5")
  protected Integer stdZip5;
  
  @XmlAttribute(name = "zip5")
  protected Integer zip5;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public XMLGregorianCalendar getActivityDate() {
    return this.activityDate;
  }
  
  public void setActivityDate(XMLGregorianCalendar value) {
    this.activityDate = value;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String value) {
    this.address = value;
  }
  
  public String getAddressLine1() {
    return this.addressLine1;
  }
  
  public void setAddressLine1(String value) {
    this.addressLine1 = value;
  }
  
  public String getAddressLine2() {
    return this.addressLine2;
  }
  
  public void setAddressLine2(String value) {
    this.addressLine2 = value;
  }
  
  public String getBorrowerName() {
    return this.borrowerName;
  }
  
  public void setBorrowerName(String value) {
    this.borrowerName = value;
  }
  
  public String getBrokerCode() {
    return this.brokerCode;
  }
  
  public void setBrokerCode(String value) {
    this.brokerCode = value;
  }
  
  public String getChannel() {
    return this.channel;
  }
  
  public void setChannel(String value) {
    this.channel = value;
  }
  
  public String getCity() {
    return this.city;
  }
  
  public void setCity(String value) {
    this.city = value;
  }
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(String value) {
    this.firstName = value;
  }
  
  public String getFullAddress() {
    return this.fullAddress;
  }
  
  public void setFullAddress(String value) {
    this.fullAddress = value;
  }
  
  public XMLGregorianCalendar getInsertDate() {
    return this.insertDate;
  }
  
  public void setInsertDate(XMLGregorianCalendar value) {
    this.insertDate = value;
  }
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(String value) {
    this.lastName = value;
  }
  
  public String getLoanStatus() {
    return this.loanStatus;
  }
  
  public void setLoanStatus(String value) {
    this.loanStatus = value;
  }
  
  public String getLoanStatusCode() {
    return this.loanStatusCode;
  }
  
  public void setLoanStatusCode(String value) {
    this.loanStatusCode = value;
  }
  
  public Integer getRecordKey() {
    return this.recordKey;
  }
  
  public void setRecordKey(Integer value) {
    this.recordKey = value;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String value) {
    this.state = value;
  }
  
  public String getStdCity() {
    return this.stdCity;
  }
  
  public void setStdCity(String value) {
    this.stdCity = value;
  }
  
  public Short getStdHouseNumber() {
    return this.stdHouseNumber;
  }
  
  public void setStdHouseNumber(Short value) {
    this.stdHouseNumber = value;
  }
  
  public String getStdPostDirectional() {
    return this.stdPostDirectional;
  }
  
  public void setStdPostDirectional(String value) {
    this.stdPostDirectional = value;
  }
  
  public String getStdPreDirectional() {
    return this.stdPreDirectional;
  }
  
  public void setStdPreDirectional(String value) {
    this.stdPreDirectional = value;
  }
  
  public String getStdState() {
    return this.stdState;
  }
  
  public void setStdState(String value) {
    this.stdState = value;
  }
  
  public String getStdStreetName() {
    return this.stdStreetName;
  }
  
  public void setStdStreetName(String value) {
    this.stdStreetName = value;
  }
  
  public String getStdStreetSuffix() {
    return this.stdStreetSuffix;
  }
  
  public void setStdStreetSuffix(String value) {
    this.stdStreetSuffix = value;
  }
  
  public String getStdUnit() {
    return this.stdUnit;
  }
  
  public void setStdUnit(String value) {
    this.stdUnit = value;
  }
  
  public Integer getStdZip5() {
    return this.stdZip5;
  }
  
  public void setStdZip5(Integer value) {
    this.stdZip5 = value;
  }
  
  public Integer getZip5() {
    return this.zip5;
  }
  
  public void setZip5(Integer value) {
    this.zip5 = value;
  }
}
