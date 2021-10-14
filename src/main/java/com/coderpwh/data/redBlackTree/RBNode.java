package com.coderpwh.data.redBlackTree;

/**
 * @author coderpwh
 */
public class RBNode<T extends Comparable<T>> {

    boolean color;

    T key;

    RBNode<T> left;

    RBNode<T> right;

    RBNode<T> parent;

    public RBNode(boolean color, T key, RBNode<T> left, RBNode<T> right, RBNode<T> parent) {
        this.color = color;
        this.key = key;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}
