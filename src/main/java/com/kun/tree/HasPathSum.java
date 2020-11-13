package com.kun.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * 112. Path Sum
 * @Author zhaokun
 * @Date 2020/11/4
 * @Version 1.0
 **/
public class HasPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = -2;
        root.right = new TreeNode(-3);
        hasPathSum2(root, -2);
    }

    /**
     * 递归遍历所有路径（到达叶子节点），然后将和放入list容器
     * @param root
     * @param sum
     * @return
     */
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return sum == 0;
        }
        List<Integer> list = new ArrayList<>();
        sum(root, 0, list);
        return list.contains(sum);
    }
    public static void sum(TreeNode root, int sum, List<Integer> list){
        if(root.left != null){
            sum(root.left, sum + root.val, list);
        }
        if(root.right != null){
            sum(root.right, sum + root.val, list);
        }
        if(root.left == null && root.right == null){
            list.add(sum + root.val);
        }
    }

    public static boolean hasPathSum2(TreeNode root, int sum) {
        if(root != null){
            return (root.left == null && root.right == null && root.val == sum) ? true : (hasPathSum2(root.left, sum - root.val) || hasPathSum2(root.right, sum - root.val));
        } else {
            return false;
        }

    }
}
