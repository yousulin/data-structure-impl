package com.example.BinaryTree;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class BinaryTreeTraversalTest {
    @Test
    public void testInorderTraversal() {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeTraversal traversal = new TreeTraversal();
        List<Integer> result = new ArrayList<>();
        traversal.inorder(result, root);

        // Expected inorder traversal: [4, 2, 5, 1, 3]
        assertEquals(Arrays.asList(4, 2, 5, 1, 3), result);
    }

    @Test
    public void testLevelOrderTraversal() {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeTraversal traversal = new TreeTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);

        // Expected level order traversal: [[1], [2, 3], [4, 5]]
        assertEquals(Arrays.asList(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5)), result);
    }
}
