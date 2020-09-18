package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        // a green apple
        // a=2
        //  =2
        // g=1
        CharFinder finder=new CharFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);
    }

    }

