package com.coderpwh.data.ch02;

import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) throws Exception {

        int n=10;
        SqList sqList = new SqList(10);
        for(int i=0;i<n;i++){
            sqList.insert(i,i);
        }
        System.out.println("请输入i的值:");
        int i = new Scanner(System.in).nextInt();

        if(0<i&&i<n){
            Object obj = sqList.get(i-1);
            System.out.println("第"+i+"个元素的直接前驱是:"+obj);

        }else{
            System.out.println("第"+i+"个元素的直接前驱不存在!");
        }
    }
}
