package com.kun.hash;

import com.kun.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author zhaokun
 * 94. Binary Tree Inorder Traversal
 * 中序遍历
 * @Date 2021/5/12
 * @Version 1.0
 **/
public class InorderTraversal {
    public static void main(String[] args) {

    }
    static List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
