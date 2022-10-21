package lab3;

import java.util.Scanner;

public class exercise3 {
	
	public static String alterString(String s)
	{
		StringBuffer sb=new StringBuffer("");
		String str;
		String vowels = "aeiouAEIOU";
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(vowels.indexOf(c) == -1)
			{
				c = (char) (c+1);
			}
			sb.append(c);
		}
		str = sb.toString();
		return str;
	 }
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String sb1;
		System.out.println("Altered String is:");
		sb1=alterString(str);
		System.out.println((sb1));
	}
	

}
