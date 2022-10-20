package lab2;

import java.util.Scanner;

public class exercise1 {
	static Scanner sc = new Scanner(System.in);
	static int getSecondSmallest(int size)
	{
		int[] narr = new int[size];
		
		System.out.println("enter elements of array");
		for(int i=0;i<size;i++)
		{
			
			narr[i]=sc.nextInt();
			
		}
		int small=narr[0];
		for(int i=1;i<size;i++)
		{
			
			if(small>narr[i])
				small=narr[i];
		}
		return small;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter array size");
		int arrsize = sc.nextInt();
	    System.out.println("smallest number is " + getSecondSmallest(arrsize));
		
	}

}
