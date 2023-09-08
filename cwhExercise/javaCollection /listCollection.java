//package cwhExercise.javaCollection ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class listCollection {
    static void stackExamples(){
        //Stack এর মধ্যে কিছু special method available আছে।
         System.out.println("---------stack--------");
         Stack<Integer> st = new Stack<>();
         st.add(1);
         st.add(2);
         st.add(3);
         st.add(4);
         //.push() দিয়ে elemlent add করা যায় ।
         st.push(5);
         System.out.println(st);
         //.peek() সবার উপর বা সবচেয়ে শেষে কোন element add করা হইয়েছে ।
         // তা print  করবে । 
         System.out.println("peek : "+ st.peek());
         //.pop() সবার উপর বা সবচেয়ে শেষে কোন element remove করবে ।
         // আর তাকে show করতে পারবে । 
         System.out.println("deleted: "+st.pop());
         System.out.println(st);
         //.empty() stack emply কি না ।True of False.
         System.out.println(st.empty());
         System.out.println("size: "+st.size());

    }
    static void linkListExamples(){
        //যেহেতু linkList and array list
        // both implements the list class
        //তাই মোটামুটি সব একই । 
        System.out.println("---------linkList--------");
        LinkedList<Integer> al = new LinkedList<>();
        al.add(5);
        al.add(6);
        al.add(7);
        System.out.println(al);
        System.out.println(al.get(1));
        al.set(0, 120);
        System.out.println(al);
        System.out.println(al.contains(120));
        System.out.println("size: "+al.size());
    }
    static void arrayListExamples(){
         System.out.println("---------arraylist--------");
        //ArrayList 0 base indexing হয়ে থাকে । 
        ArrayList<Integer> al = new ArrayList<>();
        //.add() method use to add element in the ArrayList class.
        al.add(5);
        al.add(6);
        al.add(7);
        //print all the element of arraylist.
        System.out.println(al);
        //.get(n) method use to find the element present at index n.
        System.out.println(al.get(1));
        //.set(index,value) modify value.
        al.set(0, 120);
        System.out.println(al);
        //.contains(value) value is present or not. (True or False)
        System.out.println(al.contains(120));
        //.size() to check element number.
        System.out.println("size: "+al.size());
    }
    public static void main(String[] args) {
        arrayListExamples();
        System.out.println();
        linkListExamples();
        System.out.println();
        stackExamples();
    }
}
