package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Day9Task3 {

    public static int countOccurrences(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == -1) return 0;
        int last = findLast(nums, target);
        return last - first + 1;
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = s.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        Arrays.sort(a);  

        System.out.print("Enter a target value: ");
        int target = s.nextInt();

        int res = countOccurrences(a, target);
        System.out.println("Count of " + target + " is " + res);

        s.close();
    }
}
