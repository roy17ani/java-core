package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Person {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Person(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }
}
public class D06P14 {

	public static void main(String[] args) {
        // Predefined employee details
        Hashtable<Integer, Person> personTable = new Hashtable<>();
        personTable.put(1001, new Person(1001, "Grace", "Tech Support", "HR"));
        personTable.put(1002, new Person(1002, "Robert", "Product Manager", "development"));
        personTable.put(1003, new Person(1003, "Thomas", "Tester", "Testing"));
        personTable.put(1004, new Person(1004, "Daniel", "Analyst", "L&D"));

        // Current collection with some data
        Hashtable<Integer, Person> currentCollection = new Hashtable<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter person details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            currentCollection.put(id, new Person(id, name, department, designation));

            System.out.print("Do you want to add another person? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // Add person details from current collection to the person table
        personTable.putAll(currentCollection);
        System.out.println("Person details added successfully!");

        // Display the updated person table
        System.out.println("Person Table:");
        for (Map.Entry<Integer, Person> entry : personTable.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
    }
}