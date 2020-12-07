package com.coderpwh.data.ch02;

public class Example2_1 {

    public static void main(String[] args) throws Exception {
        SqList sqList = new SqList(10);


        sqList.insert(0, "a"); // 初始化数序表中的前5个元素
        sqList.insert(1, "b");
        sqList.insert(2, "d");
        sqList.insert(3, "m");
        sqList.insert(4, "z");

        sqList.display();

        int order = sqList.indexOf("z");
        System.out.println(order);

        if(order!=-1){
            System.out.println("顺序表中第一次出现的值为'z'的数据元素位置为:"+order);
        }else{
            System.out.println("此顺序表中不包含值为'z'的数据元素!");
        }



    }

}
