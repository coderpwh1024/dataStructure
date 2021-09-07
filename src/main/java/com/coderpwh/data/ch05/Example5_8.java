package com.coderpwh.data.ch05;

public class Example5_8 {

    public static void main(String[] args) {


        // 中根
        String inOrder = "DBGEAFHC";


        // 后根
        String postOrder = "DGEBHFCA";

        BiTree biTree = new BiTree();

        BiTree T = new BiTree(postOrder, inOrder, postOrder.length()-1, postOrder.length()-1, postOrder.length());

//        BiTree T = new BiTree(0, postOrder.length() - 1, postOrder.length(), inOrder, postOrder);





        System.out.println("先根遍历方式:");
        biTree.preRootTraverse(T.getRoot());


        System.out.println();
        System.out.println("中根遍历方式:");
        T.intRootTraverse();


        System.out.println();
        System.out.println("中根递归方式遍历:");
        biTree.intRootTraverse(T.getRoot());


        System.out.println();
        System.out.println("后根遍历方式:");
        T.postRootTraverse();


        System.out.println();
        System.out.println("后根递归方式");
        biTree.postRootTraverse(T.getRoot());


    }


}
