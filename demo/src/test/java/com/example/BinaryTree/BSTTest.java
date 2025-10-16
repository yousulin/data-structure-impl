package com.example.BinaryTree;

import org.junit.Test;

public class BSTTest {
    @Test
    public void testIsSymmetric() {
        // Create a symmetric tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        BST bst = new BST();
        assert bst.isSymmetric(root) : "The tree should be symmetric";

        // Create a non-symmetric tree
        TreeNode nonSymmetricRoot = new TreeNode(1);
        nonSymmetricRoot.left = new TreeNode(2);
        nonSymmetricRoot.right = new TreeNode(2);
        nonSymmetricRoot.left.right = new TreeNode(3);

        assert !bst.isSymmetric(nonSymmetricRoot) : "The tree should not be symmetric";
    }
}
