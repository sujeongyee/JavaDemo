package quiz06;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyAccount a = new MyAccount("123-456","1234",3000);
		a.info();
		a.deposit(200000);
		a.getBalance();
		a.withDraw(2000000);
		a.getBalance();
		
	
		
		
	}

}
