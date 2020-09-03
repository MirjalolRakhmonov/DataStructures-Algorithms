package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class StackList {
    LinkedList<Integer> list=new LinkedList<>();
    private int counter=0;

    public void push(int item){
        list.add(item);
        counter++;
    }

    public int pop(){
        if (list.isEmpty())
            throw new IllegalStateException();

        counter--;
        return list.removeLast();
    }

    public String toString(){
        var context= Arrays.copyOfRange(list.toArray(),0,counter);
        return Arrays.toString(context);
    }

    public int peek(){
        if (list.isEmpty())
            throw new IllegalStateException();

        return list.getLast();
        //counter-1;
    }

    public boolean isEmpty(){
        return counter==0;
    }
}
