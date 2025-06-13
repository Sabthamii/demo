package addon_dsa;

import java.util.Arrays;

public class day6mainprogram {
	int []arr=new int[5];
	int rear;
	int front;
	public  day6mainprogram() {
		rear=-1;
		front=-1;
		
		
	}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("Queue spreadout");
		}
		else 
		{
			arr[++rear]=num;
		}
	}
	public void dequeue()
	{
		if(front==4)
		{
			System.out.println("Empty queue");
			
		}
		else
		{
			arr[++front]=0;
		}
	}
	public void display()
	{
		System.out.println(Arrays.toString(arr));
		}
	public static void main(String[] args) {
		day6mainprogram queue = new day6mainprogram();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		queue.display(); 

		queue.dequeue();
		queue.dequeue();

		queue.display(); 

		
	}
}

