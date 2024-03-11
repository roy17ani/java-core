package com.learning.core.day6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class D06P02 {

	public static void main(String[] args) {
        // Create a phone book HashMap
        Map<String, Long> phoneBook = new HashMap<>();

        // Predefined phone book details
        phoneBook.put("Amal", 998787823L);
        phoneBook.put("Manvitha", 937843978L);
        phoneBook.put("Joseph", 7882221113L);
        phoneBook.put("Smith", 8293893311L);
        phoneBook.put("Kathe", 7234560011L);

        // Input name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String nameToSearch = scanner.nextLine();

        // Perform search operation
        Long phoneNumber = phoneBook.get(nameToSearch);

        // Output the result
        if (phoneNumber != null) {
            System.out.println(nameToSearch + ": " + phoneNumber);
        } else {
            System.out.println("Phone number not found for " + nameToSearch);
        }
    }
}