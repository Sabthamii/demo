package addon_dsa;


	import java.util.Scanner;

	public class mainprogram {
	    static int[] array = new int[100]; 
	    static int size = 0;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println(" Array Manipulator");
	        menu(sc);
	        sc.close();
	    }

	    public static void menu(Scanner sc) {
	        System.out.println("\nChoose an operation:");
	        System.out.println("1. Insert element");
	        System.out.println("2. Delete element");
	        System.out.println("3. Display array");
	        System.out.println("4. Search element");
	        System.out.println("5. Exit");
	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                insertElement(sc);
	                break;
	            case 2:
	                deleteElement(sc);
	                break;
	            case 3:
	                displayArray();
	                break;
	            case 4:
	                searchElement(sc);
	                break;
	            case 5:
	                System.out.println("Exiting...");
	                return;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }

	        // Recursive call
	        menu(sc);
	    }

	    public static void insertElement(Scanner sc) {
	        if (size >= array.length) {
	            System.out.println("Array is full. Cannot insert more elements.");
	            return;
	        }

	        System.out.print("Enter element to insert: ");
	        int element = sc.nextInt();
	        array[size++] = element;
	        System.out.println("Element inserted.");
	    }

	    public static void deleteElement(Scanner sc) {
	        if (size == 0) {
	            System.out.println("Array is empty. Nothing to delete.");
	            return;
	        }

	        System.out.print("Enter element to delete: ");
	        int element = sc.nextInt();

	        int index = -1;
	        for (int i = 0; i < size; i++) {
	            if (array[i] == element) {
	                index = i;
	                break;
	            }
	        }

	        if (index == -1) {
	            System.out.println("Element not found.");
	            return;
	        }

	        for (int i = index; i < size - 1; i++) {
	            array[i] = array[i + 1];
	        }
	        size--;
	        System.out.println("Element deleted.");
	    }

	    public static void displayArray() {
	        if (size == 0) {
	            System.out.println("Array is empty.");
	            return;
	        }

	        System.out.print("Array contents: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void searchElement(Scanner sc) {
	        if (size == 0) {
	            System.out.println("Array is empty.");
	            return;
	        }

	        System.out.print("Enter element to search: ");
	        int element = sc.nextInt();

	        for (int i = 0; i < size; i++) {
	            if (array[i] == element) {
	                System.out.println("Element found at index " + i);
	                return;
	            }
	        }

	        System.out.println("Element not found.");
	    }
	}


