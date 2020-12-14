package com.coderpwh.data.ch03;

import com.sun.tools.corba.se.idl.constExpr.GreaterEqual;

/***
 *   循环顺序队列
 * @author coderpwh
 */
public class CircleSqQueue implements IQueue {


    private Object[] queueElem;

    /***
     *  队首的引用
     */
    private int front;

    /***
     *  队尾的引用
     */
    private int rear;


    public CircleSqQueue(int maxSize) {
        front = rear = 0;
        queueElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        front = rear = 0;
    }

    @Override
    public int length() {

        return (rear - front + queueElem.length) % queueElem.length;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public Object peek() {

        if (front == rear) {
            return null;
        } else {
            return queueElem[front];
        }
    }

    /***
     *  出队
     * @return
     */
    @Override
    public Object poll() {

        if (rear == front) {
            return null;
        } else {
            Object obj = queueElem[front];
            front = (front + 1) % queueElem.length;
            return obj;
        }
    }

    /***
     *  入队
     * @param o
     * @throws Exception
     */
    @Override
    public void offer(Object o) throws Exception {

        if ((rear + 1) % queueElem.length == front) {
            throw new Exception("此队列已满!");
        } else {
            queueElem[rear] = o;
            rear = (rear + 1) % queueElem.length;
        }


    }

    @Override
    public void display() {

        if (!isEmpty()) {
            for(int i=front;i!=rear;i=(i+1)%queueElem.length){
                System.out.print(queueElem[i]+" ");
            }

        } else {
            System.out.println("此队列为空!");
        }

    }


    public Object[] getQueueElem() {
        return queueElem;
    }

    public void setQueueElem(Object[] queueElem) {
        this.queueElem = queueElem;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }
}
