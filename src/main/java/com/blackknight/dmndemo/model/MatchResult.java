package com.blackknight.dmndemo.model;

import java.util.Objects;

public class MatchResult {
  private int borrowerNumber;
  
  private ResultRecord resultRec;
  
  public MatchResult() {}
  
  public MatchResult(int borrowerNumber, ResultRecord resultRec) {
    this.borrowerNumber = borrowerNumber;
    this.resultRec = resultRec;
  }
  
  public int getBorrowerNumber() {
    return this.borrowerNumber;
  }
  
  public void setBorrowerNumber(int borrowerNumber) {
    this.borrowerNumber = borrowerNumber;
  }
  
  public ResultRecord getResultRec() {
    return this.resultRec;
  }
  
  public void setResultRec(ResultRecord resultRec) {
    this.resultRec = resultRec;
  }
  
  public MatchResult borrowerNumber(int borrowerNumber) {
    setBorrowerNumber(borrowerNumber);
    return this;
  }
  
  public MatchResult resultRec(ResultRecord resultRec) {
    setResultRec(resultRec);
    return this;
  }
  
  public boolean equals(Object o) {
    if (o == this)
      return true; 
    if (!(o instanceof MatchResult))
      return false; 
    MatchResult matchResult = (MatchResult)o;
    return (this.borrowerNumber == matchResult.borrowerNumber && Objects.equals(this.resultRec, matchResult.resultRec));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.borrowerNumber), this.resultRec });
  }
  
  public String toString() {
    return "{ borrowerNumber='" + 
      getBorrowerNumber() + "', resultRec='" + 
      getResultRec() + "'}";
  }
}
