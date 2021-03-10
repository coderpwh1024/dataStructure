package com.coderpwh.data.ch04Exercise;

import com.coderpwh.data.ch04.SeqString;

/**
 * @author coderpwh
 */
public class Exercise4_3_3 extends SeqString {


    public Exercise4_3_3(String str) {
        super(str);
    }

    public static void main(String[] args) {
        String str1 = "too be or not too be,that is the question";
        Exercise4_3_3 sstr = new Exercise4_3_3(str1);
        System.out.println("原字符串为 " + str1);
        System.out.println("反转后的字符串为 " + sstr.reverse());
    }


    public SeqString reverse() {
        for (int i = 0, j = this.length() - 1; i < j; i++, j--) {
            char temp = this.charAt(i);
            setCharAt(i, this.charAt(j));
            setCharAt(j, temp);
        }
        return this;
    }


}
