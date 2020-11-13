package com.kun.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Description
 * 111. Minimum Depth of Binary Tree  最小深度
 * @Author zhaokun
 * @Date 2020/11/3
 * @Version 1.0
 **/
public class MinDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(minDepth2(root));
    }
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if(root.left == null){
            return minDepth(root.right) + 1;
        }
        if (root.right == null){
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static int minDepth2(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        int res = 0;
        while(queue.size() != 0) {
            res++;
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode poll = queue.poll();
                if(poll.left == null && poll.right == null){
                    return res;
                }
                if(poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null){
                    queue.add(poll.right);
                }
            }
        }
        return -1;
    }

}
