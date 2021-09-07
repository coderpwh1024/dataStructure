package com.coderpwh.data.ch05;

import com.coderpwh.data.ch03.LinkQueue;
import com.coderpwh.data.ch03.LinkStack;

public class BiTree {


    private BiTreeNode root;


    public BiTree() {
        this.root = null;
    }


    public BiTree(BiTreeNode root) {
        this.root = root;
    }


    public BiTreeNode getRoot() {
        return root;
    }

    public void setRoot(BiTreeNode root) {
        this.root = root;
    }


    // 标明空子树的先根遍历
    private static int index = 0;


    public BiTree(String preStr) {
        char c = preStr.charAt(index++);

        if (c != '#') {
            root = new BiTreeNode(c);
            root.lchild = new BiTree(preStr).root;
            root.rchild = new BiTree(preStr).root;
        } else {
            root = null;
        }
    }


    /***
     *
     * ABDEGCFH
     *
     * 由先根与中根序列构建二叉树
     * @param preOrder
     * @param inOrder
     * @param preIndex
     * @param inIndex
     * @param count
     */
    public BiTree(String preOrder, String inOrder, int preIndex, int inIndex, int count) {


        if (count > 0) {

            char r = preOrder.charAt(preIndex);

            int i = 0;
            for (; i < count; i++) {

                if (r == inOrder.charAt(inIndex + i)) {
                    break;
                }
            }
            root = new BiTreeNode(r);

            // 构建左结点
            root.lchild = new BiTree(preOrder, inOrder, preIndex + 1, inIndex, i).root;

            // 构建右结点树
            root.rchild = new BiTree(preOrder, inOrder, preIndex + 1 + i, inIndex + 1 + i, count - 1 - i).root;


        }


    }


    /***
     *   从根部遍历二叉树，递归方式，现在左树后右树
     * @param T
     */
    public void preRootTraverse(BiTreeNode T) {

        if (T != null) {
            System.out.print(T.data);
            preRootTraverse(T.lchild);
            preRootTraverse(T.rchild);
        }
    }


    /***
     *
     *  从中根遍历，递归方式实现(先左树，后右树)
     *
     * @param T
     */
    public void intRootTraverse(BiTreeNode T) {

        if (T != null) {
            intRootTraverse(T.lchild);
            System.out.print(T.data);
            intRootTraverse(T.rchild);
        }
    }


    /***
     *   从后根遍历，递归方式实现
     *
     * @param T
     */
    public void postRootTraverse(BiTreeNode T) {
        if (T != null) {
            postRootTraverse(T.lchild);
            postRootTraverse(T.rchild);
            System.out.print(T.data);
        }

    }


    /***
     *  非递归方式，从根部开始遍历
     *
     *
     */
    public void preRootTraverse() {

        try {
            BiTreeNode T = root;

            if (T != null) {
                LinkStack S = new LinkStack();
                S.push(T);
                while (!S.isEmpty()) {
                    T = (BiTreeNode) S.pop();
                    System.out.print(T.data);
                    while (T != null) {
                        if (T.lchild != null) {
                            System.out.print(T.lchild.data);
                        }
                        if (T.rchild != null) {
                            S.push(T.rchild);
                        }
                        T = T.lchild;
                    }

                }

            }
        } catch (Exception e) {
            e.getMessage();
        }
    }


    /****
     *
     *  非递归方式,从中根开始遍历实现
     *
     *
     *
     */
    public void intRootTraverse() {
        try {
            BiTreeNode T = root;
            if (T != null) {
                LinkStack S = new LinkStack();
                S.push(T);
                while (!S.isEmpty()) {
                    while (S.peek() != null) {
                        S.push(((BiTreeNode) S.peek()).lchild);
                    }
                    S.pop();
                    if (!S.isEmpty()) {
                        T = (BiTreeNode) S.pop();
                        System.out.print(T.data);
                        S.push(T.rchild);
                    }
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }


    /***
     *
     *  非递归方式，从后根方式遍历实现
     *
     *
     *
     */
    public void postRootTraverse() {
        try {
            BiTreeNode T = root;
            if (T != null) {
                LinkStack S = new LinkStack();
                S.push(T);
                Boolean flag;
                BiTreeNode p = null;

                while (!S.isEmpty()) {
                    while (S.peek() != null) {
                        S.push(((BiTreeNode) S.peek()).lchild);
                    }
                    S.pop();
                    while (!S.isEmpty()) {
                        T = (BiTreeNode) S.peek();
                        if (T.rchild == null || T.rchild == p) {
                            System.out.print(T.data);
                            S.pop();
                            p = T;
                            flag = true;
                        } else {
                            S.push(T.rchild);
                            flag = false;
                        }
                        if (!flag) {
                            break;
                        }
                    }

                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }


    /***
     *  层次遍历，二叉树
     *
     */
    public void levelTraverse() {
        try {
            BiTreeNode T = root;

            if (T != null) {
                LinkQueue L = new LinkQueue();
                L.offer(T);

                while (!L.isEmpty()) {
                    T = (BiTreeNode) L.poll();
                    System.out.print(T.data);
                    if (T.lchild != null) {
                        L.offer(T.lchild);
                    }
                    if (T.rchild != null) {
                        L.offer(T.rchild);
                    }
                }
            }
        } catch (Exception e) {

        }
    }


    /***
     *  统计叶结点数目
     *
     * @param T
     * @return
     */
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


    /****
     *
     * 统计结点数目
     * @param T
     * @return
     */
    public int countNode(BiTreeNode T) {
        int count = 0;

        if (T != null) {
            ++count;
            count += countNode(T.lchild);
            count += countNode(T.rchild);
        }
        return count;
    }


    /***
     *   递归的方式查找二叉树上的结点
     *
     * @param T
     * @param x
     * @return
     */
    public BiTreeNode searchNode(BiTreeNode T, Object x) {
        if (T != null) {
            if (T.data.equals(x)) {
                return T;
            } else {
                BiTreeNode lresutl = searchNode(T.lchild, x);
                return lresutl != null ? lresutl : searchNode(T.rchild, x);
            }
        }
        return null;
    }


    /***
     *  二叉树的深度
     *  求出左右树的深度，然后比较获取最大值加1
     *
     * @param T
     * @return
     */
    public int getDepth(BiTreeNode T) {
        if (T != null) {

            int lDepth = getDepth(T.lchild);

            int rDepth = getDepth(T.rchild);

            return 1 + (lDepth > rDepth ? lDepth : rDepth);
        }
        return 0;
    }


    /***
     *  判断二课二叉树是否相等
     *   中根遍历方式实现
     * @param T1
     * @param T2
     * @return
     */
    public boolean isEqual(BiTreeNode T1, BiTreeNode T2) {

        if (T1 == null && T2 == null) {
            return true;
        }

        if (T1 != null && T2 != null) {
            if (isEqual(T1.lchild, T2.lchild)) {
                if (T1.data.equals(T2.data)) {
                    if (isEqual(T1.rchild, T2.rchild)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
