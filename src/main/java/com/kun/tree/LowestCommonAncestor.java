package com.kun.tree;

/**
 * @Description
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * @Author zhaokun
 * @Date 2020/11/5
 * @Version 1.0
 **/
public class LowestCommonAncestor {
    public static void main(String[] args) {
    }
    public static TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor1(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor1(root.right, p, q);
        } else {
            return root;
        }
    }

    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        while (root != null){
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}
