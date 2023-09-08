//package cwhExercise.javaCollection ;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queueCollection {
    static void deQueueExamles(){
        //queue আর stack এর মিলিত একটা রূপ । 
        System.out.println("--------ArrayDeque--------");
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        /*
         * শুরুতে ১ তার আগে ২ এইভাবে।
         * শেষে ৪ তার পরে ৫ এইভাবে ।
         */
        ad.addFirst(1);
        ad.addFirst(2);
        ad.addFirst(3);
        ad.addLast(4);
        ad.addLast(5);
        ad.addLast(6);
        System.out.println("print all element: "+ad);
        System.out.println("poll first: "+ad.pollFirst());
        System.out.println("print all element: "+ad);
        System.out.println("poll last: "+ad.pollLast());
        System.out.println("print all element: "+ad);
        System.out.println("peek first element: "+ad.peekFirst());
        System.out.println("peek last element: "+ad.peekLast());
    }
    static void priorityQueueExamples(){
        System.out.println("--------Priority Queue--------");
        /*
        By default minimum priorityQueue হয়ে থাকে । 
        be defalut এর ক্ষেত্রে সর্বপ্রথম যেইটা ছোট হবে সেইটাকে peek element
        ধরবে ।
        */ 
        //by default min.
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        /*
         * Comparator দিয়ে আমরা maximum element কে
         * priority দিতে পারি। 
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.add(2);
        pq.offer(14);
        pq.add(3);
        System.out.println("print all element: " +pq);
        System.out.println("peek element : "+pq.peek());
        System.out.println("poll element: "+pq.poll());
        System.out.println("print all element: "+pq);
    }
    static void queueExamples(){
        //এখানে  লিংকলিস্ট কে আমরা quque দিয়ে implement করবো । 
        System.out.println("--------LinkList--------");
        LinkedList<Integer> ll = new LinkedList<>();
        //Element insert করার জন্য । 
        ll.offer(1);
        ll.offer(2);
        ll.add(3);
        System.out.println("peek : "+ll.peek()); //1
        //show and delete 1st বা head element.
        System.out.println("Remove: "+ll.poll());
        System.out.println("After Removing: "+ll.peek());
        System.out.println("Size: "+ll.size());
        System.out.println(ll);
    }
    public static void main(String[] args){
        queueExamples();
        System.out.println();
        priorityQueueExamples();
        System.out.println();
        deQueueExamles();
        System.out.println();
    }
}