package com.company;

public class Main {

    public static void main(String[] args) {
        // 10                   10
        //   20 (-1)              30(1) balanceFactor(root.right)>0
        //     30               20
        // leftRotate(10)       rightRotate(30)
        //                      leftRotate(10)

        var tree = new AVLTree();
        tree.insert(10);
        tree.insert(30);
        tree.insert(20);
    }
}
