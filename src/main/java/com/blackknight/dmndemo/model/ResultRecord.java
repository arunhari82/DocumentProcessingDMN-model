package com.blackknight.dmndemo.model;

import java.util.Objects;

public class ResultRecord {
  private String result;
  
  private double minnumber;
  
  public ResultRecord() {}
  
  public ResultRecord(String result, double minnumber) {
    this.result = result;
    this.minnumber = minnumber;
  }
  
  public String getResult() {
    return this.result;
  }
  
  public void setResult(String result) {
    this.result = result;
  }
  
  public double getMinnumber() {
    return this.minnumber;
  }
  
  public void setMinnumber(double minnumber) {
    this.minnumber = minnumber;
  }
  
  public ResultRecord result(String result) {
    setResult(result);
    return this;
  }
  
  public ResultRecord minnumber(double minnumber) {
    setMinnumber(minnumber);
    return this;
  }
  
  public boolean equals(Object o) {
    if (o == this)
      return true; 
    if (!(o instanceof ResultRecord))
      return false; 
    ResultRecord resultRecord = (ResultRecord)o;
    return (Objects.equals(this.result, resultRecord.result) && this.minnumber == resultRecord.minnumber);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.result, Double.valueOf(this.minnumber) });
  }
  
  public String toString() {
    return "{ result='" + 
      getResult() + "', minnumber='" + 
      getMinnumber() + "'}";
  }
}
