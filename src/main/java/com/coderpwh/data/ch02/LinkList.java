package com.coderpwh.data.ch02;

public class LinkList implements Ilist {

    public Node head;

    public LinkList() {
        head = new Node();
    }


    public void create1(int n) throws Exception {

    }


    public void create2(int n) throws Exception {

    }

    @Override
    public void clear() {

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

    @Override
    public void insert(int i, Object x) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int indexOf(Object c) {
        return 0;
    }

    @Override
    public void display() {

        Node p = head.next;
        while (p != null) {
            System.out.println(p.data + "");
            p = p.next;
        }

    }
}
