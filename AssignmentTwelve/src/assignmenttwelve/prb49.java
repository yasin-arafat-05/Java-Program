/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
  Write a Java program to find the first non-repeating character from a stream of characters.
Sample Output:String: godisgood
Reading: g
The first non-repeating character so far is: g
Reading: o
The first non-repeating character so far is: g
Reading: d
The first non-repeating character so far is: g
Reading: i
The first non-repeating character so far is: g
Reading: s
The first non-repeating character so far is: g
Reading: g
The first non-repeating character so far is: o
Reading: o
The first non-repeating character so far is: d
Reading: o
The first non-repeating character so far is: d
Reading: d
The first non-repeating character so far is: i
 */
public class prb49 {
    public static void main(String[] args) {
        String stream = "godisgood";

        // Find the first non-repeating character from the stream
        System.out.println("String: " + stream);
        findFirstNonRepeating(stream);
    }

    private static void findFirstNonRepeating(String stream) {
        // Map to store the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();
        // Queue to maintain the order of characters in the stream
        Queue<Character> queue = new LinkedList<>();

        for (char c : stream.toCharArray()) {
            // Update the frequency of the character in the map
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);

            // Add the character to the queue if it's not repeated
            while (!queue.isEmpty() && charFrequency.get(queue.peek()) > 1) {
                queue.poll();
            }

            // Print the first non-repeating character so far
            if (queue.isEmpty()) {
                System.out.println("Reading: " + c);
                System.out.println("The first non-repeating character so far is: " + c);
            }

            // Add the character to the queue
            queue.offer(c);
        }
    }
}
