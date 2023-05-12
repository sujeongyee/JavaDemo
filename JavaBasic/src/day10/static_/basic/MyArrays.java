package day10.static_.basic;

public class MyArrays {
	/*
	 * Arrays 클래스의 toString메서드 똑같이 만들기
	 * 
	 * 1. 외부에서 객체 생성하지 못하도록 생성자에 접근 제어자 붙입니다.
	 * 2. 메서드 명은 printArray() 생성하는데, 배열을 매개변수로 받아서 
	 * toString처럼 리턴되도록 메서드 오버로딩
	 *  배열 String int char
	 * 
	 */

	private MyArrays() {}


	public static String printArray(String[] arr) {
		String answer = "[";
		
		int i = 0;
		for( i = 0; i < arr.length-1; i++) {
			answer+= arr[i]+", ";
		}
		answer+=arr[i] + "]";
		return answer;
	}

	public static String printArray(int[] arr) {
		String answer = "[";

		int i = 0;
		for(i = 0 ; i < arr.length-1; i++) {
			answer+= arr[i]+", ";
		}
		answer+=arr[i] + "]";
		return answer;

	}
	public static String printArray(char[] arr) {

		String answer = "[";
		int i = 0;
		for(i = 0 ; i < arr.length-1; i++) {
			answer+= arr[i]+", ";
		}
		answer+=arr[i] + "]";
		return answer;

	}



}
