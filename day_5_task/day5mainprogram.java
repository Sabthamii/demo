package addon_dsa;

public class day5mainprogram {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insertion
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Delete 
    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

       
        if (position == 0) {
           
            if (head.next == head) {
                head = null;
                return;
            }
           
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            return;
        }

       
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current.next == head) { // position out of bounds
                System.out.println("Position out of bounds");
                return;
            }
        }

        current.next = current.next.next;
    }

   
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        day5mainprogram list = new day5mainprogram();

      
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("List:");
        list.printList();

        list.deleteNode(2);
        System.out.println("After deleting node at position 2:");
        list.printList();

     
        list.deleteNode(0);
        System.out.println("After deleting head node:");
        list.printList();
    }
}
