package lab3;

import java.util.Scanner;

public class exercise4 {
	
	public static int modifyNumber(int n)
	{
		String str;
		str= String.valueOf(n);
		StringBuffer sb = new StringBuffer();
		int i;
		
	    //find the difference and append to string buffer
		for(i=0;i<str.length()-1;i++)
		{
			sb.append(Math.abs((Character.getNumericValue(str.charAt(i))-Character.getNumericValue(str.charAt(i+1)))));
		}
		
		sb.append(String.valueOf(str.charAt(i)));
		
		//convert string buffer to integer
		int finalnum = Integer.parseInt(sb.toString());
		return finalnum; 
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
			
		System.out.println("final number is: "+modifyNumber(num));
		sc.close();
	}

}
