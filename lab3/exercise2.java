package lab3;

import java.util.Scanner;

public class exercise2 {
	public static String getImage(String s)
	{
		StringBuffer sb= new StringBuffer(s);
		String reverse;
		sb.reverse();
		reverse = sb.toString();
		return reverse;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String newstr;
		String str = sc.nextLine();
		System.out.println("New String:");
		newstr=getImage(str);
		System.out.println(str+"|"+newstr);
		sc.close();
	}
}
