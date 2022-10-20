package lab1;
import java.util.Scanner;
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a value");
		Scanner sc = new Scanner(System.in);
	    int limit = sc.nextInt();
		for(int i=2; i<limit; i++)
		{
			int count=0;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0)
				{
				count++;
				break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}

	}

}
