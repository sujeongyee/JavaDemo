package day13.collection.list;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		/*
		 * stack
		 * => Last in Firsht Out (후입선출)
		 * => push() , pop()
		 */
		
		Stack<String> stack = new Stack<>();
		
		// 값의 추가
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		// 형태를 문자열로 확인
		System.out.println(stack.toString());
		
		String n = stack.pop(); // 제거와 동시에 반환을 해준다! 헉
		System.out.println("pop: " + n);
		System.out.println(stack.toString());
		
		stack.pop();
		stack.pop();
		System.out.println(stack.toString());
		
		//에러 EmptyStackException
		stack.pop();
		
	}

}
