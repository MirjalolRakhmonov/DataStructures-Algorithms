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

        /* StackList stack=new StackList();
        //System.out.println(stack.isEmpty());
        stack.push(12);
        stack.push(17);
        stack.push(20);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack); */

        TwoStacks ts=new TwoStacks(6);
        ts.push1(5);
        ts.push2(10);
        ts.push1(22);
        ts.push1(11);
        ts.push2(7);
        ts.push2(40);
        System.out.println(ts);
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());
        System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());
    }
}
