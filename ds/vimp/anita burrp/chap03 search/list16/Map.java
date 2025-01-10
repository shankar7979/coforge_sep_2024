//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap03\list16\Map.java

package chap03.list16;

public interface Map {
    public String get(String key);
    public String put(String key, String value);
    public int size();
    public String toString();
}
