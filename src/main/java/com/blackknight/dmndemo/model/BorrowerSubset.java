package com.blackknight.dmndemo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class BorrowerSubset implements Serializable {
  private int borrowerNumber;
  
  private List<LoanRegistryRecord> loanRegistryRecordList;
  
  public BorrowerSubset() {}
  
  public BorrowerSubset(int borrowerNumber, List<LoanRegistryRecord> loanRegistryRecordList) {
    this.borrowerNumber = borrowerNumber;
    this.loanRegistryRecordList = loanRegistryRecordList;
  }
  
  public int getBorrowerNumber() {
    return this.borrowerNumber;
  }
  
  public void setBorrowerNumber(int borrowerNumber) {
    this.borrowerNumber = borrowerNumber;
  }
  
  public List<LoanRegistryRecord> getLoanRegistryRecordList() {
    return this.loanRegistryRecordList;
  }
  
  public void setLoanRegistryRecordList(List<LoanRegistryRecord> loanRegistryRecordList) {
    this.loanRegistryRecordList = loanRegistryRecordList;
  }
  
  public BorrowerSubset borrowerNumber(int borrowerNumber) {
    setBorrowerNumber(borrowerNumber);
    return this;
  }
  
  public BorrowerSubset loanRegistryRecordList(List<LoanRegistryRecord> loanRegistryRecordList) {
    setLoanRegistryRecordList(loanRegistryRecordList);
    return this;
  }
  
  public boolean equals(Object o) {
    if (o == this)
      return true; 
    if (!(o instanceof BorrowerSubset))
      return false; 
    BorrowerSubset borrowerSubset = (BorrowerSubset)o;
    return (this.borrowerNumber == borrowerSubset.borrowerNumber && Objects.equals(this.loanRegistryRecordList, borrowerSubset.loanRegistryRecordList));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.borrowerNumber), this.loanRegistryRecordList });
  }
  
  public String toString() {
    return "{ borrowerNumber='" + 
      getBorrowerNumber() + "', loanRegistryRecordList='" + 
      getLoanRegistryRecordList() + "'}";
  }
}
