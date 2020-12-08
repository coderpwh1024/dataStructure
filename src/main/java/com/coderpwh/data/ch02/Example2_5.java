package com.coderpwh.data.ch02;

import java.util.Scanner;

public class Example2_5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0;
        System.out.println("请输入LA中结点的个数:");

        m = sc.nextInt();
        System.out.println("请按非递减的方式输入" + m + "个数字:");
        LinkList LA = new LinkList(m, true);

        System.out.println("请输入LB中结点的个数:");
        n = sc.nextInt();
        System.out.println("请按非递减的方式输入" + n + "个数字:");
        LinkList LB = new LinkList(n, true);


        System.out.println("将单链表LA和LB归并后，新的单链表LA中的各个结点为：");
        mergeList_L(LA, LB).display();


    }

    public static LinkList mergeList_L(LinkList LA, LinkList LB) {

        // 首结点
        Node pa = LA.head.next;

        // 首结点
        Node pb = LB.head.next;

        // 头结点
        Node pc = LA.head;

        while (pa != null && pb != null) {

            Integer da = Integer.valueOf(pa.data.toString());
            Integer db = Integer.valueOf(pb.data.toString());

            if (da >= db) {
                pc.next = pb;
                pc = pb;
                pb = pb.next;
            } else {
                pc.next = pa;
                pc = pa;
                pa = pa.next;

            }

        }
        pc.next = (pa != null ? pa : pb);
        return LA;
    }
}
