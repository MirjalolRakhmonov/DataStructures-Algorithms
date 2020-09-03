package com.company;

import java.util.Arrays;

public class Stack {
    private int[]myStack=new int[5];
    private int counter=0;

    /*public Stack(){
        myStack=new int[5]; // let`s imagine we`ve 5 elements in array
        counter =0; // keep track of where last element is on stack
    }*/

    // push
    public void push(int number){
        if (counter==myStack.length)
            throw new StackOverflowError("Stack is already full");

        myStack[counter++]=number;
    }
    // pop
    public int pop(){
        if (counter==0) // in case trying to pop while stack is empty
            throw new IllegalStateException("Cannot pop while stack is empty");

        return myStack[--counter];
    }

    @Override
    public String toString() {
        var content=Arrays.copyOfRange(myStack, 0,counter);
        return Arrays.toString(content);
    }

    // peek
    public int peek(){
        if (counter==0)
            throw new IllegalStateException("Cannot access item at index -1");

        return myStack[counter-1]; // returning the last item from the top of stack
    }
    // isEmpty
    public boolean isEmpty(){
        return counter==0;
        // return (counter==0)? true : false; // Alternative option
    }
    // use regular array int[] wanted to handle scenario where stack gets full
}
