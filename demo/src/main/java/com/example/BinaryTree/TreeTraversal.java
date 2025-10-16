package com.example.BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {
    
    public void inorder(List<Integer> result,TreeNode currentNode){
        if(currentNode != null){
            inorder(result, currentNode.left);
            result.add(currentNode.val);
            inorder(result, currentNode.right);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;

        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        q.offer(root);

        //process all the nodes in the same level
        while(!q.isEmpty()){
            List<Integer> tempList = new ArrayList<>();
            int size = q.size();
            
            // iterate through the nodes in the queue
            for(int i = 0; i < size; i++){
                // get the first item from the queue
                TreeNode n = q.poll();
                tempList.add(n.val);
                // check if any child node exists
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }
            result.add(tempList);
        }
        return result;
    }
}
