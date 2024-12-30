package org.example.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if(root != null) {
            var t = root.left;
            root.left = root.right;
            root.right = t;
        }
        return root;
    }

    // BFS
    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list;
        List<Integer> currLevel = new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node == null) {
                list.add(currLevel);
                currLevel = new ArrayList<>();
                if(q.isEmpty()) break;
                q.add(null);
            }else {
                currLevel.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }

        return list;
    }
}
