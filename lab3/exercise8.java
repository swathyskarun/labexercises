package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class exercise8 {
	
	public static boolean positiveString(String s)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		
		String comp = sb.toString();
		System.out.println("input string: "+comp);
		
		//converting string to character array for sorting
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append(String.valueOf(arr));
		
		String sortstr = sb1.toString();
		System.out.println("sorted string: "+sortstr);
		
		if(comp.equals(sortstr))
		{
			return true;
		}
		else
			return false;	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.next();
		System.out.println(positiveString(str));
		sc.close();
		
	}
}
