package addon_dsa;

public class day5task3 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Delete 
    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        
        if (head.next == head) {
            head = null;
            return;
        }

        
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

      
        last.next = head.next;
      
        head = head.next;
    }

    
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        day5task3 clist = new day5task3();

      
        clist.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        clist.head.next = second;
        second.next = third;
        third.next = clist.head;

        System.out.print("List Before: ");
        clist.printList();

        clist.deleteHead();

        System.out.print("List  After: ");
        clist.printList();
    }
}
