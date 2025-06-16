package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day8task1 {
	public static void main(String[] args) {
		int arr[]= {12,3,5,6,7,1,9,0,34};
		System.out.println(Arrays.toString(arr));
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a value to find:");
		int store=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==store)
			{
				System.out.println("value found at inedx:"+ arr[i]+ " "+ i);
				return;
			}
		}
			
				System.out.println("value not found");
				
			
		}
		
		
		
	}
	
	

