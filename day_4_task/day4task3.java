package addon_dsa;

public class day4task3 {
    static class DoublyLinkedList {
        static class Node {
            int data;
            Node prev, next;

            Node(int data) {
                this.data = data;
                prev = next = null;
            }
        }

        Node head;

        void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }

        void deleteNode(Node node) {
            if (node == null) return;
            if (node == head) {
                head = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            if (node.prev != null) {
                node.prev.next = node.next;
            }
        }

        Node getMiddleNode() {
            if (head == null) return null;
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.append(111);
        dll.append(222);
        dll.append(333);
        dll.append(444);
        dll.append(555);

        System.out.print("List Before: ");
        dll.printList();

        DoublyLinkedList.Node middle = dll.getMiddleNode();
        System.out.println("Deleting middle node : " + middle.data);

        dll.deleteNode(middle);

        System.out.print("List After: ");
        dll.printList();
    }
}
