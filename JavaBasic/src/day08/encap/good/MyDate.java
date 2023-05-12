package day08.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 은닉된 변수에 접근할 때 , 미리 생성해놓은 
	 * getter / setter 를 사용합니다.
	 * 
	 * setter 메서드
	 * 1. 값을 저장하는 용도의 메서드
	 * 2. 접근제어자는 public으로 선언하고 이름은 set+ 멤버변수명
	 *  
	 */

	public void setYear(int year) {

		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력인디요");
			return;
		} else {
			this.year = year;
		}
	}
	
	/*
	 * getter 메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어는 public, 반환유형이 있고, 이름은 get+ 멤버변수명
	 * 
	 */
	
	public int getYear() {
		return year;
	}
	
	/*
	 * 1 . month, day, ssn에 getter/setter 생성
	 * day - 1~31일까지만 저장
	 * ssn - 하이픈은 제거하고 13자리까지만 저장가능
	 * 
	 */
	
	public void setMonth(int month) {
		if(month<1 || month >12) {
			System.out.println("잘못된 저장값 입니다");
			return;
		}else {
			this.month = month;
		}
	}
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day<1 || day >31) {
			System.out.println("잘못된 저장값 입니다");
			return;
		}else {
			this.day = day ;
		}
	}
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		String ssn2 = ssn.replace("-", "");
		if(ssn2.length() != 13) {
			System.out.println("잘못된 저장값 입니다");
			return;
		}else {
			this.ssn = ssn;
		}
	}
	public String getSsn() {
		return ssn;
	}
	
	String info() {
		return "생년 월일 : " + year + "년 "+month + "월 "+ day + "일 \n 주민번호 : " + ssn;
	}

	


}
