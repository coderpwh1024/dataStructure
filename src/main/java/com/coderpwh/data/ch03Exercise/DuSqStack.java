package com.coderpwh.data.ch03Exercise;

public class DuSqStack {

    private Object[] stackElem;
    private int top0;
    private int top1;
    private int base0;
    private int base1;


    public DuSqStack(int maxSize) {
        stackElem = new Object[maxSize];
        top0 = base0 = 0;
        top1 = base1 = maxSize - 1;
    }

    /***
     * 入栈
     * @param X
     * @param i
     * @throws Exception
     */
    public void push(Object X, int i) throws Exception {
        if (top0 > top1) {
            throw new Exception("栈已满");
        } else if (i == 0) {
            stackElem[top0++] = X;
        } else if (i == 1) {
            stackElem[top1--] = X;
        }
    }


    /***
     *  出栈
     * @param i
     * @return
     * @throws Exception
     */
    public Object pop(int i) throws Exception {
        Object x = null;
        if (i == 0) {
            if (top0 == base0) {
                throw new Exception("第0号栈为空");
            } else {
                x = stackElem[--top0];
            }
        } else if (i == 1) {
            if (top1 == base1) {
                throw new Exception("第0号栈为空");
            } else {
                x = stackElem[++top1];
            }
        }
        return x;
    }

    public void display(int i) {

        if (i == 0) {
            for (int j = top0 - 1; j > 0; j--) {
                System.out.print(stackElem[j] + " ");
                System.out.println();
            }
        } else if (i == 1) {
             for(int j=top1;j<stackElem.length;j++){
                 System.out.println(stackElem[j]+" ");
                 System.out.println();
             }
        }
    }


}
