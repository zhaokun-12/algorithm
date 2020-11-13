package com.kun.tree;

/**
 * @Description
 * 404. Sum of Left Leaves
 * @Author zhaokun
 * @Date 2020/11/6
 * @Version 1.0
 **/
public class SumOfLeftLeaves {
    public static int sum = 0;
    public static void main(String[] args) {

    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        sumLeaves(root, false);
        return sum;
    }
    public void sumLeaves(TreeNode root, boolean isLeft) {

        if(root.left == null && root.right == null && isLeft){
            sum += root.val;
        }
        if(root.left != null){
            sumLeaves(root.left, true);
        }
        if(root.right != null){
            sumLeaves(root.right, false);
        }
    }
}
