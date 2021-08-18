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

        Example5_2 example = new Example5_2();

        System.out.println("通过递归的方式获取二叉树上的结点个数为:" + example.getCountNode(root));

        System.out.println("通过先根方式获取二叉树树上结点个数为:" + example.countNode(root));

        System.out.println("通过中跟方式获取二叉树上的结点个数为:" + example.midCountNode(root));

        System.out.println("通过后根方式获取二叉树上结点个数为:" + example.afterCountNode(root));


    }


    /***
     *  递归方式获取
     * @param root
     * @return
     */
    public int getCountNode(BiTreeNode root) {

        if (root == null) {
            return 0;
        }
        return getCountNode(root.lchild) + getCountNode(root.rchild) + 1;
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
            count += countNode(root.lchild);
            count += countNode(root.rchild);
        }
        return count;
    }


    /***
     *  中根方式遍历
     * @param root
     * @return
     */
    public int midCountNode(BiTreeNode root) {

        int count = 0;

        if (root != null) {
            count += countNode(root.lchild);
            count++;
            count += countNode(root.rchild);
        }
        return count;
    }


    /***
     * 后根方式遍历
     * @param root
     * @return
     */
    public int afterCountNode(BiTreeNode root) {

        int count = 0;

        if (root != null) {
            count += countNode(root.lchild);
            count += countNode(root.rchild);
            count++;
        }
        return count;
    }


}
