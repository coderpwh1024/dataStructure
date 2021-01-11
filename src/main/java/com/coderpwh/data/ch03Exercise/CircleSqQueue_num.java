package com.coderpwh.data.ch03Exercise;

/**
 * @author coderpwh
 */
public class CircleSqQueue_num {

    private Object[] queueElem;

    /***
     *  队首位置
     */
    private int front;

    /***
     * 队尾位置
     */
    private int rear;


    private int num;

    public CircleSqQueue_num(int maxSize) {
        num = 0;
        front = rear = 0;
        queueElem = new Object[maxSize];

    }

    /***
     * 入队
     * @param x
     * @throws Exception
     */
    public void offer(Object x) throws Exception {
        if (num == queueElem.length) {
            throw new Exception("队列已满");
        } else {
            queueElem[rear] = x;
            rear = (rear + 1) % queueElem.length;
            ++num;
        }
    }

    /***
     *  出队
     * @return
     */
    public Object poll() {
        if (num == 0) {
            return null;
        } else {
            Object t = queueElem[front];
            front = (front + 1) % queueElem.length;
            --num;
            return t;
        }
    }

    public void display() {
        if (num != 0) {
            for (int i = 0; i != (front + num) % queueElem.length; i = (i + 1) % queueElem.length) {
                System.out.print(queueElem[i].toString() + " ");
            }
        } else {
            System.out.println("队列为空!");
        }
    }

}
