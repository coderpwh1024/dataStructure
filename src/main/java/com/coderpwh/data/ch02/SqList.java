package com.coderpwh.data.ch02;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SqList implements Ilist {

    //  线性表存储空间
    private  Object[] listElem;

    //  线性表当前长度
    private  int curLen;


    /****
     * 构造函数
     *  初始化一个大小为maxsize的线性表
     * @param maxSize
     */
    public SqList(int maxSize) {
       curLen=0;
       listElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        curLen=0;
    }

    @Override
    public boolean isEmpty() {
        return curLen==0;
    }

    @Override
    public int length() {
        return curLen;
    }

    @Override
    public Object get(int i) throws Exception {
            if(i<0||i>curLen-1){
                throw new Exception("第"+i+"个元素不存在!");
            }


        return  listElem[i];
    }

    @Override
    public void insert(int i, Object x) {
          if(curLen==listElem.length){
             log.error("当前线性表已满");
          }
          if(i<0||i>curLen){
              log.error("插入的位置不正确!");
          }
          for(int j=curLen;j>i;j--){
              listElem[j]=listElem[j-1];
          }
        listElem[i]=x;
        curLen++;
    }

    @Override
    public void remove(int i) {

        if(i<0||i>curLen-1){
            log.error("位置不正确！");
        }

        for (int j = i; j < curLen - 1; j++)
            listElem[j] = listElem[j + 1];// 被删除元素之后的元素左移

        curLen--; // 表长度减1

    }

    @Override
    public int indexOf(Object c) {
        for(int i=0;i<curLen;i++){
            if(listElem[i].equals(c)){
                return  i;
            }
        }

        return -1;

    /* int j=0;
     while (j<curLen&&!listElem[j].equals(c)){
         j++;
     }
     if(j<curLen){
         return j;
     }else{
         return -1;
     }*/


    }

    @Override
    public void display() {
         for(int j=0;j<curLen;j++){
             System.out.println(listElem[j]);
         }
    }



}
