package addon_dsa;

public class day6postassignment {
	
	    class Node {
	        int data;
	        Node next;
	    }

	 
	    Node top = null;

	   
	    void push(int value) {
	        Node newNode = new Node();
	        newNode.data = value;
	        newNode.next = top;
	        top = newNode;
	        System.out.println(value + " pushed to stack");
	    }

	    
	    void pop() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println(top.data + " popped from stack");
	            top = top.next;
	        }
	    }

	   
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

	    
	    public static void main(String[] args) {
	    	day6postassignment s = new day6postassignment();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.display();  
	        s.pop();     
	        s.display();  
	    }
	}


