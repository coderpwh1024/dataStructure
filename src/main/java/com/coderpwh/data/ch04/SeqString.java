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


    /***
     *  String  扩容 方法
     * @param newCapacity
     */
    public void allocate(int newCapacity) {
        char[] temp = strvalue;
        strvalue = new char[newCapacity];
        for (int i = 0; i < temp.length; i++) {
            strvalue[i] = temp[i];
        }
    }


    /***
     *   string insert 操作
     * @param offset
     * @param str
     * @return
     */
    @Override
    public IString insert(int offset, IString str) {
        if ((offset < 0) || (offset > this.curlen)) {
            throw new StringIndexOutOfBoundsException("插入位置不合法!");
        }
        int len = str.length();
        int newCount = this.curlen + len;
        if (newCount > strvalue.length) {
            allocate(newCount);
        }
        for (int i = this.curlen - 1; i >= offset; i--) {
            strvalue[len + i] = strvalue[i];
        }

        for (int i = 0; i < len; i++) {
            strvalue[offset + i] = str.charAt(i);
        }
        this.curlen = newCount;
        return this;
    }

    /***
     *  string
     * @param begin
     * @param end
     * @return
     */
    public IString delete(int begin, int end) {
        if (begin < 0) {
            throw new StringIndexOutOfBoundsException("起始位置不能小于0");
        }
        if (end > curlen) {
            throw new StringIndexOutOfBoundsException("结束位置不能大于串的当前长度:" + curlen);
        }
        for (int i = 0; i < curlen - end; i++) {
            strvalue[begin + i] = strvalue[end + i];
        }
        curlen = curlen - (end - begin);
        return this;
    }


    /***
     *   拼接字符串
     * @param str
     * @return
     */
    public IString concat(IString str) {
        return insert(curlen, str);
    }

    /***
     *  字符串拼接
     * @param c
     * @return
     */
    public IString concat(char c) {
        int newCount = curlen + 1;
        if (newCount > strvalue.length) {
            allocate(newCount);
        }
        strvalue[curlen++] = c;
        return this;
    }


    @Override
    public String toString() {
        return new String(strvalue, 0, curlen);
    }

    public int compareTo(IString str) {
        return compareTo((SeqString) str);
    }


    /****
     *
     *  compareTo 比较
     *
     *
     * @param str
     * @return
     */
    public int compareTo(SeqString str) {

        int len1 = curlen;
        int len2 = str.curlen;
        int n = Math.min(len1, len2);

        for (int k = 0; k < n; k++) {
            if (strvalue[k] != str.strvalue[k]) {
                return (strvalue[k] - str.strvalue[k]);
            }
        }
        return len1 - len2;
    }


    /****
     *
     *  简单模式匹配
     *
     *   主串: aaaaaaaaaaab
     *   子串:  aaab
     *   start=0; 9
     *   (aab,9) 满足 if
     *   (aab,0) 满足 else
     *
     *
     * @param t
     * @param start
     * @return
     */
    public int index_BF(SeqString t, int start) {

        if (this != null && t != null && t.length() > 0 && this.length() >= t.length()) {
            int slen = this.length();
            int tlen = t.length();
            int i = start;
            int j = 0;
            while ((i < slen) && (j < tlen)) {
                if (this.charAt(i) == t.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i = i - j + 1;
                    j = 0;
                }
                if (j >= t.length()) {
                    return i - tlen;
                } else {
                    return -1;
                }

            }

        }
        return -1;
    }


    public int indexOf(IString t, int start) {
        return index_KMP(t, start);
    }


    public int index_KMP(IString T, int start) {

        int[] next = getNext(T);
        int i = start;
        int j = 0;
        while (i < this.length() && j < T.length()) {
            if (j == -1 || this.charAt(i) == T.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j < T.length()) {
            return -1;
        } else {
            return (i - T.length());
        }

    }


    protected int[] getNext(IString T) {
        int[] next = new int[T.length()];
        int j = 1;
        int k = 0;
        next[0] = -1;
        if (T.length() > 1) {
            next[1] = 0;
        }
        while (j < T.length() - 1) {
            if (T.charAt(j) == T.charAt(k)) {
                next[j + 1] = k + 1;
                j++;
                k++;
            } else if (k == 0) {
                next[j + 1] = 0;
                j++;
            } else {
                k = next[k];
            }

        }

        return next;
    }


}

