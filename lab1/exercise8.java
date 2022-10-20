package lab1;

import java.util.Scanner;

public class exercise8 {
	static boolean checkNumber(int n)
	{
		while (n % 2 == 0)
		{
			n=n/2;
		}

		if(n==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		System.out.println(checkNumber(num));
		sc.close();

	}

}
