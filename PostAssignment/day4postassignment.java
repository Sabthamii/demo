package addon_dsa;

import java.util.Scanner;

public class day4postassignment {

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null, tail = null;

    // INSERTION at end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println(data + " inserted.");
    }

    // DELETE node by value
    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            System.out.println(data + " not found.");
            return;
        }

        // If node to delete is head
        if (current == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null; // list became empty
        }
        // If node to delete is tail
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        // Node is in the middle
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println(data + " deleted.");
    }

    // DISPLAY list forward
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("List (forward): ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Initialize list with some values
    void createList() {
        int[] list = {10, 20, 30, 40, 50};
        for (int val : list) {
            insert(val);
        }
    }

    public static void main(String[] args) {
        day4postassignment list = new day4postassignment();
        list.createList();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insert(val);
                }
                case 2 -> {
                    System.out.print("Enter value to delete: ");
                    int val = sc.nextInt();
                    list.delete(val);
                }
                case 3 -> list.display();
                case 4 -> {
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
