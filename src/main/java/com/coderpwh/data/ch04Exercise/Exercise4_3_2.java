package com.coderpwh.data.ch04Exercise;

import com.coderpwh.data.ch04.SeqString;

/**
 * @author coderpwh
 */
public class Exercise4_3_2 extends SeqString {


    public static void main(String[] args) {

    }


    public SeqString replace(int begin, SeqString s1, SeqString s2) {
        if (s1 == null || s2 == null) {
            return null;
        }
        SeqString ss = new SeqString("");
        SeqString source = this;
        int index = -1;
        while ((index = source.indexOf(s1, begin)) != -1) {
            ss.concat(source.substring(0, index));
            ss.concat(s2);
//            source = (SeqString) source.substring(index + s1.length());
        }
        ss.concat(source);
        return ss;


    }


}
