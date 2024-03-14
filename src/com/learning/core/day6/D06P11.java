package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Scanner;

class Worker {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Worker(int id, String name, String department, String designation) {
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
        Worker worker = (Worker) obj;
        return id == worker.id;
    }
}

public class D06P11 {

	public static void main(String[] args) {
        // Predefined worker details
        Worker worker1 = new Worker(1001, "Daniel", "L&D", "Analyst");
        Worker worker2 = new Worker(1002, "Thomas", "Testing", "Tester");
        Worker worker3 = new Worker(1003, "Robert", "Development", "Product Manager");
        Worker worker4 = new Worker(1004, "Grace", "HR", "Tech Support");

        // Store workers in Hashtable with worker id as key
        Hashtable<Integer, Worker> workerTable = new Hashtable<>();
        workerTable.put(worker1.getId(), worker1);
        workerTable.put(worker2.getId(), worker2);
        workerTable.put(worker3.getId(), worker3);
        workerTable.put(worker4.getId(), worker4);
        // NOTE: Worker 5 will not be added due to duplicate id

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the worker id to search: ");
        int searchId = scanner.nextInt();
        scanner.close();

        // Search for the specific worker
        Worker searchWorker = workerTable.get(searchId);
        if (searchWorker != null) {
            System.out.println("Worker found:");
            System.out.println(searchWorker);
        } else {
            System.out.println("Worker not found.");
        }
    }
}
