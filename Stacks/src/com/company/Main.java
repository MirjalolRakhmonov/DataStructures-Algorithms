package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /*Scanner in =new Scanner(System.in);
        System.out.print("Enter string value: ");
        String str=in.nextLine();

        Stack<Character> stack=new Stack<>();

        for (int i=0; i<str.length(); i++){
                stack.push(str.charAt(i));
        }

        while (!stack.empty())
            System.out.print(stack.pop()); */

        String str="hello";
         StringReverser reverser=new StringReverser();
         var result=reverser.reverse(str);
        System.out.print(result);
    }
}
