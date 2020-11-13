package com.kun.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * 257. Binary Tree Paths
 * @Author zhaokun
 * @Date 2020/11/6
 * @Version 1.0
 **/
public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        binaryTreePaths(root);
//        String a = "x";
//        String b = a;
//        a += 1;
//        System.out.println(a);
//        System.out.println(b);
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root != null){
            getPaths(root, "", list);
        }
        return list;
    }
    public static void getPaths(TreeNode root, String path, List<String> list){
        String leftPath = path;
        String rightPath = path;
        if (root != null && root.left == null && root.right == null){
            list.add(path += path == "" ? root.val : "->" + root.val);
        } else {
            if(root.left != null){
                getPaths(root.left, leftPath += leftPath == "" ? root.val : "->" + root.val, list);
            }

            if(root.right != null){
                getPaths(root.right, rightPath += rightPath == "" ? root.val : "->" + root.val, list);
            }
        }
    }
}
