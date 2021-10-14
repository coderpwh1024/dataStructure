package com.coderpwh.data.redBlackTree;

import lombok.val;

/**
 * @author coderpwh
 */
public class RedBlackBST<Key extends Comparable<Key>, Value> {


    private static final boolean RED = true;

    private static final boolean BLACK = false;

    private Node root;


    private class Node {

        private Key key;

        private Value val;

        private Node left;

        private Node right;

        private boolean color;

        private int size;

        public Node(Key key, Value val, Node left, Node right, boolean color, int size) {
            this.key = key;
            this.val = val;
            this.left = left;
            this.right = right;
            this.color = color;
            this.size = size;
        }

        public Node(Key key, Value val, boolean color, int size) {
            this.key = key;
            this.val = val;
            this.color = color;
            this.size = size;
        }


    }


    private boolean isRed(Node x) {

        if (x == null) {
            return false;
        }
        return x.color == RED;
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        }
        return x.size;
    }

    public int size() {
        return size(root);
    }


    public boolean isEmpty() {
        return root == null;
    }


    public Value get(Key key) {
        if (key == null) {
            throw new NullPointerException("key 为空");
        }
        return get(root, key);
    }


    private Value get(Node x, Key key) {

        while (x != null) {

            int count = key.compareTo(x.key);

            if (count < 0) {
                x = x.left;
            } else if (count > 0) {
                x = x.right;
            } else {
                return x.val;
            }
        }
        return null;
    }


    public boolean contains(Key key) {
        return get(key) != null;
    }


    // TODO  右转与左转，转变颜色
    public Node put(Node h, Key key, Value val) {

        if (h == null) {
            h = new Node(key, val, RED, 1);
        }

        int cmp = key.compareTo(h.key);

        if (cmp < 0) {
            h.left = put(h.left, key, val);
        } else if (cmp > 0) {
            h.right = put(h.right, key, val);
        } else {
            h.val = val;
        }

        return h;
    }





}
