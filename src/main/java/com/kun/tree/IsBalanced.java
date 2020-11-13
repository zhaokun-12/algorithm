package com.kun.tree;


/**
 * @Description
 * 110. Balanced Binary Tree
 * @Author zhaokun
 * @Date 2020/11/3
 * @Version 1.0
 **/
public class IsBalanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        if (height(root) == -1) {
            return false;
        } else {
            return true;
        }

    }
    public static int height(TreeNode root) throws RuntimeException{
        if(root == null){
            return 0;
        }
        int left = height(root.left) + 1;
        int right = height(root.right) + 1;
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right);
    }
}
