package org.example.ds;

public class BinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if(root != null) {
            var t = root.left;
            root.left = root.right;
            root.right = t;
        }
        return root;
    }
}
