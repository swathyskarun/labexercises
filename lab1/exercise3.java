package lab1;
import java.util.Scanner;
public class exercise3 {
	static int a=0,b=1,c;
    public static void nonrecursive(int n)
    {
    	
    	for(int i=2;i<n;i++)
    	{
    		c=a+b;
    		System.out.println(c);
    		a=b;
    		b=c;
    	}
    }
    public static void recursive(int n)
    {
    	if(n>0)
    	{
    		c=a+b;
    		System.out.println(c);
    		a=b;
    		b=c;
    		recursive(n-1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int num= sc.nextInt();
		//nonrecursive(num);
		System.out.println();
		recursive(num);
		sc.close();

	}

}
