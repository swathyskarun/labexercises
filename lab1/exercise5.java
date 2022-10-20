package lab1;
import java.util.Scanner;
public class exercise5 {
	static int calculateSum(int n)
	{
		int i, sum=0;
		for(i=1;i<=n;i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit");
		int num=sc.nextInt();
		System.out.println(calculateSum(num));
		sc.close();

	}

}
