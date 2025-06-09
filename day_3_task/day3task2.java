package addon_dsa;

public class day3task2 {
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    void insert(int data) {
        if (head == null) head = new Node(data);
        else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = new Node(data);
        }
    }

    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node cur = head;
        int count = 1;
        while (cur.next != null && count < pos - 1) {
            cur = cur.next;
            count++;
        }
        newNode.next = cur.next;
        cur.next = newNode;
    }

    void traverse() {
        for (Node cur = head; cur != null; cur = cur.next)
            System.out.print(cur.data + " ,"
            		+ " ");
        System.out.println("null");
    }

    public static void main(String[] args) {
        day3task2 list = new day3task2();
        list.insert(300);  
        list.insert(325);
        list.insert(350);
        list.traverse();
        list.insertAtPosition(400, 3);
        list.traverse();
        list.insertAtPosition(315, 1);
        list.traverse();
        list.insertAtPosition(375, 10);
        list.traverse();
    }
}
