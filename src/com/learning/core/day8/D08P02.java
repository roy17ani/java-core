package com.learning.core.day8;
import java.util.Scanner;
class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class D08P02 {

	private QueueNode front, rear;

    public D08P02() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (isEmpty()) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        D08P02 queue = new D08P02();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements to enqueue:");
        for (int i = 0; i < n; i++) {
            queue.enqueue(scanner.nextInt());
        }

        System.out.print("Elements in queue: ");
        queue.display();

        // Remove two elements
        queue.dequeue();
        queue.dequeue();

        System.out.println("After removing two elements: ");
        queue.display();
    }
}