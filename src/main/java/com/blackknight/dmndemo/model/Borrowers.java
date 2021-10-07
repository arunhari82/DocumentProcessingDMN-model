package com.blackknight.dmndemo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"borrower"})
@XmlRootElement(name = "Borrowers")
public class Borrowers implements Serializable {
  @XmlElement(name = "Borrower")
  protected List<Borrower> borrower;
  
  public List<Borrower> getBorrower() {
    if (this.borrower == null)
      this.borrower = new ArrayList<>(); 
    return this.borrower;
  }
}
