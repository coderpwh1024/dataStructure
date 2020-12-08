package com.coderpwh.data.ch02;


public class DuLinkList implements Ilist {

    public DulNode head;


    public DuLinkList() {
        head = new DulNode();
        head.prior = head;
        head.next = head;
    }

    @Override
    public void clear() {
        head.prior = head;
        head.next = head;
    }

    @Override
    public boolean isEmpty() {
        return head.equals(head.next);
    }

    @Override
    public int length() {
        DulNode p = head.next;

        int length = 0;
        while (!p.equals(head)) {
            p = p.next;
            ++length;
        }
        return length;
    }

    @Override
    public Object get(int i) throws Exception {
        DulNode p = head.next;
        int j = 0;
        while (!p.equals(head) && j < i) {
            p = p.next;
            ++j;
        }
        if (j > i || p.equals(head)) {
            throw new Exception("第" + i + "个元素不存在");
        }

        return p.data;
    }

    @Override
    public void insert(int i, Object x) throws Exception {
        DulNode p = head.next;

        int j = 0;
        while (!p.equals(head) && j < i) {
            p = p.next;
            ++j;
        }
        if (j != i && !p.equals(head)) {
            throw new Exception("插入位置不合理");
        }

        // 这里插入的代码是p前面插入的
        DulNode s = new DulNode(x);
        p.prior.next = s;
        p.prior = s.prior;
        s.next = p;
        p.prior = s;

        //  这是p 后面插入 上面的i与j要分开判断了
      /*  s.next = p.next;
        p.next = s;
        s.next.prior = s;
        s.prior = p;*/


    }

    @Override
    public void remove(int i) throws Exception {
        DulNode p = head.next;
        int j = 0;
        while (!p.equals(head) && j < i) {
            p = p.next;
            ++j;
        }

        if (j != i) {
            throw new Exception("删除位置不合理!");
        }


        p.prior.next = p.next;
        p.next.prior = p.prior;

    }

    @Override
    public int indexOf(Object c) {
        DulNode p = head.next;
        int j = 0;
        while (!p.equals(head) && !p.data.equals(c)) {
            p = p.next;
            ++j;
        }
        if (!p.equals(head)) {
            return j;
        } else {
            return -1;
        }
    }

    @Override
    public void display() {
        DulNode node = head.next;
        while (!node.equals(head)) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public DulNode getHead() {
        return head;
    }

    public void setHead(DulNode head) {
        this.head = head;
    }


}
