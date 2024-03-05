package com.learning.core.day3;
import java.util.Scanner;
public class D03P03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Create an array of capacity 18 integers
        int[] array = new int[18];

        // Ask the user to enter 15 integers in a single line
        System.out.print("Enter 15 integers separated by space: ");
        for (int i = 0; i < 15; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
            array[i] = scanner.nextInt();
        }

        // Take zeroes for the remaining 3 places in the array
        for (int i = 15; i < 18; i++) {
            array[i] = 0;
        }

        // Perform actions
        // a) Add nums from index 0 to 14 and replace 0 at index 15 with this result
        array[15] = calculateSum(array, 0, 14);

        // b) Compute average of all nums from index 0 to 14 and replace 0 at index 16 with this result
        array[16] = calculateAverage(array, 0, 14);

        // c) Identify smallest value in array and replace 0 at index 17 with this result
        array[17] = findSmallestValue(array);

        // Display the modified array
        System.out.println("Modified array: " + java.util.Arrays.toString(array));

        scanner.close();
    }

    // Helper function to calculate the sum of elements in a range
    private static int calculateSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Helper function to calculate the average of elements in a range
    private static int calculateAverage(int[] array, int start, int end) {
        int sum = calculateSum(array, start, end);
        //return sum / (end - start + 1);
        return (int) Math.ceil((double) sum / (end - start + 1));
    }

    // Helper function to find the smallest value in an array
    private static int findSmallestValue(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0 && array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}