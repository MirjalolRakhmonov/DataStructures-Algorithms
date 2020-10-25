package com.company;

public class AVLTree {
    private class AVLNode{
        int value, height;
        AVLNode left, right;

        public AVLNode(int value) {
            this.value=value;
        }

        @Override
        public String toString() {
            return "Value=" +this.value;
        }
    }

    private AVLNode node;

    public void insert(int value) {
        node =insert(node, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root==null)
            return new AVLNode(value);

        if (value<root.value)
            root.left=insert(root.left, value);
        else if (value>root.value)
            root.right=insert(root.right, value);

        root.height=Math.max(height(root.left), height(root.right))+1;

        balance(root);

        return root;
    }

    private AVLNode balance(AVLNode root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.left)<0)
                root.left=rotateLeft(root.left);
            return rotateRight(root);
        }
        else if (isRightHeavy(root)) {
            if (balanceFactor(root.right)>0)
                root.right=rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }

    private int height(AVLNode node) {
        return (node==null) ? -1 : node.height;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node)<-1;
    }

    private int balanceFactor(AVLNode node) {
        return (node==null) ? 0 : height(node.left)-height(node.right);
    }

    public boolean isBalanced() {
        if (node==null)
            return true;

        if (height(node.left)-height(node.right)<0
        && height(node.right)-height(node.left)>0) {
            return true;
        }
        return false;
    }

    private AVLNode rotateLeft(AVLNode root) {
        var newRoot=root.right;

        root.right=newRoot.left;
        newRoot.left=root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AVLNode node) {
        node.height=Math.max(height(node.left), height(node.right))+1;
    }

    public AVLNode rotateRight(AVLNode root) {
        var newRoot=root.left;

        root.left=newRoot.right;
        newRoot.right=root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }
}
