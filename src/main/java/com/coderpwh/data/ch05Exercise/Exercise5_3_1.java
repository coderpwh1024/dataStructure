package com.coderpwh.data.ch05Exercise;

import com.coderpwh.data.ch05.BiTreeNode;

public class Exercise5_3_1 {

    public static void main(String[] args) {

        BiTreeNode D = new BiTreeNode('D');
        BiTreeNode G = new BiTreeNode('G');
        BiTreeNode H = new BiTreeNode('H');
        BiTreeNode E = new BiTreeNode('E', G, null);
        BiTreeNode B = new BiTreeNode('B', D, E);
        BiTreeNode F = new BiTreeNode('F', null, H);
        BiTreeNode C = new BiTreeNode('C', F, null);
        BiTreeNode A = new BiTreeNode('A', B, C);

        Exercise5_3_1 exercise = new Exercise5_3_1();

        System.out.println("该树的叶结点的数目为:"+exercise.countLeafNode(A));

        System.out.println("该树的叶结点的数目为:"+exercise.getCountLeadNode(A));
    }

    public int countLeafNode(BiTreeNode T) {

        int count = 0;

        if (T != null) {
            if (T.lchild == null && T.rchild == null) {
                ++count;
            } else {
                count += countLeafNode(T.lchild);
                count += countLeafNode(T.rchild);
            }
        }
        return count;

    }

    public int getCountLeadNode(BiTreeNode T) {

        if (T == null) {
            return 0;
        } else if (T.lchild == null && T.rchild == null) {
            return 1;
        } else {
            return getCountLeadNode(T.lchild) + getCountLeadNode(T.rchild);
        }
    }
}
