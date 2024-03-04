package com.learning.core.day2;
import java.util.Scanner;
public class D02P15 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        
	        int positiveCount = 0;
	        int negativeCount = 0;
	        int zeroCount = 0;
	        
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt();
	            if (num > 0) {
	                positiveCount++;
	            } else if (num < 0) {
	                negativeCount++;
	            } else {
	                zeroCount++;
	            }
	        }
	        
	        System.out.println("Number of positive numbers: " + positiveCount);
	        System.out.println("Number of negative numbers: " + negativeCount);
	        System.out.println("Number of zero numbers: " + zeroCount);
	    }
	}