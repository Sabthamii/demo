package addon_dsa;
import java.util.Scanner;

public class day6task1 {
    int[] stack = new int[10];
    int top = -1;

    void push(int value) {
        if (top == 9) {
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
        day6task1 s = new day6task1();  
        Scanner sc = new Scanner(System.in);

        
        for(int i=0;i<20;i++) {
        	System.out.println("Enter number to push:");
            int num = sc.nextInt();
            s.push(num);
        }
        

//        System.out.println("Popping element:");
//        s.pop();

    }
}
