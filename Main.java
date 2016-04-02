package com.clearfaun.algorythems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    LinkedList names = new LinkedList();

    public static void main(String[] args) {
	// write your code here

       // System.out.println("Helloooww");


//        Main linkedList = new Main();
//
//        linkedList.generateNamesInLinkedList();
//
//        linkedList.printLinkedList(); //O(n)
        //O(n)
        //output
        //
        //Joe
        //Vadim
        //Phil
        //Marcelino
        //Zeke
        //Zeke
        //Zeke
        //Phil
        //Phil

        System.out.println( );
        //linkedList.removeDuplicatesWithoutGoogling();
        //O(n) plus o(n)
        //output
        //Joe
        //Vadim
        //Phil
        //Marcelino
        //Zeke



        //linkedList.removeDuplicatesWithoutBufferAndWithoutGoogling();
        //o(n^2)

        //output
        //Joe
        //Vadim
        //Phil
        //Marcelino
        //Zeke



      //  linkedList.removeDuplicatesAfterGoogling();
        //O(n)

        //output
        //Joe
        //Vadim
        //Phil
        //Marcelino
        //Zeke

        //linkedList.printLinkedList();




//        PlayWithStack stack = new PlayWithStack();
//        stack.fillStack();
//
//        stack.printStack();
//
//        System.out.println("\n");
//        stack.showpop();
//        stack.showpop();
//        stack.showpop();
//        stack.peek();



        MyQueue queue = new MyQueue();
        //first in first out
        queue.insert(420);
        queue.insert(722);
        queue.insert(999);
        queue.insert(666);


        System.out.println("queue.peek() : " + queue.peek());
        queue.display();
        System.out.println("queue.remove : " + queue.remove());
        queue.display();
    }

    public void removeDuplicatesAfterGoogling(){
        System.out.println("removeDuplicatesAfterGoogling \n");

        HashSet<String> removeDuplicatesHashSet = new HashSet<String>();

        for(int i = 0 ; i < names.size(); i++){

            if(removeDuplicatesHashSet.contains(names.get(i).toString())){
                //if it does contain the element, that means we have a duplicate, so lets remove it
                names.remove(i);
                //not sure why I have to i--;
                i--;
                //System.out.println("adding to hashmap : " + names.get(i).toString());

            }else{
                //if it does not contain the element we add it
                removeDuplicatesHashSet.add(names.get(i).toString());

            }


        }


    }


    public void removeDuplicatesWithoutGoogling(){


        HashSet<String> removeDuplicates = new HashSet<String>();

        for(int i = 0 ; i < names.size(); i ++){

            removeDuplicates.add(names.get(i).toString());

        }
        names.clear();

        Iterator iterator = removeDuplicates.iterator();

        while (iterator.hasNext()){
            names.add(iterator.next());
        }




    }

    public void removeDuplicatesWithoutBufferAndWithoutGoogling(){

        System.out.println("removeDuplicatesWithoutBufferAndWithoutGoogling");



        for(int i = 0 ; i < names.size(); i ++){
            for(int z = 1 ; z < names.size(); z ++){

                if(i != z){
                    if(names.get(i).equals(names.get(z))){
                        names.remove(i);
                    }
                }

            }
        }





    }

    public void generateNamesInLinkedList(){
        names = new LinkedList();




        names.add("Zeke");
        names.add("Joe");
        names.add("Vadim");
        names.add("Phil");
        names.add("Marcelino");
        names.add("Zeke");
        names.add("Zeke");
        names.add("Zeke");
        names.add("Zeke");
        names.add("Phil");
        names.add("Phil");
    }

    public void printLinkedList(){
        for(int i = 0 ; i < names.size(); i ++){

            System.out.println(names.get(i));
        }
    }

}
