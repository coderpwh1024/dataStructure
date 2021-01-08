package com.coderpwh.data.ch03Exercise;

import com.coderpwh.data.ch03.SqStack;

/**
 * 2.编写一个函数判断一个字符序列是否为回文序列，所谓回文序列就是正读与反读都相同的字符序列，例如：abba和abdba均是回文序列。要求只使用栈来实现。
 *
 * @author coderpwh
 */
public class Exercise3_3_2 {

    public static void main(String[] args) throws Exception {

        Exercise3_3_2 exercise = new Exercise3_3_2();


        System.out.println(exercise.stringFlag("abba"));


    }


    public boolean stringFlag(String str) throws Exception {
        SqStack sqStack = new SqStack(str.length());

        for (int i = 0; i < str.length(); i++) {
            sqStack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = (Character) (sqStack.pop());
            if (ch != str.charAt(i)) {
                return false;
            }
        }


        return true;
    }

}
