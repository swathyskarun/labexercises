package lab1;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		
		System.out.println("enter a value");
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int rem,cube,sum_cube=0;
	    //find cube of digits
		while(num!=0)
		{
			rem = num%10;
			cube = rem*rem*rem;
			sum_cube+=cube;
			num=num/10;
		}
		System.out.println("sum is "+sum_cube);
		sc.close();
	}

}
