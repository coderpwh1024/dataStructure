package com.coderpwh.data.ch05;


/***
 * 二叉链式存储结构的树结点
 */
public class CSTreeNode {

    public Object data;

    public CSTreeNode firstchild;

    public CSTreeNode nextsibling;

    public CSTreeNode() {
    }

    public CSTreeNode(Object data) {
        this.data = data;
    }


    public CSTreeNode(Object data, CSTreeNode firstchild, CSTreeNode nextsibling) {
        this.data = data;
        this.firstchild = firstchild;
        this.nextsibling = nextsibling;
    }


}
