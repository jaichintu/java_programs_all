package newlogicsclass;

import java.util.Scanner;

public class XylemPhloem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is positive
        if (num < 0) {
            System.out.println("The number must be positive.");
            return;
        }

        // Find the extreme digits of the number
        int firstDigit = num / 10;
        int lastDigit = num % 10;

        // Find the mean digits of the number
        int meanDigits = num / 10 - firstDigit - lastDigit;

        // Calculate the sum of the extreme digits and the mean digits
        int extremeSum = firstDigit + lastDigit;
        int meanSum = meanDigits / 10 + meanDigits % 10;

        // Check if the sums are equal
        if (extremeSum == meanSum) {
            System.out.println(num + " is a Xylem number.");
        } else {
            System.out.println(num + " is a Phloem number.");
        }
    }
}
