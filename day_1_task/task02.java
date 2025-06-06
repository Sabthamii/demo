package addon_dsa;

import java.util.Scanner;

public class task02 {
	public static void main (String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n =scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("ENTER THE ELEMENTS");
		for (int i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		int max=arr[0],min=arr[0];
		for (int i=0;i<n;i++)
		{
			if(arr[i]>max)max=arr[i];
			if(arr[i]<min)min=arr[i];
			
		}
		System.out.println("max:"+max+",min:"+min);
		}

}


