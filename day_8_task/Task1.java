package addon_day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int size=s.nextInt();
		int [] a=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		Arrays.toString(a);
		boolean flag = false;
		System.out.println("Enter the Number to Find:");
		int no=s.nextInt();
		s.close();
		for(int i=0;i<size;i++) {
			if(a[i]==no) {
				System.out.println(" Value Found "+no+" at "+i);
				flag=true;
				break;
			}			
		}
		if(!flag) {
		System.out.println("Value not found");
		}
		}	
}
