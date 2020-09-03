package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TwoStacks {
    int[]array;
    int size, top1, top2;

    public TwoStacks(int num){
        array=new int[num];
        size=num;
        top1=-1;
        top2=size;
    }

    public void push1(int element){
        if (top1<top2-1)
            array[++top1]=element;
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public void push2(int element){
        if (top1<top2-1)
            array[--top2]=element;
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public int pop1(){
        if (top1>=0) {
            return array[top1--];
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public int pop2(){
        if (top2>=0){
            return array[top2--];
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public String toString(){
        var context=Arrays.copyOfRange(array,0,size);
        return Arrays.toString(context);
    }
}
