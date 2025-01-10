//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list17\ArrayMap.java

package chap03.list17;

import chap03.list16.Map;

public class ArrayMap implements Map {
  private static final int INITIAL_LENGTH=10;
  private Entry[] a = new Entry[INITIAL_LENGTH];
  private int size;
  
  public String get(String key) {
    for (int i=0; i<size; i++)
      if (a[i].key.equals(key)) return a[i].value;
    return null;
  }
  
  public String put(String key, String value) {
    for (int i=0; i<size; i++)
      if (a[i].key.equals(key)) return a[i].setValue(value);
    if (size==a.length) resize();
    a[size++] = new Entry(key,value);
    return null;
  }

  private void resize() {
    Entry[] aa = new Entry[2*a.length];
    System.arraycopy(a,0,aa,0,a.length);
    a = aa;
  }

  public int size() {
    return size;
  }

  public String toString() {
    StringBuffer buf = new StringBuffer();
    for (int i=0; i<size; i++)
      buf.append(a[i] + "\n");
    return buf.toString();
  }

  private static class Entry {
    String key, value;

    public Entry(String key, String value) {
      this.key = key;
      this.value = value;
    }

    public String setValue(String value) {
      String oldValue = this.value;
      this.value = value;
      return oldValue;
    }
        
    public String toString() {
      return key + ": " + value;
    }
  }
}