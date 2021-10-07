package com.blackknight.dmndemo.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.namespace.NamespaceContext;

public class SimpleNamespaceContext implements NamespaceContext {
  private final Map<String, String> PREF_MAP = new HashMap<>();
  
  public SimpleNamespaceContext(Map<String, String> prefMap) {
    this.PREF_MAP.putAll(prefMap);
  }
  
  public String getNamespaceURI(String prefix) {
    System.out.println("Using Prefix : " + prefix + " = " + (String)this.PREF_MAP.get(prefix));
    return this.PREF_MAP.get(prefix);
  }
  
  public String getPrefix(String uri) {
    throw new UnsupportedOperationException();
  }
  
  public Iterator getPrefixes(String uri) {
    throw new UnsupportedOperationException();
  }
}
