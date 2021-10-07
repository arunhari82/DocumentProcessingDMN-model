package com.blackknight.dmndemo.service;

import java.lang.reflect.Method;

public class ClassTest {
  public static void main(String[] args) throws Exception {
    Class<?> c = Class.forName("com.blackknight.dmndemo.service.DocProcessUtil", true, Thread.currentThread().getContextClassLoader());
    Object obj = c.newInstance();
    String parameterType = "java.lang.String";
    Class<?>[] classes = new Class[] { Class.forName(parameterType, true, Thread.currentThread().getContextClassLoader()) };
    for (Method method : c.getMethods())
      System.out.println("Method   " + method.getName() + method.getParameterTypes().getClass()); 
  }
}
