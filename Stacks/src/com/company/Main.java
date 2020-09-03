package com.company;

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

        /*String str="hello";
         StringReverser reverser=new StringReverser();
         var result=reverser.reverse(str);
        System.out.print(result);*/

        // Edge cases
        // (
        // (()
        // (]
        // )(

        /* String expression="{1+2{    ";
        ExpressionBalancer balancer=new ExpressionBalancer();
        var solution=balancer.isBalanced(expression);
        System.out.println(solution); */
        /*Stack newStack=new Stack();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.pop();
        System.out.println(newStack);
        System.out.println(newStack.peek()); */

        StackList stack=new StackList();
        //System.out.println(stack.isEmpty());
        stack.push(12);
        stack.push(17);
        stack.push(20);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
