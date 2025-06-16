package addon_dsa;

import java.util.Arrays;

public class day7task2 {

    public static void findquick(int[] sample) {
        System.out.println(Arrays.toString(sample));
        quickSort(sample, 0, sample.length - 1);
        System.out.println(Arrays.toString(sample));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {23, 3, 7, 44, 55, 2, 9};
        findquick(arr);
    }
}
