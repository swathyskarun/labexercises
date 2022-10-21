package lab5;

import java.util.Scanner;

public class pckg {

	public static void main(String[] args) throws AgeException, NameException, 
	SalaryException {
		
		//AgeException
		
		System.out.println("Enter Age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		try {
			if(age<15) {
				throw new AgeException("ACCESS DENIED");
			}
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
		
		//NameException
		
		System.out.println("Enter firstname and last name");
		String firstname = sc.nextLine();
		String lastname = sc.nextLine();
		
		try {
			if(firstname.isEmpty() && lastname.isEmpty()) {
				throw new NameException("INVALID NAME");
			}
		}
		catch(NameException e) {
			e.printStackTrace();
		}
		
		//SalaryException
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		try {
			if(salary<3000) {
				throw new SalaryException("Salary is below 3000");
			}
		}
		catch(SalaryException e) {
			e.printStackTrace();
		}
	}
}
