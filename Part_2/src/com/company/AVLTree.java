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
}
