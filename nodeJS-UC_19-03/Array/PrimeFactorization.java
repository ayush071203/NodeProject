package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int n = scanner.nextInt();
        scanner.close();

        // Perform Prime Factorization and store factors
        ArrayList<Integer> primeFactors = findPrimeFactors(n);

        // Display Prime Factors
        System.out.println("Prime Factors of " + n + ": " + primeFactors);
    }

    public static ArrayList<Integer> findPrimeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        // Step 1: Divide by 2 until n becomes odd
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Step 2: Check for odd factors from 3 to √n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // Step 3: If n is still greater than 2, it's a prime number
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}
