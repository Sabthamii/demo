package addon_day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static boolean binarySearch(int[] a, int start, int end, int key) {
        if (start > end) {
            return false; 
        }

        int mid = (start + end ) / 2;

        if (a[mid] == key) {
            System.out.println("Value Found: " + a[mid] + " at index " + mid);
            return true;
        } 
        else if (key > a[mid]) {
            return binarySearch(a, mid + 1, end, key);
        } else {
            return binarySearch(a, start, mid - 1, key);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = s.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        Arrays.sort(a);

        System.out.println("Enter the key:");
        int key = s.nextInt();

        boolean found = binarySearch(a, 0, a.length - 1, key);
        if (!found) {
            System.out.println("Value Not Found");
        }

        s.close();
    }
}
