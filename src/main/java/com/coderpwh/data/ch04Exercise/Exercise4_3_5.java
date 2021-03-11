package com.coderpwh.data.ch04Exercise;

import com.coderpwh.data.ch04.SeqString;

/**
 * @author coderpwh
 */
public class Exercise4_3_5 extends SeqString {

    SeqString curstr;


    public static void main(String[] args) {
        String str = "too be or not too be,that is the question.";

        String s = "too";
        Exercise4_3_5 exe = new Exercise4_3_5(str);
        int count = exe.stringCount(new SeqString(s));
        System.out.println("原字符串为:" + str);
        System.out.println("字符串为:" + s);
        System.out.println("个数为:" + count);


    }


    public Exercise4_3_5(String str) {
        super(str);
        this.curstr = new SeqString(str);
    }

    public int stringCount(SeqString str) {
        SeqString source = this.curstr;
        int index = -1;
        int begin = 0;
        int count = 0;

        while ((index = source.indexOf(str, begin)) != -1) {
            count++;
            begin = index + str.length();
        }
        return count;

    }
}
