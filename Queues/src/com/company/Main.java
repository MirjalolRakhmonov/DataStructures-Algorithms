package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String>map=new HashMap<>();
        map.put(123456, "Mirjalol");
        // items[1]="Mirjalol"
        // 100
        // 0-99
        System.out.println(hash(123456));
    }

    public static int hash(int number){
        return number % 100;
    }

}
