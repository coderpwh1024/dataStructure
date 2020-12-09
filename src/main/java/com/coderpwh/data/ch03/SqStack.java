package com.coderpwh.data.ch03;

/***
 *  顺序栈
 */
public class SqStack implements IStack {


    private Object[] stackElem;

    private int top;


    public SqStack(int maxSize) {
        stackElem = new Object[maxSize];
        top = 0;
    }


    @Override
    public void clear() {

        top = 0;
    }

    @Override
    public boolean isEmpty() {

        return top == 0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public Object peek() {

        if (!isEmpty()) {
            return stackElem[top - 1];
        } else {
            return null;
        }

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public void push(Object object) throws Exception {

    }

    @Override
    public void display() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stackElem[i].toString() + "");
        }
    }


}
