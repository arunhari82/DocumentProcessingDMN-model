package com.blackknight.dmndemo.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"loanApplicationSummary", "loanRegistry", "ownerOccupancyAnalysis"})
@XmlRootElement(name = "BorrowerSection")
public class BorrowerSection implements Serializable {
  @XmlElement(name = "LoanApplicationSummary", required = true)
  protected LoanApplicationSummary loanApplicationSummary;
  
  @XmlElement(name = "LoanRegistry", required = true)
  protected LoanRegistry loanRegistry;
  
  @XmlElement(name = "OwnerOccupancyAnalysis", required = true)
  protected OwnerOccupancyAnalysis ownerOccupancyAnalysis;
  
  public LoanApplicationSummary getLoanApplicationSummary() {
    return this.loanApplicationSummary;
  }
  
  public void setLoanApplicationSummary(LoanApplicationSummary value) {
    this.loanApplicationSummary = value;
  }
  
  public LoanRegistry getLoanRegistry() {
    return this.loanRegistry;
  }
  
  public void setLoanRegistry(LoanRegistry value) {
    this.loanRegistry = value;
  }
  
  public OwnerOccupancyAnalysis getOwnerOccupancyAnalysis() {
    return this.ownerOccupancyAnalysis;
  }
  
  public void setOwnerOccupancyAnalysis(OwnerOccupancyAnalysis value) {
    this.ownerOccupancyAnalysis = value;
  }
}
