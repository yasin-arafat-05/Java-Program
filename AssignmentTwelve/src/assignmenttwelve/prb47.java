/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmenttwelve;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
/**
  Write a Java program to rearrange a string so that the same characters are positioned a distance away.
Sample Output:The given string is: accessories
The string after arrange newly is:
secrsecisao
 */
public class prb47 {
       public static void main(String[] args) {
        String inputString = "accessories";
        int distance = 3;

        // Rearrange the string and print the result
        System.out.println("The given string is: " + inputString);
        System.out.println("The string after arrange newly is:");
        String rearrangedString = rearrangeString(inputString, distance);
        System.out.println(rearrangedString);
    }

    private static String rearrangeString(String s, int distance) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Use a max heap to prioritize characters by frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) ->
                charFrequencyMap.get(b) - charFrequencyMap.get(a));

        maxHeap.addAll(charFrequencyMap.keySet());

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            // Extract the character with the highest frequency
            char current = maxHeap.poll();
            int count = charFrequencyMap.get(current);

            // Append the character to the result
            for (int i = 0; i < count; i++) {
                result.append(current);

                // Update the frequency of the character in the map
                charFrequencyMap.put(current, charFrequencyMap.get(current) - 1);
            }

            // Add the character back to the max heap if it still has remaining occurrences
            if (charFrequencyMap.get(current) > 0) {
                maxHeap.offer(current);
            }

            // Add a placeholder if the distance is greater than 1
            for (int i = 1; i < distance && !maxHeap.isEmpty(); i++) {
                result.append("#");
            }
        }

        return result.toString();
    }
}
