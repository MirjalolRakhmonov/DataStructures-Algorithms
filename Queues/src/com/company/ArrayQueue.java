package com.company;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;

    public ArrayQueue(int capacity){
        items=new int[capacity];
    }
    private int count;
    private int front;
    private int rear;

    public void enqueue(int item){
        if (count== items.length)
            throw new IllegalStateException();

        items[rear]=item;
        rear=(rear+1)%items.length;
        count++;
    }

    public int dequeue(){
        if (count==0)
            throw new IllegalStateException();

        //--count;
        var item= items[front];
        items[front]=0;
        front=(front+1)%items.length;
        count--;
        return item;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
        //var context=Arrays.copyOfRange(items, front, count);
        //return Arrays.toString(context);
    }

    public int peek(){
        if (count==0)
            throw new IllegalStateException();

        return items[front ++];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public boolean isFull(){
        return count>0;
    }
}
