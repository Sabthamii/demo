package addon_dsa;

public class day9task2 {
	
	
	    public static void main(String[] args) {
	        int arr[] = {2, 3, 5, 10, 15, 45, 67};
	        int left = 0;
	        int right = arr.length;  
	        int mid;
	        int target = 30;

	        while (left < right) {
	            mid = (left + right) / 2;
	            if (arr[mid] <= target) { 
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	       
	        if (left < arr.length) {
	            System.out.println("Upper bound found at index " + left + " with value " + arr[left]);
	        } else {
	            System.out.println("Upper bound not found (target >= all elements)");
	        }
	    }
	}


