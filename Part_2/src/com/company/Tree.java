package com.company;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value=value;
        }

        @Override
        public String toString(){
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value){
        var node=new Node(value);
        if (root==null){
            root=node;
            return;
        }

        var current=root;
        while (true){
            if (value<current.value) {
                if (current.leftChild==null){  // that means we found a parent
                    current.leftChild=node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    current.rightChild=node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value){
        var current=root;
        while (current!=null){
            if (value<current.value)
                current=current.leftChild;
            else if (value>current.value)
                current=current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root){
        // Base condition, a moment we should stop going forward, we should go back
        if (root==null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if (root==null)
            return -1;

        if (root.leftChild==null && root.rightChild==null)
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int min(){
        return min(root);
    }

    private int min(Node root){
        if (root.leftChild==null && root.rightChild==null)
            return root.value;

        var left=min(root.leftChild);
        var right=min(root.rightChild);

        return Math.min(Math.min(left,right), root.value);
    }
}
