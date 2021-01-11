package com.coderpwh.data.ch03Exercise;

import java.util.Scanner;

/**
 * @author coderpwh
 */
public class Exercise3_3_4 {

    public static void main(String[] args) throws Exception {

        CircleSqQueue_num Q = new CircleSqQueue_num(100);

        for (int i = 1; i <= 10; i++) {
            Q.offer(i);
        }
        System.out.println("队列中各元素为(从队首到队尾)： ");
        Q.display();// 打印队列中元素（队首到队尾）
        System.out.println();
        System.out.print("请输入待入队的元素值：");
        Q.offer(new Scanner(System.in).next());
        System.out.println("入队后队列中各元素为(从队首到队尾)：");
        Q.display();// 打印队列中元素（队首到队尾）
        System.out.println();
        Q.poll();// 删除元素
        System.out.println("出队后队列中各元素为(从队首到队尾)：");
        Q.display();// 打印队列中元素
        System.out.println();

    }


}
