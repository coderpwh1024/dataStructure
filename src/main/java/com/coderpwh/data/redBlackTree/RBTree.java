package com.coderpwh.data.redBlackTree;

public class RBTree<T extends Comparable<T>> {

    private RBNode<T> mRoot;

    private static final boolean RED = false;

    private static final boolean BLACK = true;


    private void rightRotate(RBNode<T> y) {

        RBNode<T> x = y.left;

        y.left = x.right;

        if (x.right != null) {
            x.right.parent = y;
        }

        x.parent = y.parent;


        if (y.parent == null) {
            this.mRoot = x;
        } else {
            if (y == y.parent.right) {
                y.parent.right = x;
            } else {
                y.parent.left = x;
            }
        }

        x.right = y;

        y.parent = x;
    }


    private void leftRotate(RBNode<T> x) {

        RBNode<T> y = x.right;

        x.right = y.left;

        if (y.left != null) {
            y.left.parent = x;
        }

        y.parent = x.parent;

        if (x.parent == null) {
            this.mRoot = y;
        } else {
            if (x.parent.left == x) {
                x.parent.left = y;
            } else {
                x.parent.right = y;
            }
        }

        y.left = x;
        x.parent = y;

    }


}
