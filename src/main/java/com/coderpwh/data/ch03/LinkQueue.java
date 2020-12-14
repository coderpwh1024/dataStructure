package com.coderpwh.data.ch03;

import com.coderpwh.data.ch02.Node;

/**
 * @author coderpwh
 */
public class LinkQueue implements IQueue {

    /***
     * 队头
     */
    private Node front;

    /***
     * 队尾
     */
    private Node rear;


    public LinkQueue() {
        front = rear = null;
    }

    @Override
    public void clear() {
        front = rear = null;
    }

    @Override
    public int length() {
        Node p = front;
        int lenght = 0;
        while (p != null) {
            p = p.next;
            lenght++;
        }

        return lenght;
    }

    @Override
    public boolean isEmpty() {

        return front == null;
    }

    /***
     *  查看队首元素
     * @return
     */
    @Override
    public Object peek() {
        Node p = front;
        if (p != null) {
            return p.data;
        } else {
            return null;
        }
    }

    /***
     *  出队
     * @return
     */
    @Override
    public Object poll() {

        if (front != null) {
            Node p = front;
            front = front.next;
            if (p == rear) {
                rear = null;
            }
            return p.data;
        } else {
            return null;
        }
    }


    /***
     *  入队
     * @param o
     * @throws Exception
     */
    @Override
    public void offer(Object o) throws Exception {
        Node p = new Node(o);
        if (front != null) {
            rear.next = p;
            rear = p;
        } else {
            front = rear = p;
        }

    }

    @Override
    public void display() {

        if (!isEmpty()) {
            Node p = front;
            while (p != rear.next) {
                System.out.print(p.data.toString() + " ");
                p = p.next;
            }
        } else {
            System.out.println("此队列为空");
        }


    }


}
