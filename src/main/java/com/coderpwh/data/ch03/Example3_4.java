package com.coderpwh.data.ch03;

public class Example3_4 {

    private int c = 0;

    public static void main(String[] args) {

        Example3_4 example = new Example3_4();
        example.hanoi(3,'x','y','z');
    }

    public void hanoi(int n, char x, char y, char z) {
        if(n==1){
            move(x,1,z);
        }else{
             hanoi(n-1,x,z,y);
             move(x,n,z);
             hanoi(n-1,y,x,z);
        }

    }

    /***
     *  编号为n的圆盘从x移动到z
     * @param x
     * @param n
     * @param z
     */
    public void move(char x, int n, char z) {
        System.out.println("第" + ++c + "次移动： " + n + "号圆盘，" + x + "->" + z);
    }


}
