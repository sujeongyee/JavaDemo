package quiz02;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account id01 = new Account();
		id01.info();
		id01.deposit(10000);
		id01.withDraw(20000);
		id01.getBalance();
		
		Account id02 = new Account("id02",5678,300000);
		id02.info();
	}

}
