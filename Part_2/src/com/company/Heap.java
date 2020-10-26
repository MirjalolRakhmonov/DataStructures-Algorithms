package com.company;

public class Heap {
    private int[] items=new int[10];
    private int size;

    public void insert(int value) {
        if (isFull())
            throw new IllegalStateException();
        items[size++]=value; // this is how we store item in next available slot

        bubbleUp();
    }

    private void bubbleUp() {
        var index=size-1;
        while (index>0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index=parent(index);
        }
    }

    public boolean isFull() {
        return size==items.length;
    }

    private int parent(int index) {
        return (index-1) / 2;
    }

    private void swap(int first, int second) {
        var temp=items[first];
        items[first]=items[second];
        items[second]=temp;
    }
}
