package HackerRank;

import java.util.Scanner;

public class XylemPhloemExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a xylem number
        boolean isXylem = isXylem(num);

        // Print the result
        if (isXylem) {
            System.out.println(num + " is a xylem number.");
        } else {
            System.out.println(num + " is a phloem number.");
        }
    }

    public static boolean isXylem(int num) {
        // Get the sum of the first and last digits
        int firstDigit = num / 10000;
        int lastDigit = num % 10;
        int sumOfFirstAndLastDigits = firstDigit + lastDigit;

        // Get the sum of the middle digits
        int sumOfMiddleDigits = 0;
        while (num > 10) {
            int middleDigit = num % 10;
            sumOfMiddleDigits += middleDigit;
            num /= 10;
        }

        // Check if the sum of the first and last digits is equal to the sum of the middle digits
        return sumOfFirstAndLastDigits == sumOfMiddleDigits;
    }
}
