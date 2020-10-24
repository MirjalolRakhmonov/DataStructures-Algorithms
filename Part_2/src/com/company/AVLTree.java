package com.company;

public class AVLTree {
    private class AVLNode{
        int value;
        AVLNode left, right;

        public AVLNode(int value) {
            this.value=value;
        }

        @Override
        public String toString() {
            return "Value=" +this.value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root=insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root==null)
            return new AVLNode(value);

        if (value<root.value)
            root.left=insert(root.left, value);
        else if (value>root.value)
            root.right=insert(root.right, value);

        return root;
    }
}
