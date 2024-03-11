package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
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
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P11 {

	public static void main(String[] args) {
        // Predefined employee details
        Employee employee1 = new Employee(1001, "Daniel", "L&D", "Analyst");
        Employee employee2 = new Employee(1002, "Thomas", "Testing", "Tester");
        Employee employee3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee employee4 = new Employee(1004, "Grace", "HR", "Tech Support");

        // Store employees in Hashtable with employee id as key
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
        employeeTable.put(employee1.getId(), employee1);
        employeeTable.put(employee2.getId(), employee2);
        employeeTable.put(employee3.getId(), employee3);
        employeeTable.put(employee4.getId(), employee4);
        // NOTE: Employee 5 will not be added due to duplicate id

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee id to search: ");
        int searchId = scanner.nextInt();
        scanner.close();

        // Search for the specific employee
        Employee searchEmployee = employeeTable.get(searchId);
        if (searchEmployee != null) {
            System.out.println("Employee found:");
            System.out.println(searchEmployee);
        } else {
            System.out.println("Employee not found.");
        }
    }
}
