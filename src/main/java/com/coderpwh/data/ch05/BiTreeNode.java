package com.coderpwh.data.ch05;


/***
 *  二叉链式存储结构下的二叉树结点
 *
 */
public class BiTreeNode {


    public Object data;

    /**
     * 左结点
     */
    public BiTreeNode lchild;


    /**
     * 右结点
     */
    public BiTreeNode rchild;

    public BiTreeNode(Object data) {
        this(data, null, null);
    }

    public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }
}
