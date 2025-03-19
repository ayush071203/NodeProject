package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumToZero {

    public static void main(String[] args) {
        int[] arr = { -4, -1, -1, 0, 1, 2 }; // Example array

        System.out.println("Array: " + Arrays.toString(arr));
        List<List<Integer>> result = findTriplets(arr);

        if (result.isEmpty()) {
            System.out.println("No triplets found that sum to zero.");
        } else {
            System.out.println("Triplets that sum to zero: " + result);
        }
    }

    public static List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        int n = arr.length;

        // Sort the array for easier triplet detection
        Arrays.sort(arr);

        // Iterate through the array
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            // Use two pointers to find the triplet
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    triplets.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets;
    }
}
