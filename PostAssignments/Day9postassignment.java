package addon_dsa;

public class Day9postassignment {

    public static long countBoundedSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int lastInvalid = -1;
        int lastMin = -1;
        int lastMax = -1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num < minK || num > maxK) {
                lastInvalid = i;
                lastMin = -1;
                lastMax = -1;
            }

            if (num == minK) lastMin = i;
            if (num == maxK) lastMax = i;

            int validStart = Math.min(lastMin, lastMax);
            if (validStart > lastInvalid) {
                count += validStart - lastInvalid;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 2, 7, 5};
        int minK1 = 1, maxK1 = 5;
        System.out.println("Example 1: " + countBoundedSubarrays(nums1, minK1, maxK1)); 

        int[] nums2 = {1, 1, 1, 1};
        int minK2 = 1, maxK2 = 1;
        System.out.println("Example 2 : " + countBoundedSubarrays(nums2, minK2, maxK2)); 
    }
}
