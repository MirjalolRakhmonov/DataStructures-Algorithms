package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        var list=new LinkedList();
        list.addLast(10);
        list.addLast(10);
        list.addLast(17);
        list.addLast(22);
        list.addLast(33);
        list.addLast(44);
        System.out.println(list.hasLoop());

        var array=list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
