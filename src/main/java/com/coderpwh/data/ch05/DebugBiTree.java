package com.coderpwh.data.ch05;

/**
 * @author coderpwh
 */
public class DebugBiTree {


    public BiTree createBiTree() {
        BiTreeNode d = new BiTreeNode('D');
        BiTreeNode g = new BiTreeNode('G');
        BiTreeNode h = new BiTreeNode('H');
        BiTreeNode e = new BiTreeNode('E', g, null);
        BiTreeNode b = new BiTreeNode('B', d, e);
        BiTreeNode f = new BiTreeNode('F', null, h);
        BiTreeNode c = new BiTreeNode('C', f, null);
        BiTreeNode a = new BiTreeNode('A', b, c);
        return new BiTree(a);
    }


    public static void main(String[] args) {

        DebugBiTree debugBiTree = new DebugBiTree();
        BiTree biTree = debugBiTree.createBiTree();

        // 根结点
        BiTreeNode root = biTree.getRoot();

        System.out.println("递归--先根遍历序列为:");
        biTree.preRootTraverse(root);
        System.out.println();

        System.out.println("非递归--先根遍历序列为:");
        biTree.preRootTraverse();
        System.out.println();


        System.out.println("递归中跟遍历序列为:");
        biTree.intRootTraverse(root);
        System.out.println();

        System.out.println("非递归中跟遍历序列为:");
        biTree.intRootTraverse();
        System.out.println();

        System.out.println("递归后根遍历序列为:");
        biTree.postRootTraverse(root);
        System.out.println();

        System.out.println("非递归后根遍历序列为:");
        biTree.postRootTraverse();
        System.out.println();

        System.out.println("层次遍历序列为:");
        biTree.levelTraverse();
        System.out.println();


    }


}
