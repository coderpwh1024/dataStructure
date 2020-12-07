package com.coderpwh.data.ch02;

public interface Ilist {

     public void clear();

     public boolean isEmpty();

     public int length();

     public Object get (int i)throws Exception;

     public void insert(int i,Object x);

     public void remove(int i);

     public int indexOf(Object c);

     public void display();

}
