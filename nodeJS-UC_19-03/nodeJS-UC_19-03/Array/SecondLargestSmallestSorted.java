package Array;

import java.util.Arrays;
import java.util.Random;

public class SecondLargestSmallestSorted {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        // Generate and store 10 random 3-digit numbers
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(900) + 100; // Generates numbers from 100 to 999
        }

        // Display the generated numbers
        System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find second largest and second smallest without sorting
        findSecondLargestSmallest(numbers);

        // Sort the array
        Arrays.sort(numbers);
        System.out.print("Sorted numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the second largest and second smallest using sorting
        System.out.println("Second Smallest (Sorted): " + numbers[1]);
        System.out.println("Second Largest (Sorted): " + numbers[numbers.length - 2]);
    }

    public static void findSecondLargestSmallest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // Finding largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // Finding smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second Largest (Without Sorting): " + secondLargest);
        System.out.println("Second Smallest (Without Sorting): " + secondSmallest);
    }
}
