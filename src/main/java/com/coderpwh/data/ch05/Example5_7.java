package com.coderpwh.data.ch05;

public class Example5_7 {

    public static void main(String[] args) {

        Example5_7 example = new Example5_7();

        String sqBiTree = "ABCDEFGH";

        BiTreeNode root = example.createBiTree(sqBiTree, 0);

        BiTree T = new BiTree(root);

        System.out.println("先根遍历方式: ");
        T.preRootTraverse();
        System.out.println();


        System.out.println("中根遍历方式: ");
        T.intRootTraverse();
        System.out.println();


        System.out.println("后根遍历方式: ");
        T.postRootTraverse();
        System.out.println();


        Example5_3 e = new Example5_3();
        System.out.println("树的深度为:" + e.getDepth(root));

    }


    public BiTreeNode createBiTree(String sqBiTree, int index) {

        BiTreeNode root = null;

        if (index < sqBiTree.length()) {
            root = new BiTreeNode(sqBiTree.charAt(index));

            root.lchild = createBiTree(sqBiTree, 2 * index + 1);
            root.rchild = createBiTree(sqBiTree, 2 * index + 2);
        }
        return root;
    }


}
