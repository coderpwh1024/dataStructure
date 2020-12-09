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

    /***
     *  移除栈顶
     * @return
     */
    @Override
    public Object pop() {
        if (top == 0) {
            return null;
        } else {
            return stackElem[--top];
        }
    }

    /***
     *  如栈
     * @param object
     * @throws Exception
     */
    @Override
    public void push(Object object) throws Exception {
        if (top == stackElem.length) {
            throw new Exception("栈已满");
        } else {
            stackElem[top++] = object;
        }
    }

    @Override
    public void display() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stackElem[i].toString() + "");
        }
    }


}
