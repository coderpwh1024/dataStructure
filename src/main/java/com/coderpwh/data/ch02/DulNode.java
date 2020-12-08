package com.coderpwh.data.ch02;

/****
 *  双向链表结点
 */
public class DulNode {

    public Object data;


    /***
     * 前驱结点引用
     */
    public DulNode prior;


    /***
     *  后驱结点引用
     */
    public DulNode next;


    public DulNode() {
        this.data = data;
        this.prior = prior;
        this.next = next;
    }

    public DulNode(Object data) {
        this.data = data;
    }
}
