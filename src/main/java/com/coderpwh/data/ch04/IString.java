package com.coderpwh.data.ch04;

/**
 * @author coderpwh
 */
public interface IString {

    public void clear();

    public boolean isEmpty();

    public int length();

    public char charAt(int index);

    public IString substring(int begin, int end);

    public IString insert(int offset, IString str);

}
