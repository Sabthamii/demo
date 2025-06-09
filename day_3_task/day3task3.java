package addon_dsa;

public class day3task3 {
    static class LinkedList {
        Node head;
        class Node {
            int data;
            Node next;
            Node(int d) { data = d; }
        }

        void deleteAt(int pos) {
            if (head == null) return;
            if (pos == 0) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 0; temp != null && i < pos - 1; i++)
                temp = temp.next;
            if (temp == null || temp.next == null) return;
            temp.next = temp.next.next;
        }

        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;
            }
        }

        void print() {
            for (Node temp = head; temp != null; temp = temp.next)
                System.out.print(temp.data + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(101); 
        list.add(120);
        list.add(300);
        list.add(450);
        list.print();         
        list.deleteAt(2);  
        list.print();          
    }
}
