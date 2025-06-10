package addon_dsa;

public class day4task2 {

    static class DoublyLinkedList {
        private static class Node {
            int data;
            Node prev, next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node head;

        void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }

        void insertInMiddle(int data) {
            Node newNode = new Node(data);
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }

            if (count <= 1) {
                newNode.next = head;
                if (head != null) head.prev = newNode;
                head = newNode;
                return;
            }

            int mid = count / 2;
            temp = head;
            for (int i = 0; i < mid - 1; i++) temp = temp.next;

            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) temp.next.prev = newNode;
            temp.next = newNode;
        }

        void printList() {
            Node temp = head;
            System.out.print("List: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(100);
        dll.append(200);
        dll.append(300);
        dll.append(400);

        System.out.println("Before Insertion:");
        dll.printList();

        dll.insertInMiddle(250);

        System.out.println("After Insertion:");
        dll.printList();
    }
}
