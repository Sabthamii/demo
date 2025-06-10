package addon_dsa;

public class day4mainprogram {

    
    static class DoublyLinkedList {
        static class Node {
            int data;
            Node prev;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        Node head, tail;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void traverseForward() {
            Node current = head;
            System.out.println("Forward traversal:");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void traverseBackward() {
            Node current = tail;
            System.out.println("Backward traversal:");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.traverseForward();
        list.traverseBackward();
    }
}
