package addon_dsa;
import java.util.Arrays;

public class day2postassignment {
	public static void main(String[] args) {
	        int[] nums = {4, 5, 2, 6, 9, 10};
	        int target = 8;

	        
	        Arrays.sort(nums);

	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int sum = nums[left] + nums[right];

	            if (sum == target) {
	                System.out.println("Found pair: " + nums[left] + " and " + nums[right]);
	                return;
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        System.out.println("No pair found ");
	    }
	}
