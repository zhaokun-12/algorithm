package com.kun.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 *
 * @Author zhaokun
 * @Date 2021/6/2
 * @Version 1.0
 **/
public class PreorderTraversal {
    // 144. 二叉树的前序遍历（中左右）
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list;
    }
    public void preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }
    // 145. 二叉树的后序遍历 (左右中)
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }
    public void postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }
}
