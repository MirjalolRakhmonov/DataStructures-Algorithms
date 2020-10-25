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

        root.height=Math.max(height(root.left), height(root.right))+1;

        var balanceFactor=height(root.left)-height(root.right);
        if (balanceFactor>1)
            System.out.println( root.value + " is left heavy");
        else if (balanceFactor<-1)
            System.out.println(root.value + " is right heavy");

        return root;
    }

    private int height(AVLNode node) {
        return (node==null) ? -1 : node.height;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return height(node.left)-height(node.right) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return height(node.left)-height(node.right)<-1;
    }

    private int balanceFactor(AVLNode node) {
        return (node==null) ? 0 : height(node.left)-height(node.right);
    }
}
