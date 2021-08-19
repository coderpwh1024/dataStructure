package com.coderpwh.data.ch05;

public class Example5_6 {

    public static void main(String[] args) {

        String preStr="AB##CD###";

        BiTree T = new BiTree(preStr);

        System.out.println("先根遍历方式: ");
        T.preRootTraverse();
        System.out.println();


        System.out.println("中根遍历方式: ");
        T.intRootTraverse();
        System.out.println();

        System.out.println("后根遍历方式: ");
        T.postRootTraverse();
        System.out.println();


    }
}
