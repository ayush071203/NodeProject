package Array;

import java.util.Random;

public class SecondLargestSmallest {
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

        // Find the second largest and second smallest elements without sorting
        findSecondLargestSmallest(numbers);
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

        System.out.println("Second Largest Number: " + secondLargest);
        System.out.println("Second Smallest Number: " + secondSmallest);
    }
}
