package HarshdeepSingh_sec002_ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split input string into words
        String[] words = input.split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            // Get current count of the word, or 0 if it doesn't exist yet
            int count = wordCounts.getOrDefault(word, 0);
            // Increment the count
            wordCounts.put(word, count + 1);
        }

        // Find minimum and maximum counts
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;
        for (int count : wordCounts.values()) {
            if (count < minCount) {
                minCount = count;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Display words with minimum and maximum counts
        System.out.println("Words with minimum count (" + minCount + "):");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == minCount) {
                System.out.println(entry.getKey() + " - " + minCount);
            }
        }

        System.out.println("\nWords with maximum count (" + maxCount + "):");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey() + " - " + maxCount);
            }
        }

        // Display the entire map
        System.out.println("\nMap contains:");
        System.out.println("Key\t\tValue");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }

        // Display size and isEmpty status
        System.out.println("\nsize: " + wordCounts.size());
        System.out.println("isEmpty: " + wordCounts.isEmpty());
    }
}

