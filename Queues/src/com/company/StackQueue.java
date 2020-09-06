package com.company;

import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack1=new Stack<>();  // for enqueue method
    Stack<Integer> stack2=new Stack<>();  // for dequeue emthod

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());

            return stack2.pop();
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());

            return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
