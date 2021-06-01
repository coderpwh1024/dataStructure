package com.coderpwh.data.ch05;

public class Example5_1 {


    public BiTreeNode searchNode(BiTreeNode T, Object x) {

        if (T != null) {
            if (T.data.equals(x)) {
                return T;
            } else {
                BiTreeNode lresult = searchNode(T.lchild, x);
                return lresult != null ? lresult : searchNode(T.rchild, x);
            }

        }

        return null;
    }

    public static void main(String[] args) {

        BiTree biTree = new BiTreeCreator().createBiTree();

        BiTreeNode root = biTree.getRoot();

        Example5_1 e = new Example5_1();
        if (e.searchNode(root, 'B') != null) {
            System.out.println("树中包含数据指点元素值的结点为:" + e.searchNode(root, 'B').data);
        } else {
            System.out.println("树中不包含数据指定元素值的结点!");
        }

    }


}
