package lab1;
import java.util.Scanner;
public class exercise7 {
	static boolean checkNumber(int n)
	{
		int r1,r2,count=0;
		r1=n%10;
		while(n>0) 
		{
			n=n/10;
			r2=n%10;
			if(r1<r2)
			{
				count=1;
				break;
			}
			r1=r2;
		}
		if(count==1)
			return false;
		else
			return true;
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
