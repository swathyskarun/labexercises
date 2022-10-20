package lab2;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class exercise3 {
	
	static public int [] getSorted(int [] arr, int size)
	{	
		int [] arr1 = new int[size];
		 System.out.println("reversed array:");
		 StringBuffer[] str=new StringBuffer[size];
	        for(int i=0;i<size;i++) {
	            StringBuffer ele=new StringBuffer();
	            ele.append(String.valueOf(arr[i]));
	            ele=ele.reverse();
	            //System.out.println(ele);
	            arr1[i]=Integer.parseInt(ele.toString());
	        }
	        for(int i=size-1;i>=0;i--)
	        {
	        	System.out.println(arr1[i]+" ");
	        }
	        Arrays.sort(arr);
	        return arr;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int size = sc.nextInt();
	      int [] arr = new int[size];
	      System.out.println("Enter the elements of the array:");
	      for(int i =0;i<size;i++)
	      {
	    	  arr[i]=sc.nextInt();
	    	  
	      }
	      
	      getSorted(arr,size);
	      System.out.println("sorted array:");
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}

	      sc.close();     
	}

}
