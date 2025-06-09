package addon_dsa;

public class day3task1 {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        
        public void traverse() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + ", ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(57);
        list.insert(68);
        list.insert(32);
        list.traverse();  
    }
}
