package addon_dsa;

import java.util.Scanner;

public class day6task2 {
    int[] stack = new int[10];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    public static void main(String[] args) {
        day6task2 stack = new day6task2();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop ");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("How many numbers do you want to push? ");
                    int pushCount = sc.nextInt();
                    for (int i = 0; i < pushCount; i++) {
                        System.out.print("Enter value " + (i + 1) + ": ");
                        int val = sc.nextInt();
                        stack.push(val);
                    }
                    break;

                case 2:
                    System.out.print("How many numbers do you want to pop? ");
                    int popCount = sc.nextInt();
                    for (int i = 0; i < popCount; i++) {
                        stack.pop();
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
