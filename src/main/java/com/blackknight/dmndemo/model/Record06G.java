package com.blackknight.dmndemo.model;

import java.io.Serializable;
import java.util.Objects;

public class Record06G implements Serializable {
  private String address;
  
  private String type;
  
  public Record06G() {}
  
  public Record06G(String address, String type) {
    this.address = address;
    this.type = type;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public Record06G address(String address) {
    setAddress(address);
    return this;
  }
  
  public Record06G type(String type) {
    setType(type);
    return this;
  }
  
  public boolean equals(Object o) {
    if (o == this)
      return true; 
    if (!(o instanceof Record06G))
      return false; 
    Record06G record06G = (Record06G)o;
    return (Objects.equals(this.address, record06G.address) && Objects.equals(this.type, record06G.type));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.address, this.type });
  }
  
  public String toString() {
    return "{ address='" + 
      getAddress() + "', type='" + 
      getType() + "'}";
  }
}
