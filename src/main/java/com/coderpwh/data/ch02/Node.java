package com.coderpwh.data.ch02;

public class Node {

    /***
     *  结点值
     */
    public Object data;

    /***
     *  后续节点引用
     */
    public Node next;


     public Node(){
         this(null,null);
     }

     public Node(Object data){
         this(data,null);
     }


    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
