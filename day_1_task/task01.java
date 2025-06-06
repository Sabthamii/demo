package addon_dsa;


import java.util.Arrays;
import java.util.Scanner;
class task01{
	public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			
			System.out.println("Enter the array length:");
			int size = s.nextInt();
			int a[]=new int[20];
			System.out.println("Enter the array elements:");
			for(int i=0;i<size;i++)
			{
				a[i]=s.nextInt();
			}
			//Insert
			System.out.println("Enter ur value");
			   int newval=s.nextInt();
			   System.out.println("Enter the position");
			   int pos=s.nextInt();
			   for(int n=size;n>=pos-1;n--)
			   {
			       a[n]=a[n-1];
			   }
			   a[pos-1]=newval;
			   size++;
			   for(int i=0;i<size;i++){
			       System.out.print(a[i]);
			       System.out.print(" ");
			   }
			   
			  // Delete
			   System.out.println("Enter the position to delete value");
				int pos1=s.nextInt();
				
				for(int n=pos1-1;n<size;n++)
				{
					a[n]=a[n+1];
				}
				size--;
				for(int i=0;i<size;i++){
				       System.out.print(a[i]);
				       System.out.print(" ");
				   }
			   
			
		// Update
		System.out.println("Enter the position to update value");
		int pos2=s.nextInt();
		a[pos2-1]=s.nextInt();	
		for(int i=0;i<size;i++){
		       System.out.print(a[i]);
		       System.out.print(" ");
		   }
		}
		
	}
		


			