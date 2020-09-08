package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /* Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue); */

        /*StackQueue queue=new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        //var front=queue.dequeue();
        //System.out.println(front); */

        PriorityQueue queue=new PriorityQueue();
        queue.add(5);
        queue.add(2);
        queue.add(4);
        queue.add(3);
        queue.add(1);
        System.out.println(queue);
        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }

    public static void reverse(Queue<Integer>queue){
        Stack<Integer>stack=new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
        queue.add(stack.pop());
    }
}
