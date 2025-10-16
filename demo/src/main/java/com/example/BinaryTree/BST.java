package com.example.BinaryTree;

public class BST {
    /**
     * This method checks if a binary tree is symmetric.
     * A tree is symmetric if the left subtree is a mirror reflection of the right subtree.
     *
     * @param root The root node of the binary tree.
     * @return true if the tree is symmetric, false otherwise.
     */
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode left, TreeNode right){
        // compare left node and right node
        // if both nodes are null then return true
        if(left == null && right == null) return true;
        // if both nodes are not null and their returned value of comparison is true, then return true
        if(left != null && right != null
            && (left.val == right.val) // crucial value comparison
            && isMirror(left.left, right.right)
            && isMirror(left.right, right.left)){
                return true;
            }
        // else return false
        return false;
    }
    /**
     * This method calculates the maximum depth of a binary tree.
     * The depth is defined as the number of nodes along the longest path from the root node down to the farthest leaf node.
     *
     * @param root The root node of the binary tree.
     * @return The maximum depth of the binary tree.
     */
    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }
    private int getDepth(TreeNode node, int depth){
        if(node == null){
            return depth;
        }
        int left = getDepth(node.left, depth+1);
        int right = getDepth(node.right, depth+1);
        return Math.max(left, right);
    }

    /**
     * This method converts a sorted array into a height-balanced binary search tree (BST).
     * A height-balanced BST is defined as a binary tree in which the depth of the two subtrees of every node never differs by more than one.
     *
     * @param nums The sorted array to be converted into a BST.
     * @return The root node of the height-balanced BST.
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBSTHelper(nums, 0, nums.length-1);
    }
    private TreeNode arrayToBSTHelper(int[] nums, int left, int right){
        if(left > right) return null;

        // the element in the middle of the array will be the root of the BST
        // left is the starting index, right is the ending index
        // we calculate the middle index to find the root of the subtree
        int middle = left + ( right - left ) / 2;

        // create a new TreeNode with the value at the middle index
        // this will be the root of the subtree
        TreeNode node = new TreeNode(nums[middle]);

        // recursively call the method to assign the left and right children
        // left subtree will be the left part of the array, right subtree will be the right
        node.left = arrayToBSTHelper(nums, left, middle-1);
        node.right = arrayToBSTHelper(nums, middle+1, right);

        return node;
    }
}
