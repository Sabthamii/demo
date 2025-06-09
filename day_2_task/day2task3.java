package addon_dsa;
import java.util.Arrays;


public class day2task3 {
	
	    public static int[] rmvdup(int[] nums) {
	        int[] temp = new int[nums.length];
	        int count = 0;

	        for (int i = 0; i < nums.length; i++) {
	            int j = 0;
	            while (j < count) {
	                if (temp[j] == nums[i]) {
	                    break;
	                }
	                j++;
	            }
	            if (j == count) {
	                temp[count++] = nums[i];
	            }
	        }

	        int[] result = new int[count];
	        for (int i = 0; i < count; i++) {
	            result[i] = temp[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 3, 4, 4, 5, 8, 2, 3};
	        int[] result = rmvdup(nums);
	        System.out.println(Arrays.toString(result));
	    }
	}
