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

    public void remove() {
        if (isEmpty())
            throw new IllegalStateException();

        // move the value of last node to into the root node
        items[0]=items[size-1];
        size--;

        //execute bubble down algorithm item(root) < children
        var index=0;
        while (index<=size && !isValidIndex(index)) {
            var largerChildIndex=largerChildIndex(index);
            swap(index, largerChildIndex);
            index=largerChildIndex;
        }
    }

    private int largerChildIndex(int index) {
        return (leftChild(index) > rightChild(index) ?
                leftChildIndex(index) : rightChildIndex(index));
    }

    private boolean isValidIndex(int index) {
        return items[index] >= leftChild(index)
                && items[index] >= rightChild(index);
    }

    private int rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    private int leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    public boolean isEmpty() {
        return size==0;
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
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
