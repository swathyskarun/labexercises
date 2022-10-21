package lab2;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class exercise2 {
	
	static String sortStrings(String s)
	{
		s=s.toLowerCase();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<=arr.length/2)
			{
				arr[i]=Character.toUpperCase(arr[i]);
			}
		}
		s=String.valueOf(arr);
		
		return s;		
	}
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.next();
		System.out.println(sortStrings(str));
		sc.close();

	}

}
