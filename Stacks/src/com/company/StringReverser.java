package com.company;

import java.util.Stack;

public class StringReverser {
    public String reverse(String index){
        if (index==null)
            throw new IllegalArgumentException();

        Stack<Character> stack=new Stack<>();
        for (char ch : index.toCharArray())
        stack.push(ch);

        StringBuffer reversed=new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
