package com.coderpwh.data.ch02;

public class Example2_3 {

    public static void main(String[] args) {
       int n = 10;

        LinkList link = new LinkList();

        for (int i = 0; i < n; i++) {
            link.insert(i, i);
        }
        System.out.println("请输入i的值为:");

        int i = new Scanner(System.in).nextInt();

        if (0 < i && i < n) {
            System.out.println("第" + i + "个元素的直接前驱是:" + link.get(i - 1));
        } else {
            System.out.println("第" + i + "个元素的直接前驱不存在!");
        }

        
    }
}
