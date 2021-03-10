package com.coderpwh.data.ch04;

/**
 * @author coderpwh
 */
public class Example4_3 {

    public static void main(String[] args) {

        char[] chararray = {'W', 'O', 'R', 'l', 'd'};

        SeqString s1 = new SeqString();
        SeqString s2 = new SeqString("Hello");
        SeqString s3 = new SeqString(chararray);

        System.out.println("串 s1=" + s1 + ",s2=" + s2 + ",s3=" + s3);
        s1.insert(0, s2);
        System.out.println("串s1在第0个字符前插入串s2后,s1=" + s1);
        s1.insert(1, s3);
        System.out.println("串1在第一个字符前插入s3后,s1=" + s1);
        s1.delete(1, 4);
        System.out.println("串s1删除第1到3个字符后，s1=" + s1);
        System.out.println("串s1中从第2个字符到第5个字符组成的子串是:" + s1.substring(2, 6));

    }


}
