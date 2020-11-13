package com.kun.tree;

/**
 * @Description
 * 226. Invert Binary Tree
 * @Author zhaokun
 * @Date 2020/11/4
 * @Version 1.0
 **/
public class InvertTree {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }
}
