package addon_dsa;

public class day5task2{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CircularLinkedList {
        Node tail;

        // Insert at tail
        public void insertAtTail(int data) {
            Node newNode = new Node(data);

            if (tail == null) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void printList() {
            if (tail == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = tail.next; 
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != tail.next);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtTail(10);
        cll.insertAtTail(20);
        cll.insertAtTail(30);

        cll.printList();  
    }
}
