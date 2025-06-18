package addon_dsa;
import java.util.Arrays;

public class day9mainprogram {


	public static void findBubble(int a[]) {
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(a));
	}
    public static int findRank(int[] arr, int element) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        findBubble(copy); 
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == element) {
                return i + 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 9, 1};
        int element = 8;
        int rank = findRank(arr, element);

        if (rank != -1) {
            System.out.println("The rank of " + element + " is: " + rank);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}



