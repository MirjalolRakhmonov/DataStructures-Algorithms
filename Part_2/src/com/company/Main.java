package com.company;

public class Main {

    public static void main(String[] args) {
        // Tree (root field with Node Object) class
        // Node (value, leftChild, rightChild) - private class inside Tree class
        // insert(value)
        // find(value):boolean

        // var current = root;
        var tree=new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        var tree2=new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);
        System.out.println(tree.equals(tree2));
    }
}
