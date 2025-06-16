package addon_dsa;

import java.util.Arrays;

public class day7task1 {
	public static void findbubble(int []sample) 
	{
		System.out.println(Arrays.toString(sample));
		for (int i=1;i<sample.length;i++)
		{
			for(int j=0;j<sample.length-i;j++)
			{
				if(sample[j]>sample[j+1])
				{
					int temp= sample[j];
					sample[j]=sample[j+1];
					sample[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(sample));
	}
	
	public static void main(String[] args) {
		
		int []arr= {23,3,7,44,55,2,9};

findbubble(arr);
	}

}
