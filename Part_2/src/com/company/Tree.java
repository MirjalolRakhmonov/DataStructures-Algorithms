package com.company;

import java.util.ArrayList;

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

    // O(log(n))
    public int min(){
        if (root==null)
            throw new IllegalStateException();

        var current=root;
        var last=current;
        while (current!=null){
            last=current;
            current=current.leftChild;
        }
        return last.value;
    }

    // O(n) because we have to traverse every single node
    private int min(Node root){
        if (root.leftChild==null && root.rightChild==null)
            return root.value;

        var left=min(root.leftChild);
        var right=min(root.rightChild);

        return Math.min(Math.min(left,right), root.value);
    }

    public boolean equals(Tree other) {
        if (other==null)
            return false;
        
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first==null && second==null)
            return true;

        if (first!=null && second!=null)
            return first.value==second.value
            && equals(first.leftChild, second.leftChild)
            && equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root==null)
            return true;

        if (root.value<min || root.value>max)
            return false;

        return isBinarySearchTree(root.leftChild, min, root.value-1)
                && isBinarySearchTree(root.rightChild, root.value+1, max);
    }

    public ArrayList<Integer> getNodesAtDistance(int distance) {
        var list =new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list ) {
        if (root==null)
            return;

        if (distance==0){
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.leftChild, distance-1, list);
        getNodesAtDistance(root.rightChild, distance-1, list);
    }

    public void traverseLevelOrder() {
        for (int i = 0; i<=height(); i++) {
            for (var value : getNodesAtDistance(i))
                System.out.println(value);
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node==null)
            return 0;

        return (size(node.leftChild) + 1 + size(node.rightChild));
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node node) {
        if (node==null)
            return 0;

        if (node.leftChild==null && node.rightChild==null)
            return 1;

        return countLeaves(node.leftChild)+countLeaves(node.rightChild);
    }

    public int max() {
        if (root==null)
            throw new IllegalStateException();

        var current=root;
        var first=current;
        while (current!=null) {
            first=current;
            current=current.rightChild;
        }
        return first.value;
    }

    private int max(Node node) {
        if (node.leftChild==null && node.rightChild==null)
            return node.value;

        var left=max(node.leftChild);
        var right=max(node.rightChild);

        return Math.max(Math.max(left,right), node.value);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node node, int value) {
        var current=root;
        while (current!=null) {
            if (value<current.value)
                current=current.leftChild;
            else if (value>current.value)
                current=current.rightChild;
            else
                return true;
        }
        return false;
    }
}
