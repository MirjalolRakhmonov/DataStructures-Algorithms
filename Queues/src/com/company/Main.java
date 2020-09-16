package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /*queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int k =3;
        reversingFirstKitemsFromQueue(k);
        Print(); */

        /*StackQueue queue=new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        var front=queue.dequeue();
        System.out.println(front); */

        /*PriorityQueue queue=new PriorityQueue();
        queue.add(5);
        queue.add(2);
        queue.add(4);
        queue.add(3);
        queue.add(1);
        System.out.println(queue);
        while (!queue.isEmpty())
            System.out.println(queue.remove()); */

        LinkedListQueue queue=new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer>queue){
        Stack<Integer>stack=new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
        queue.add(stack.pop());
    }

    static Queue<Integer>queue;
    public static void reversingFirstKitemsFromQueue(int k){
        if (queue.isEmpty() == true
                || k > queue.size())
            return;
        if (k <= 0)
            return;

        Stack<Integer>stack=new Stack<>();

        // We are taking first k elements from queue to stack
        for (int i=0; i<k; i++){
            stack.push(queue.peek());
            queue.remove();
        }

        // We are taking these elements back to queue because when we
        // take items from stack , it starts taking from the end, so the order will be reversed
        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }

        for (int i=0; i<queue.size()-k; i++){
            queue.add(queue.peek());
            queue.remove();
        }
    }

    static void Print(){
        while (!queue.isEmpty()) {
            System.out.println(queue.peek() + " ");
            queue.remove();
        }
    }
}
