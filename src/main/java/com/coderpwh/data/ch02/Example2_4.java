package com.coderpwh.data.ch02;

/**
 * @author coderpwh
 */
public class Example2_4 {

    public static void main(String[] args) throws Exception {

        System.out.println("请输入10个单链表中的10个结点值：");
        LinkList L = new LinkList(10, true);

        System.out.println("删除重复结点前单链表中各个结点值为：");
        L.display();

        removeRepeatElem(L);
        System.out.println("删除重复结点后单链表中各个结点值为：");
        L.display();


    }


    /****
     *   删除链表中的多余的结点
     * @param link
     */
    private static void removeRepeatElem(LinkList link) throws Exception {

        Node p = link.head.next ,q;

        while (p != null) {

            // 记录p的位置
            int order = link.indexOf(p.data);
            // p 是指向首结点（link.head 则是指向头结点）

            // p 指向了首节点，p.next 则是p结点
            q = p.next;

            while (q != null) {

                if (p.data.equals(q.data)) {
                    link.remove(order + 1);
                } else {
                    ++order;
                }
                q = q.next;
            }

            p = p.next;

        }

    }


}
