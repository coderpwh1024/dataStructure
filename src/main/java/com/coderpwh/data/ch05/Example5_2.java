package com.coderpwh.data.ch05;

/***
 *
 *
 *   统计一个二叉树上的结点个数
 *
 *
 *
 */
public class Example5_2 {

    public static void main(String[] args) {


        BiTree biTree = new BiTreeCreator().createBiTree();

        BiTreeNode root = biTree.getRoot();

        Example5_2 example  = new Example5_2();


        System.out.println("通过先根方式获取树上结点个数为:"+ example.countNode(root));


    }


    /***
     *  先根遍历方式
     * @param root
     * @return
     */
    public int countNode(BiTreeNode root) {

        int count = 0;

        if (root != null) {
            count++;
            count+= countNode(root.lchild);
            count+=countNode(root.rchild);
        }
        return count;
    }






}
