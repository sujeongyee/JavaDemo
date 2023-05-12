package quiz06;

public class Account {
	
	// 한 사람의 은행 계좌
	/*
	 * accountNumber 변수 - 식별아이디
	 * password 변수 - 비밀번호
	 * balance 변수 - 잔고
	 * 
	 * 생성자
	 * 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit 입금 : void - 기능 : 잔고에 매개변수를 누적하는 기능
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고가 리턴하는 기능
	 * 
	 * 메인에서는 각각의 기능을 확인
	 */
	
	String accountNumber;
	String password;
	int balance;
	
	Account(){
		accountNumber = "id01";
		password = "1234";
		balance = 200000;
	}
	Account(String a, String b, int c){
		accountNumber = a;
		password = b;
		balance = c;
	}
	
	void deposit(int a) {
		if(a > 0) {
		balance += a;
		System.out.println(a + "원이 입금 됐습니다.");
		}else {
			System.out.println("입금 할수 없는 금액입니다");
		}
	}
	void withDraw(int b) {
		if(balance >0 && b<balance) {
		balance -= b;
		System.out.println(b+ "원이 출금 됐습니다.");
		}else {
			System.out.println("출금 할수 없습니다");
		}
	}
	int getBalance() {
		System.out.println("통장 잔고는 : " + balance);
		return balance;
	}
	
	void info () {
		System.out.println("====회원정보====");
		System.out.println("아이디는 : " + accountNumber);
		System.out.println("비밀번호는 : " + password);
		System.out.println("통장 잔고는 : " + balance + "원");
	}

}
