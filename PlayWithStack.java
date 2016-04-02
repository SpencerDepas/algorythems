package com.clearfaun.algorythems;


import java.util.Stack;

/**
 * Created by SpencerDepas on 3/31/16.
 */
public class PlayWithStack {

    private Stack stack;

    public void fillStack(){
        stack = new Stack();

        stack.push("abba baba");
        stack.push("Zera");
        stack.push("Maya");
        stack.push("Glenn");
        stack.push("Ric");


    }

    public void printStack(){
         System.out.print(stack);
    }

    int i = 0 ;
    public void showpush(String pushString) {
        stack.push(pushString + i);
        i++;
        System.out.println("push(" + pushString + ")");
        System.out.println("stack: " + stack);
    }

    int u = 0 ;

    public void showpop() {

        System.out.println("poping -> " + stack.pop() );


        System.out.println("stack: " + stack.toString());
    }

    public void peek() {

        System.out.println("peek -> " + stack.peek() );

    }

}
