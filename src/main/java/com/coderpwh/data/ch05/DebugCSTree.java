package com.coderpwh.data.ch05;

public class DebugCSTree {

    public static void main(String[] args) {

        DebugCSTree debugCSTree = new DebugCSTree();
        CSTree csTree = debugCSTree.createBiTree();

        CSTreeNode root = csTree.getRoot();

        System.out.println("该树的先根遍历为:");
        csTree.preRootTraverse(root);

        System.out.println();
        System.out.println("该树的后根遍历为:");
        csTree.postRootTraverse(root);


        System.out.println();
        System.out.println("该树的层次遍历为:");
        csTree.levelTraverse();

    }


    public CSTree createBiTree() {
        CSTreeNode D = new CSTreeNode('D');
        CSTreeNode E = new CSTreeNode('E');
        CSTreeNode C = new CSTreeNode('C', D, E);
        CSTreeNode B = new CSTreeNode('B', null, C);
        CSTreeNode A = new CSTreeNode('A', B, null);
        return new CSTree(A);
    }


}
