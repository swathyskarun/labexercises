package lab2;
import java.util.Arrays;
import java.util.Scanner;

public class exercise4 {
	
	public static int[] modifyarray(int a[], int n)
    {
      
		Arrays.sort(a);
		int i, j = 0;
		for(i = 0; i < n - 1; i++) {
			if(a[i] != a[i+1]){
				a[j++] = a[i];
			}
		}
		a[j++] = a[n-1];
		while(j < n) {
			a[j++] = 0; 
		}
		
		return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int myArray[] = modifyarray(arr,n);
		System.out.println("Modified array:");
		for(int i=myArray.length-1;i>=0;i--) {
		System.out.print(myArray[i]+" ");
		}
	            

	}

}
