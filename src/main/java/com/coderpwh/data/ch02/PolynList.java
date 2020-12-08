package com.coderpwh.data.ch02;

import java.util.Scanner;

/**
 * @author coderpwh
 */
public class PolynList extends LinkList {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入A多项式的项数：");
        int m = sc.nextInt();
        System.out.println("请分别输入多项式A各项的系数和指数：");
        PolynList LA = new PolynList(m);

        System.out.println("请输入B多项式的项数：");
        int n = sc.nextInt();
        System.out.println("请分别输入多项式B各项的系数和指数：");
        PolynList LB = new PolynList(n);

        LA = LA.addPolyn(LA, LB);
        System.out.println("求和后的多项式各项为： ");
        LA.display(); // 打印LA中的项


    }


    public PolynList addPolyn(PolynList LA, PolynList LB) {
        Node ha = LA.head;
        Node qa = LA.head.next;
        Node qb = LB.head.next;

        while (qa != null && qb != null) {
            PolyNode a = (PolyNode) qa.data;
            PolyNode b = (PolyNode) qb.data;

            switch (cmp(a, b)) {
                case -1:
                    ha.next = qa;
                    ha = qa;
                    qa = qa.next;
                    break;
                case 0:
                    double sum = a.coef + b.coef;
                    if (sum != 0.0) {
                        a.coef = sum;
                        ha.next = qa;
                        ha = qa;
                        qa = qa.next;
                        qb = qb.next;
                    } else {
                        qa = qa.next;
                        qb = qb.next;
                    }
                    break;
                case 1:
                    ha.next = qb;
                    ha = qb;
                    qb = qb.next;
                    break;
            }
        }
        ha.next = (qa != null ? qa : qb);
        return LA;
    }


    /***
     *   创建多项式的链表
     * @param n
     * @throws Exception
     */
    public PolynList(int n) throws Exception {
        head.data = new PolyNode(0, -1);

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            double coef = sc.nextDouble();
            int expn = sc.nextInt();
            insert(new PolyNode(coef, expn));
        }

    }


    public void insert(PolyNode e) throws Exception {
        int j = 0;

        while (j < length()) {
            PolyNode t = (PolyNode) get(j);
            if (t.expn > e.expn) {
                break;
            }
            j++;
        }
        insert(j, e);

    }


    /***
     *  比较多项式的指数
     * @param a
     * @param b
     * @return
     */
    public int cmp(PolyNode a, PolyNode b) {

        if (a.expn < b.expn) {
            return -1;
        } else if (a.expn == b.expn) {
            return 0;
        } else {
            return 1;
        }

    }

    @Override
    public void display() throws Exception {

        for (int i = 0; i < length(); i++) {
            PolyNode e = (PolyNode) get(i);
            System.out.println("系数为： " + e.coef + " 指数为： "
                    + e.expn);
        }
    }


}
