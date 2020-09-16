package com.company;

import java.util.Arrays;

public class LinkedListQueue {
    private Node front, rear;
    private int currentSize;

    private class Node{
        public int data;
        public Node next;
    }

    public LinkedListQueue(){
        front=null;
        rear=null;
        currentSize=0;
    }

    public void enqueue(int element){
        var oldRear=rear=new Node();
        rear.data=element;
        rear.next=null;
        if (currentSize==0)
            front=rear;
        else {
            oldRear.next = rear;
        }
        currentSize++;
    }
}
