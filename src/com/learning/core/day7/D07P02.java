package com.learning.core.day7;
import java.util.Scanner;
class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            return Double.NaN; // Indicates stack underflow
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class D07P02 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        System.out.println("Enter elements for the stack (separated by spaces):");
        String[] inputTokens = scanner.nextLine().split("\\s+");

        // Push user input doubles onto the stack
        for (String token : inputTokens) {
            try {
                stack.push(Double.parseDouble(token));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter valid doubles only.");
                return;
            }
        }

        System.out.print("The elements of the stack are: ");
        stack.printStack();

        stack.pop();
        stack.pop();

        System.out.print("After popping twice: ");
        stack.printStack();

        scanner.close();
    }
}