package addon_dsa;


class DoublyLinkedList {
   
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

   
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Traverse forward
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Traverse backward
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}


public class day4task1 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        
        list.addNode(150);
        list.addNode(270);
        list.addNode(320);
        list.addNode(480);
        list.displayForward();   
        list.displayBackward(); 
    }
}
