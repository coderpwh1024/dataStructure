package com.coderpwh.data.ch04Exercise;

import com.coderpwh.data.ch04.SeqString;

/**
 * @author coderpwh
 */
public class Exercise4_3_4 extends SeqString {

    public Exercise4_3_4(String str) {
        super(str);
    }

    public static void main(String[] args) {
        String str = "too be or not too be,that is the question.";

        Exercise4_3_4 e = new Exercise4_3_4(str);
        System.out.println("原字符为:" + str);
        char ch = 'o';
        SeqString s = e.deleteAllChar(ch);
        System.out.println("删除的字符为:" + ch);
        System.out.println("删除后的字符为:" + s);


    }


    public SeqString deleteAllChar(char ch) {
        SeqString s = new SeqString(String.valueOf(ch));

        if (s == null) {
            return null;
        }

        SeqString ss = new SeqString("");
        SeqString source = this;
        int index = -1;

        while ((index = source.indexOf(s, 0)) != -1) {

            ss.concat(source.substring(0, index));
            source = (SeqString) source.substring(index + 1);

        }
        ss.concat(source);
        return ss;
    }


}
