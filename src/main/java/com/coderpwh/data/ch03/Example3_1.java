package com.coderpwh.data.ch03;

import java.util.Scanner;

/**
 * @author coderpwh
 */
public class Example3_1 {

    private static final int LEFT = 0;

    private static final int RIGHT = 1;

    private static final int OTHER = 2;


    public int verifyFlag(String str) {
        if ("(".equals(str) || "[".equals(str) || "{".equals(str) || "/*".equals(str)) {
            return LEFT;
        } else if (")".equals(str) || "]".equals(str) || "}".equals(str) || "*/".equals(str)) {
            return RIGHT;
        } else {
            return OTHER;
        }
    }

    public boolean matches(String str1, String str2) {
        if (("(".equals(str1) && ")".equals(str2))
                || ("[".equals(str1) && "]".equals(str2))
                || ("{".equals(str1) && "}".equals(str2))
                || ("/*".equals(str1) && "*/".equals(str2))) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isLegal(String str) throws Exception {

        if (!"".equals(str) && str != null) {
            SqStack S = new SqStack(100);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                String t = String.valueOf(c);

                if (i != length) {
                    if (('/' == c && '*' == str.charAt(i + 1)) || ('*' == c && '/' == str.charAt(i + 1))) {
                        t = t.concat(String.valueOf(str.charAt(i + 1)));
                        ++i;
                    }
                }
                if (LEFT == verifyFlag(t)) {
                    S.push(t);
                } else if (RIGHT == verifyFlag(t)) {
                    if (S.isEmpty() || !matches(S.pop().toString(), t)) {
                        throw new Exception("错误:Java语句不合法!");
                    }
                }
            }

            if (!S.isEmpty()) {
                throw new Exception("错误:Java语句不合法!");
            }
            return true;

        } else {
            throw new Exception("错误:Java语句不合法!");
        }

    }

    public static void main(String[] args) throws Exception {
        Example3_1 e = new Example3_1();
        System.out.println("请输入Java语句:");
        Scanner sc = new Scanner(System.in);
        if (e.isLegal(sc.nextLine())) {
            System.out.println("Java语句合法!");
        } else {
            System.out.println("错误：Java语句不合法！");
        }

    }


}
