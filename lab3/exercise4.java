package lab3;

import java.util.Scanner;

public class exercise4 {
	
	public static int modifyNumber(int n)
	{
		String str;
		str= Integer.toString(n);
		StringBuffer sb = new StringBuffer();
		char c1,c2;
		int sum;
		for(int i=0;i<str.length();i++)
		{
			c1 = str.charAt(i);
			c2 = str.charAt(i+1); 
			//int  y = Integer.parseInt(c1.toString());
			sum = Character.getNumericValue(c1)-Character.getNumericValue(c2);
			sb.append(sum);
		}
		sb.append(str.charAt(str.length()-1));
		int finalnum = Integer.parseInt(sb.toString());
		return finalnum; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int num1;
		num1=modifyNumber(num);	
		System.out.println("final number is: "+num1);
		sc.close();
	}

}
