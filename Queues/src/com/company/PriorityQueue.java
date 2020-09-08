package com.company;

import java.util.Arrays;

public class PriorityQueue {
    private int [] items=new int[5];
    private int count;

    public void add(int item){
        if (count==items.length)
            throw new IllegalStateException();

        // we have to iterate this array from the end to beginning
        int i;
        for (i=count-1; i>=0; i--){ // why count-1? if we`ve 5 items , index of last item=4;
            // in each iteration, we should get the item at current index
            if (items[i]>item)
            items[i+1]=items[i];
            else
                break;
        } // this for loop is for shifting items
        items[i+1]=item;
        count++;
    }

    public int remove(){
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty(){
        return count==0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
