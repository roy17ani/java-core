package com.learning.core.day8;
import java.util.Scanner;
public class D08P01 {

	private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public D08P01(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        nItems++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queueArray[front];
        front = (front + 1) % maxSize;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void display() {
        int i = front;
        while (i != rear) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println(queueArray[rear]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        D08P01 queue = new D08P01(size);

        System.out.print("Enter elements to enqueue separated by spaces: ");
        for (int i = 0; i < size; i++) {
            queue.enqueue(scanner.nextInt());
        }

        System.out.print("Elements in queue: ");
        queue.display();

        int removedElement = queue.dequeue();
        System.out.println("After removing first element: ");
        queue.display();
    }
}
