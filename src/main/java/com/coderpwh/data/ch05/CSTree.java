package com.coderpwh.data.ch05;

import com.coderpwh.data.ch03.LinkQueue;

/***
 * 二叉链式存储
 */
public class CSTree {


    private CSTreeNode root;

    public CSTreeNode getRoot() {
        return root;
    }

    public void setRoot(CSTreeNode root) {
        this.root = root;
    }

    public CSTree() {
        this(null);
    }

    public CSTree(CSTreeNode root) {
        this.root = root;
    }


    /***
     *  递归--先根遍历树
     * @param T
     */
    public void preRootTraverse(CSTreeNode T) {
        if (T != null) {
            System.out.print(T.data);
            preRootTraverse(T.firstchild);
            preRootTraverse(T.nextsibling);
        }
    }

    /***
     *  递归--后根遍历树
     * @param T
     */
    public void postRootTraverse(CSTreeNode T) {
        if (T != null) {
            postRootTraverse(T.firstchild);
            System.out.print(T.data);
            postRootTraverse(T.nextsibling);
        }
    }


    /**
     * 层次遍历
     */
    public void levelTraverse() {
        try {
            CSTreeNode T = root;
            if (T != null) {
                LinkQueue L = new LinkQueue();
                L.offer(T);
                while (!L.isEmpty()) {
                    for (T = (CSTreeNode) L.poll(); T != null; T = T.nextsibling) {
                        System.out.print(T.data);
                        if (T.firstchild != null) {
                            L.offer(T.firstchild);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }


}

