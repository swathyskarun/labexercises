package lab1;
import java.util.Scanner;
public class exercise6 {
	static int calculateDifference(int n)
	{
		int i,sum1=0,sum2=0,diff;
		for(i=1;i<=n;i++)
		{
			sum1 += i*i;
			sum2 += i;
		}
		diff=sum1-(sum2*sum2);
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit");
		int num=sc.nextInt();
		System.out.println(calculateDifference(num));
		sc.close();


	}

}