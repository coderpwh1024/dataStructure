package com.coderpwh.data.ch05;

/***
 *
 *  实现两个二叉树是否相等
 */
public class Example5_4 {

    public static void main(String[] args) {


        BiTreeNode node1 = new BiTreeCreator().createBiTree().getRoot();

        BiTreeNode node2 = new BiTreeCreator().createBiTree2().getRoot();


        Example5_4 example = new Example5_4();

        System.out.println(example.isEqual(node1, node2));

        System.out.println(example.isEqual(node1,node1));


    }


    public boolean isEqual(BiTreeNode node1, BiTreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null) {
            return (node1.data.equals(node2.data)) && isEqual(node1.lchild, node2.lchild) && isEqual(node1.rchild, node2.rchild);

        } else {
            return false;
        }
    }


}
