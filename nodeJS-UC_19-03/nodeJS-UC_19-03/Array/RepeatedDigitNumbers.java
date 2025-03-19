package Array;

import java.util.ArrayList;

public class RepeatedDigitNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> repeatedDigitNumbers = findRepeatedDigits();

        // Convert ArrayList to Array
        Integer[] resultArray = repeatedDigitNumbers.toArray(new Integer[0]);

        // Display the Result
        System.out.print("Numbers with Repeated Digits: ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> findRepeatedDigits() {
        ArrayList<Integer> resultList = new ArrayList<>();

        // Iterate from 10 to 99 to find repeated digit numbers
        for (int i = 10; i <= 99; i++) {
            int tens = i / 10; // Extract the tens digit
            int units = i % 10; // Extract the units digit

            if (tens == units) { // Check if both digits are the same
                resultList.add(i);
            }
        }
        return resultList;
    }
}
