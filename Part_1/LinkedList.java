package com.company;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int data;
        private Node next;

        public Node(int value){this.data =value;}
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int element){
        var node=new Node(element);
        if (first==null)
            first=last=node;
        else {
            node.next=first;
            first=node;
        }
        size++;
    }

    public void addLast(int element){
        var node=new Node(element);

        if (isEmpty())
            first=last=node;
        else {
            last.next=node;
            last=node;
        }
        size++;
    }

    public boolean isEmpty(){return first==null;}

    public int indexOf(int item){
        int index=0;
        var current=first;
        while (current!=null){
            if (current.data==item) return index;
            current=current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        var current=first;
        while (current!=null) {
            if (current.data==item) return true;
            current=current.next;
        }
        return false;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first==last){
            first=last=null;
            return;
        }

        var second=first.next;
        first.next=null;
        first=second;

        size--;
    }

    public void removeLast(){
        if (isEmpty())
           throw new NoSuchElementException();

        if (first==last) {
            first=last=null;
            size=0;
            return;
        }

        var previous=getPrevious(last);
        last=previous;
        last.next=null;

        size--;

        /* var current=first;
        while (current!=null){
            if (current.next==last) break;
            current=current.next;
        } */
    }

    private Node getPrevious(Node node){
        var current=first;
        while (current!=null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int []array=new int[size];
        var index=0;
        var current=first;
        while (current!=null){
            array[index++]=current.data;
            current=current.next;
        }
        return array;
    }

    /* public Node reverse(Node first){  // Iterative way
        Node prev=null;
        Node current=first;
        Node next=null;  // These are initial pointers

        while (current!=null){
            next=current.next; // Save the next
            current.next=prev; // reverse
            prev=current;
            current=next;
        }
        return prev; // new head at the end
    }

    public Node reverseLinkedList(Node head){
        if (head==null || head.next==null){
            return head;
        }

        Node reveredListHead=reverseLinkedList(head.next); // reverse linkedlist excluding myself(head.next)
        head.next.next=head; // the last node is being equalled as "the first node"
        head.next=null;
        return reveredListHead;
    } */

    public void reverse(){
        if (isEmpty()) return;
        var previous=first;
        var current=first.next;
        while (current!=null){
            var next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        last=first;
        last.next=null;
        first=previous;
    }

    public int getKthFromTheEnd(int k){
        var a=first;
        var b=first;
        int counter=1;
        while (counter<=k-1){
            b=b.next;
            counter++;
        }

        while (b.next!=null){
            b=b.next;
            a=a.next;
        }

        return a.data;
    }

    public int findKthFromTheEnd(int k){
        if (isEmpty())
            throw new IllegalStateException();

        var fir=first;
        var sec=first;
        for (int i=0; i<k-1; i++){
            sec=sec.next;
            if (sec==null)  // k > size of linked list(k>size)
                throw new IllegalArgumentException();
        }
        while (sec!=last){
            fir=fir.next;
            sec=sec.next;
        }
        return fir.data;
    }

    public void findMiddle(){
        var firstPoint=first;
        var secondPoint=first;
        if (first!=null){
            while (secondPoint!=last && secondPoint.next!=last){
                secondPoint=secondPoint.next.next;
                firstPoint=firstPoint.next;
            }
            if (secondPoint==last)
            System.out.println("The middle element is : "+firstPoint.data);
            else
                System.out.println("The middle values are: "+firstPoint.data+ " and "+firstPoint.next.data);
        }
    }

    public void printMiddle(){
        var a=first;
        var b=first;

        while (b!=last && b.next!=last){
            a=a.next;
            b=b.next.next;
        }

        if (b==last)
            System.out.println(a.data);
        else
            System.out.println(a.data+" , "+a.next.data);
    }

    public boolean hasLoop(){  // nedds to be adressed
        var slowPointer=first;
        var fastPointer=first;

        while (fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;

            if (slowPointer==fastPointer)
                return true;
        }
        return false;
    }
}
