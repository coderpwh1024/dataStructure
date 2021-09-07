package com.coderpwh.data.ch05;

public class Example5_5 {

    public static void main(String[] args) {

        String preOrder = "ABDEGCFH";

        String inOrder = "DBGEAFHC";

        BiTree biTree = new BiTree();

        BiTree T = new BiTree(preOrder, inOrder, 0, 0, preOrder.length());


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


        System.out.println("");
        System.out.println("-------------------------------------------");
        Example5_5 example = new Example5_5();
        BiTree node = example.test();

        BiTreeNode root = node.getRoot();

        System.out.println("先根遍历:");
        biTree.preRootTraverse(root);
        System.out.println();

        System.out.println("中根遍历:");
        biTree.intRootTraverse(root);
        System.out.println();

        System.out.println("后根遍历:");
        biTree.postRootTraverse(root);
        System.out.println();


    }

    public BiTree test() {


        BiTreeNode G = new BiTreeNode("G");
        BiTreeNode E = new BiTreeNode("E", G, null);

        BiTreeNode D = new BiTreeNode("D");

        BiTreeNode B = new BiTreeNode("B", D, E);


        BiTreeNode H = new BiTreeNode("H");
        BiTreeNode F = new BiTreeNode("F", null, H);

        BiTreeNode C = new BiTreeNode("C", F, null);

        BiTreeNode A = new BiTreeNode("A", B, C);

        return new BiTree(A);

    }


}
