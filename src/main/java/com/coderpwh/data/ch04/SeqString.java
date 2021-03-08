package com.coderpwh.data.ch04;

/**
 * 顺序串的操作
 *
 * @author coderpwh
 */
public class SeqString implements IString {


    private char[] strvalue;

    private int curlen;


    /***
     *  构造空串
     */
    public SeqString() {
        strvalue = new char[0];
        curlen = 0;

    }

    /***
     *  字符串常量构造对象
     * @param str
     */
    public SeqString(String str) {
        if (str != null) {
            char[] tempchararry = str.toCharArray();
            strvalue = tempchararry;
            curlen = tempchararry.length;
        }
    }


    public SeqString(char[] value) {
        this.strvalue = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            this.strvalue[i] = value[i];
        }
        curlen = value.length;
    }


    @Override
    public void clear() {

        this.curlen = 0;
    }

    @Override
    public boolean isEmpty() {
        return curlen == 0;
    }

    @Override
    public int length() {
        return curlen;
    }

    @Override
    public char charAt(int index) {

        if (index < 0 || index >= curlen) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return strvalue[index];

    }

    /***
     *   截取子串
     * @param begin
     * @param end
     * @return
     */
    @Override
    public IString substring(int begin, int end) {
        if (begin < 0) {
            throw new StringIndexOutOfBoundsException("起始位置不能小于0");
        }
        if (end > curlen) {
            throw new StringIndexOutOfBoundsException("结束位置不能大于串的当前长度:" + curlen);
        }
        if (begin > end) {
            throw new StringIndexOutOfBoundsException("开始位置不能大于结束位置");
        }
        if (begin == 0 && end == curlen) {
            return this;
        } else {
            char[] buffer = new char[end - begin];
            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = this.strvalue[i + begin];
            }
            return new SeqString(buffer);
        }
    }

    @Override
    public IString insert(int offset, IString str) {
        return null;
    }


}
