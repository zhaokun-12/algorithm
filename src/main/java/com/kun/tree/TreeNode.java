package com.kun.tree;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/11/3
 * @Version 1.0
 **/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
