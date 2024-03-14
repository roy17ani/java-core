package com.learning.core.day5;
import java.util.*;

class Worker implements Comparable<Worker> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Worker(int id, String name, int age, double salary) {
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
        return id + " " + name + " " + salary;
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
        Worker worker = (Worker) obj;
        return id == worker.id;
    }

    @Override
    public int compareTo(Worker other) {
        return Integer.compare(this.id, other.id);
    }
}
public class D05P07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Worker> workerSet = new TreeSet<>();

        // Taking input for 6 workers
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter details for worker " + i + ":");
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

            workerSet.add(new Worker(id, name, age, salary));
        }

        // Printing id, name, and salary of each worker
        for (Worker worker : workerSet) {
            System.out.printf("%d %s %.1f\n", worker.getId(), worker.getName(), worker.getSalary());
        }
    }
}