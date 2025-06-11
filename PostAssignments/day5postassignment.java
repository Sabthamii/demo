package addon_dsa;

import java.util.Scanner;

public class day5postassignment {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null, tail = null;

    // INSERTION 
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; 
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  
        }
        System.out.println(data + " inserted.");
    }

    // DELETE 
    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head, prev = tail;
        boolean found = false;

        do {
            if (current.data == data) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println(data + " not found.");
            return;
        }

        
        if (head == tail && head.data == data) {
            head = null;
            tail = null;
            System.out.println(data + " deleted.");
            return;
        }

       
        if (current == head) {
            head = head.next;
            tail.next = head;
        } 
        
        else if (current == tail) {
            tail = prev;
            tail.next = head;
        } 
      
        else {
            prev.next = current.next;
        }
        System.out.println(data + " deleted.");
    }

    // DISPLAY 
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("List (forward): ");
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    
    
    void createList() {
        int[] list = {10, 20, 30, 40, 50};
        for (int val : list) {
            insert(val);
        }
    }

    public static void main(String[] args) {
        day5postassignment list = new day5postassignment();
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
