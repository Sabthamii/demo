package addon_dsa;

public class day3mainprogram {
	 Node head;

	    
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    
	    public void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;

	        
	        while (current != null) {
	            next = current.next;   
	            current.next = prev;   
	            prev = current;        
	            current = next;        
	        }
	        head = prev;  
	    }

	    
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    public static void main(String[] args) {
	    	day3mainprogram list = new day3mainprogram();

	        
	        list.insert(35);
	        list.insert(45);
	        list.insert(55);
	        list.insert(65);
	        list.insert(100);

	        System.out.println("Original Linked List:");
	        list.printList();

	        // Reverse the linked list
	        list.reverse();

	        System.out.println("Reversed Linked List:");
	        list.printList();
	    }
}


