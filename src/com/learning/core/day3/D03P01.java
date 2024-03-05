package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Display the length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);
        
        // Display the string in uppercase
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}