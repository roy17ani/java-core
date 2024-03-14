package com.learning.core.day5;
import java.util.*;

class Individual implements Comparable<Individual> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Individual(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Individual individual = (Individual) obj;
        return id == individual.id;
    }

    @Override
    public int compareTo(Individual other) {
        return Integer.compare(this.id, other.id);
    }
}


public class D05P10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Individual> individualSet = new TreeSet<>();

        // Taking input for 6 individuals
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter details for individual " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            individualSet.add(new Individual(id, name, age, salary));
        }

        // Finding and printing the first individual whose name starts with "j"
        boolean found = false;
        for (Individual individual : individualSet) {
            if (individual.getName().toLowerCase().startsWith("j")) {
                System.out.println("First individual whose name starts with 'j': " + individual);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No individual found whose name starts with 'j'");
        }
    }
}