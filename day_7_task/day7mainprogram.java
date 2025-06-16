package addon_dsa;

import java.util.Arrays;

public class day7mainprogram {
    public static void findSelectionSort(int[] sample) {
        System.out.println("Before sorting: " + Arrays.toString(sample));

        for (int i = 0; i < sample.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sample.length; j++) {
                if (sample[j] < sample[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = sample[minIndex];
                sample[minIndex] = sample[i];
                sample[i] = temp;
            }
        }

        System.out.println("After sorting: " + Arrays.toString(sample));
    }

    public static void main(String[] args) {
        int[] arr = {23, 3, 7, 44, 55, 2, 9};
        findSelectionSort(arr);
    }
}
