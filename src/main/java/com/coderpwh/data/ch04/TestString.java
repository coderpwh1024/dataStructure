package com.coderpwh.data.ch04;

/**
 * @author coderpwh
 */
public class TestString {


    public static void main(String[] args) {

        String str = "abcdefg";

       /* System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(6));*/

        TestString testString = new TestString();
        testString.test();




    }


    public void test() {

        String s = "commander";

        s.substring(3, 6);
        System.out.println(s.substring(3, 6));
        System.out.println(s.substring(0, 9));
        System.out.println(s.substring(8, 9));
        System.out.println(s.substring(3, 10));
        System.out.println(s.substring(9, 1));


    }


}
