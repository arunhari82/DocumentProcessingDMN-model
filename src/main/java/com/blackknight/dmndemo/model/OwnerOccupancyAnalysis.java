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
@XmlRootElement(name = "OwnerOccupancyAnalysis")
public class OwnerOccupancyAnalysis implements Serializable {
  @XmlValue
  protected String value;
  
  @XmlAttribute(name = "LikelyResidenceSqft")
  protected Short likelyResidenceSqft;
  
  @XmlAttribute(name = "LikelyResidenceValue")
  protected Integer likelyResidenceValue;
  
  @XmlAttribute(name = "OwnerOccCaution")
  protected String ownerOccCaution;
  
  @XmlAttribute(name = "OwnerOfSubjectProperty")
  protected String ownerOfSubjectProperty;
  
  @XmlAttribute(name = "PropertiesCurrentlyOwned")
  protected Byte propertiesCurrentlyOwned;
  
  @XmlAttribute(name = "PropertiesEverOwned")
  protected Byte propertiesEverOwned;
  
  @XmlAttribute(name = "SubjectPropertValue")
  protected Integer subjectPropertValue;
  
  @XmlAttribute(name = "SubjectPropertySqft")
  protected Short subjectPropertySqft;
  
  @XmlAttribute(name = "sqftDirection")
  protected String sqftDirection;
  
  @XmlAttribute(name = "sqftShift")
  protected Short sqftShift;
  
  @XmlAttribute(name = "valueDirection")
  protected String valueDirection;
  
  @XmlAttribute(name = "valueShift")
  protected Integer valueShift;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public Short getLikelyResidenceSqft() {
    return this.likelyResidenceSqft;
  }
  
  public void setLikelyResidenceSqft(Short value) {
    this.likelyResidenceSqft = value;
  }
  
  public Integer getLikelyResidenceValue() {
    return this.likelyResidenceValue;
  }
  
  public void setLikelyResidenceValue(Integer value) {
    this.likelyResidenceValue = value;
  }
  
  public String getOwnerOccCaution() {
    return this.ownerOccCaution;
  }
  
  public void setOwnerOccCaution(String value) {
    this.ownerOccCaution = value;
  }
  
  public String getOwnerOfSubjectProperty() {
    return this.ownerOfSubjectProperty;
  }
  
  public void setOwnerOfSubjectProperty(String value) {
    this.ownerOfSubjectProperty = value;
  }
  
  public Byte getPropertiesCurrentlyOwned() {
    return this.propertiesCurrentlyOwned;
  }
  
  public void setPropertiesCurrentlyOwned(Byte value) {
    this.propertiesCurrentlyOwned = value;
  }
  
  public Byte getPropertiesEverOwned() {
    return this.propertiesEverOwned;
  }
  
  public void setPropertiesEverOwned(Byte value) {
    this.propertiesEverOwned = value;
  }
  
  public Integer getSubjectPropertValue() {
    return this.subjectPropertValue;
  }
  
  public void setSubjectPropertValue(Integer value) {
    this.subjectPropertValue = value;
  }
  
  public Short getSubjectPropertySqft() {
    return this.subjectPropertySqft;
  }
  
  public void setSubjectPropertySqft(Short value) {
    this.subjectPropertySqft = value;
  }
  
  public String getSqftDirection() {
    return this.sqftDirection;
  }
  
  public void setSqftDirection(String value) {
    this.sqftDirection = value;
  }
  
  public Short getSqftShift() {
    return this.sqftShift;
  }
  
  public void setSqftShift(Short value) {
    this.sqftShift = value;
  }
  
  public String getValueDirection() {
    return this.valueDirection;
  }
  
  public void setValueDirection(String value) {
    this.valueDirection = value;
  }
  
  public Integer getValueShift() {
    return this.valueShift;
  }
  
  public void setValueShift(Integer value) {
    this.valueShift = value;
  }
}
