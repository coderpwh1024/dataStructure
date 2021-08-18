package com.coderpwh.data.ch05;


/**
 * 统计二叉树的深度
 */
public class Example5_3 {

    public static void main(String[] args) {

        Example5_3 example = new Example5_3();


        // 创建二叉树
        BiTree biTree = new BiTreeCreator().createBiTree();

        // 获取二叉树根结点
        BiTreeNode root = biTree.getRoot();


        System.out.println("当前二叉树上的结点深度为:" + example.getDepthCount(root));


        System.out.println("当前二叉树上的结点深度为:" + example.getDepth(root));


    }


    /***
     *  递归的方式实现--分别统计左右结点的深度然后加上根结点
     * @param root
     * @return
     */
    public int getDepth(BiTreeNode root) {

        int count = 0;


        if (root != null) {

            int rcount = getDepth(root.rchild);

            int lcount = getDepth(root.lchild);

            return 1 + (rcount > lcount ? rcount : lcount);

        }
        return count;
    }


    /**
     * 递归方式实现
     *
     * @param root
     * @return
     */
    public int getDepthCount(BiTreeNode root) {

        if (root == null) {
            return 0;
        } else if (root.lchild == null && root.rchild == null) {
            return 1;
        } else {
            return 1 + (getDepthCount(root.lchild) > getDepthCount(root.rchild) ? getDepthCount(root.lchild) : getDepthCount(root.rchild));
        }
    }


}
