package addon_dsa;
import java.util.Arrays;

public class day7task3 {
	

	
	    public static void findinsertion(int[] sample) {
	        System.out.println(Arrays.toString(sample));
	        for (int i = 1; i < sample.length; i++) {
	            int key = sample[i];
	            int j = i - 1;
	            while (j >= 0 && sample[j] > key) {
	                sample[j + 1] = sample[j];
	                j--;
	            }
	            sample[j + 1] = key;
	        }
	        System.out.println(Arrays.toString(sample));
	    }

	    public static void main(String[] args) {
	        int[] arr = {23, 3, 7, 44, 55, 2, 9};
	        findinsertion(arr);
	    }
	}



