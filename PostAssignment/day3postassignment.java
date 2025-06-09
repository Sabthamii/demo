package addon_dsa;

import java.util.Scanner;

public class day3postassignment {
    
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head = null;

// INSERTION
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println(data + " inserted.");
    }

    //DELETE
    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data)
            temp = temp.next;
        if (temp.next == null) System.out.println(data + " not found.");
        else {
            temp.next = temp.next.next;
            System.out.println(data + " deleted.");
        }
    }

    //DISPLAY
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // INTALIZATION
    void createList() {
        int[] List= {10, 20, 30, 40, 50};
        for (int val : List) {
            insert(val);
        }
    }

    public static void main(String[] args) {
        day3postassignment list = new day3postassignment();
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
