package com.company;

import java.util.*;

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
        Print();

        // a green apple
        // a=2
        //  =2
        // g=1
        CharFinder finder=new CharFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        var chars=finder.getFirstRepeatedChar("green apple");
        System.out.println(chars);

        Map<Integer, String>map=new HashMap<>();
        map.put(123456, "Mirjalol");
        // items[1]="Mirjalol"
        // 100
        // 0-99
        System.out.println(hash(123456)); */

        // HashTable
        // put(k,v)
        // get(k): v
        // remove(k)
        // k: int, v: string
        // Collisions: chaining
        // LinkedList<Entry>[]
        // [ LL, LL, LL, LL ]

        HashTable table=new HashTable();
        table.put(6,"A"); // 6/5=1
        table.put(8,"B"); // 8/5=3
        table.put(11,"B"); // 11/5=1
        table.put(6,"A+");
        table.remove(6);
        System.out.println(table.get(6));
    }

    public static int hash(int number){
        return number % 100;
    }

    /*public static void reverse(Queue<Integer>queue){
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
    }*/
}
