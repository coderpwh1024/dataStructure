package com.coderpwh.data.ch03;

import com.coderpwh.data.ch02.Node;

/**
 * 链栈
 *
 * @author coderpwh
 */
public class LinkStack implements IStack {

    private Node top;

    @Override
    public void clear() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }


    /***
     *  链栈的长度
     * @return
     */
    @Override
    public int length() {
        Node p = top;
        int lenght = 0;
        while (p != null) {
            p = p.next;
            ++lenght;
        }
        return lenght;
    }

    /***
     *  获取栈顶元素
     * @return
     */
    @Override
    public Object peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            return null;
        }
    }

    /***
     *  出栈
     * @return
     */
    @Override
    public Object pop() {

        if (isEmpty()) {
            return null;
        } else {
            Node p = top;
            top = top.next;
            return p.data;
        }
    }

    /***
     *  入栈
     * @param object
     * @throws Exception
     */
    @Override
    public void push(Object object) throws Exception {
        Node p = new Node(object);
        p.next = top;
        // 栈顶结点
        top = p;
    }

    @Override
    public void display() {
        Node p = top;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
}
