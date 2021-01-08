package com.coderpwh.data.ch03Exercise;


import com.coderpwh.data.ch03.SqStack;

/***
 * 1.编写一个函数，要求借助一个栈把一个数组中的数据元素逆置。
 */
public class Exercise3_3_1 {

    public static void main(String[] args) throws Exception {

        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Exercise3_3_1 exercise = new Exercise3_3_1();

        System.out.println("元素逆置之前的数据为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("元素逆置之后的数据为:");
        exercise.reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }


    public void reverse(Object[] a) throws Exception {

        SqStack sqStack = new SqStack(a.length);

        for (int i = 0; i < a.length; i++) {
            sqStack.push(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = sqStack.pop();
        }

    }


}
