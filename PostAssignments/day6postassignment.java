package addon_dsa;

public class day6postassignment {
	// Simple stack using singly linked list in Java
	class Stack {
	    // Node class for linked list
	    class Node {
	        int data;
	        Node next;
	    }

	    // Top of stack
	    Node top = null;

	    // Push an element onto the stack
	    void push(int value) {
	        Node newNode = new Node();
	        newNode.data = value;
	        newNode.next = top;
	        top = newNode;
	        System.out.println(value + " pushed to stack");
	    }

	    // Pop an element from the stack
	    void pop() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println(top.data + " popped from stack");
	            top = top.next;
	        }
	    }

	    // Display the stack
	    void display() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	        } else {
	            Node temp = top;
	            System.out.print("Stack: ");
	            while (temp != null) {
	                System.out.print(temp.data + " ");
	                temp = temp.next;
	            }
	            System.out.println();
	        }
	    }

	    // Main method to test stack
	    public static void main(String[] args) {
	        Stack s = new Stack();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.display();  // Output: Stack: 30 20 10
	        s.pop();      // Output: 30 popped from stack
	        s.display();  // Output: Stack: 20 10
	    }
	}

}
