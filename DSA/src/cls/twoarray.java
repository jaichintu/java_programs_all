package cls;

import java.util.Scanner;

public class twoarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.println("Enter the size1 rows of the array: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter the size2 columns of the array: ");
        
        int size2=scanner.nextInt();

        // Create an array of the specified size
        int[][] arr = new int[size1][size2];

        // Take input from the user for each element of the array
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Enter the element at row " + i + " and column " + j + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Print the array
        System.out.println("The array is: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
