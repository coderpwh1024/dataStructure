package com.coderpwh.data.ch03;

/****
 *
 *  栈的接口
 *
 */
public interface IStack {


    public void clear();

    public boolean isEmpty();

    public int length();

    /***
     *  查看栈顶对象
     * @return
     */
    public Object peek();


    /***
     *  移除栈顶对象
     * @return
     */
    public Object pop();

    /***
     *   入栈
     * @param object
     * @throws Exception
     */
    public void push(Object object) throws Exception;


    public void display();

}
