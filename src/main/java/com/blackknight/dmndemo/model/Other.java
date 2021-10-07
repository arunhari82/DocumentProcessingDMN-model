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
@XmlType(name = "", propOrder = {"undisclosedDebtActivity"})
@XmlRootElement(name = "Other")
public class Other implements Serializable {
  @XmlElement(name = "UndisclosedDebtActivity")
  protected List<UndisclosedDebtActivity> undisclosedDebtActivity;
  
  public List<UndisclosedDebtActivity> getUndisclosedDebtActivity() {
    if (this.undisclosedDebtActivity == null)
      this.undisclosedDebtActivity = new ArrayList<>(); 
    return this.undisclosedDebtActivity;
  }
}
