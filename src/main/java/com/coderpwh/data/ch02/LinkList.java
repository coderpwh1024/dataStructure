package com.coderpwh.data.ch02;

import java.util.Scanner;

/**
 * @author coderpwh
 */
public class LinkList implements Ilist {

    public Node head;

    public LinkList() {
        head = new Node();
    }

    public LinkList(int n, boolean Order) throws Exception {
        this();
        if (Order) {
            // 尾插入
            create1(n);
        } else {
            // 头插入
            create2(n);
        }
    }


    /***
     *  尾插入
     * @param n
     * @throws Exception
     */
    public void create1(int n) throws Exception {

        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < n; j++) {
            insert(length(), sc.next());
        }

    }


    /***
     *  头插入
     * @param n
     * @throws Exception
     */
    public void create2(int n) throws Exception {

        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < n; j++) {
            insert(0, sc.next());
        }


    }

    @Override
    public void clear() {
        head.data = null;
        head.next = null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        Node p = head.next;
        int length = 0;
        while (p != null) {
            ++length;
            p = p.next;
        }
        return length;
    }

    @Override
    public Object get(int i) throws Exception {

        Node p = head.next;

        int j = 0;

        while (p != null && j < i) {
            p = p.next;
            ++j;
        }
        if (j > i || p == null) {
            throw new Exception("第" + i + "个元素不存在");
        }
        return p.data;
    }


    /***
     *    注意带头结点与不带头结点区别
     *      下面是带头结点
     *
     * @param i
     * @param x
     */
    @Override
    public void insert(int i, Object x) throws Exception {
        Node p = head;
        int j = -1;

        while (p != null && j < i - 1) {
            p = p.next;
            j++;
        }

        if (p == null || j > i - 1) {
            throw new Exception("位置不合法");
        }

        Node s = new Node(x);
        s.next = p.next;
        p.next = s;
    }

    /***
     *
     * @param i
     */
    @Override
    public void remove(int i) throws Exception {
        Node p = head;

        int j = -1;
        while (p.next != null && j < i - 1) {
            p = p.next;
            j++;
        }

        if (p.next == null || j > i - 1) {
            throw new Exception("删除位置不合法！");
        }
        p.next = p.next.next;


    }


    @Override
    public int indexOf(Object c) {
        Node p = head.next;

        int j = 0;

        while (p != null && !p.data.equals(c)) {
            p = p.next;
            j++;
        }
        if (j > 0) {
            return j;
        } else {
            return -1;
        }


    }

    @Override
    public void display() {

        Node p = head.next;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }

    }
}
