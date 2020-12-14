package com.coderpwh.data.ch03;

/***
 * 队列接口
 */
public interface IQueue {

    public void clear();

    public int length();


    public boolean isEmpty();

    /***
     *  查看队首元素
     * @return
     */
    public Object peek();


    /***
     *  出队
     * @return
     */
    public Object poll();


    /***
     *  入队
     * @param o
     * @throws Exception
     */
    public void offer(Object o) throws Exception;


    public void display();


}
