package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day2task2 {
	public static void main(String[] args) {
		
		
		Scanner s =new Scanner(System.in);
			
			System.out.println("Enter the array length:");
			int n = s.nextInt();
			int[] a =new int[n];
			int [] b=new int[n];
			System.out.println("Enter the array elements:");
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			
//			for(int i=0;i<n;i++){
//			       System.out.print(a[i]);
//			       System.out.print(" ");
//			   }
			System.out.println("\nArray 1 \n");
			System.out.println(Arrays.toString(a));
			for(int i=0;i<n;i++)
			{
				b[i]=a[i];
			}
			System.out.println("\nArray 2 \n");
			System.out.println(Arrays.toString(b));
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(b[j]<b[i])
					{
						int temp=b[j];
						b[j]=b[i];
						b[i]=temp;
					}
					
				}
			}
			System.out.println("\n Descending order \n");
			
//			for(int i=0;i<n;i++){
//			       System.out.print(b[i]);
//			       System.out.print(" ");
//			   }
			System.out.println(Arrays.toString(b));
			}
			}