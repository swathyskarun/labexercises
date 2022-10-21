package lab4;

public class Account {
	
	long accNum;
	double balance;
	Person accHolder;
	
	//getters and setters 
	public void deposit(double m)
	{
		balance = balance + m;
	}
	
	public void withdraw(double cash)
	{
		balance = balance - cash;
	}
	
	public double getbalance()
	{
		return balance;	
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
}

class SavingsAccount extends Account{
	
	final double minbalance = 1000;
	
	//checks minimum balance for withdraw
	public void withdraw(double cash)
	{
		if(balance-cash >= minbalance)
		{
			balance = balance - cash;
			System.out.println("Withdraw successful");
			System.out.println("Available balance is"+ balance);
		}
		else
			System.out.println("Insufficient minimum balance");
	}
}

class CurrentAccount extends Account
{
	double overdraft;
	
	//checking overdraft limit
	public void withdraw(double cash)
	{
		if(balance-cash <= overdraft)
		{
			System.out.println("yes");
		}
	}
}
