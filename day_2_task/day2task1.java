package addon_dsa;

import java.util.Arrays;

public class day2task1 {
	
	    public static void main(String[] args) {
	        int[] arr = {4, 2, 10, 7, 5, 3, 8};
	        
	        
	        int start = 0;
	        int end = arr.length - 1;
	       Arrays.sort(arr);
	       
  while (start < end) {
	            
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            
	            
	            start++;
	            end--;
	        }
  System.out.print("Reversed array: ");
  for (int num : arr) {
      System.out.print(num + " ");
  }
}
}

	       
	       