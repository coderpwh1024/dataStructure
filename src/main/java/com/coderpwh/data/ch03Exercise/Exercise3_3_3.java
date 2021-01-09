package com.coderpwh.data.ch03Exercise;

/****
 *  3.在一个数组S中保存两个栈：一个栈以数组的第一个存储单元作为栈底，另一个栈以数组的最后一个存储单元作为栈底,即S为一个双向栈。
 * 试分别编写入栈push(X,i)和出栈pop(i)操作的函数。
 * 其中：push(X,i)表示将数据元素X压入到S中的第i(i=0或1)号栈中；pop(i)表示将S中第i号栈的栈顶元素出栈。
 *  *
 */
public class Exercise3_3_3 {

    public static void main(String[] args) throws Exception {
        Integer[] a = {1, 3, 5, 7, 9};
        Integer[] b = {2, 4, 6, 8, 10};
        //构造一个容量为100的双向栈对象
        DuSqStack s = new DuSqStack(100);
        for (int i = 0; i < a.length; i++) {
            s.push(a[i], 0);
        }
        for (int i = 0; i < a.length; i++) {
            s.push(b[i], 1);
        }

        System.out.println("输出栈中的各个数据元素的顺序为(栈顶到栈底)：");
        System.out.println("第0号栈中各个数据元素为：");
        s.display(0);
        System.out.println("第1号栈中各个数据元素为：");
        s.display(1);

        System.out.println("数据\"11\"压入第0号栈后，第0号栈中各个数据元素为：");
        s.push(11, 0);
        s.display(0);


        System.out.println("数据\"12\"压入第1号栈后，第1号栈中各个数据元素为：");
        s.push(12, 1);
        s.display(1);

        System.out.println("第0号栈中栈顶元素出栈后，第0号栈中各个数据元素为：");
        s.pop(0);
        s.display(0);

        System.out.println("第1号栈中栈顶元素出栈后，第1号栈中各个数据元素为：");
        s.pop(1);
        s.display(1);
    }

}
