package lab4;

public class exercise1 {

	public static void main(String[] args) {
		
		Account smith = new Account();
		Account kathy = new Account();
		smith.setBalance(2000);
		kathy.setBalance(3000);
		smith.deposit(2000);
		kathy.withdraw(2000);
		System.out.println("kathy :"+kathy.getbalance());
		System.out.println("smith: "+smith.getbalance());
	}

}
