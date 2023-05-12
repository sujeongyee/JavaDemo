package day13.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	
	public static void main(String[] args) {
		
		//ArrayDeque<Integer>que = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		
		// 뒤에서 추가
		que.offer(1);
		que.offer(2);
		que.offer(3);
		que.offer(4);
		que.offer(5);
		que.offer(6);
		
		System.out.println(que.toString());
		
		// 앞에서 꺼내기
		int a = que.poll(); // get 이랑 다름 poll을 쓰면 반환 동시에 삭제가 됨
		System.out.println(a);
		System.out.println(que.toString());
		
		// 앞에서 꺼내기
		int b = que.pollFirst(); // 맨 앞 삭제
		System.out.println(b);
		
		
		System.out.println("----------------------");
		
		// 앞에서 추가		
		que.offerFirst(1); // 맨 앞에 추가
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		que.offerFirst(5);
		System.out.println(que.toString());
		
		// 뒤에서 꺼내기
		que.pollLast();
		System.out.println(que.toString()); // 맨뒤에 값이 삭제
		
		que.pollFirst();
		que.pollLast();
		que.pollLast();
		que.pollLast();
		que.pollLast();
		
		
		// 값을 확인만
		// list의 값처럼 앞에서 or 뒤에서
		System.out.println(que.peekFirst()); // 맨앞
		System.out.println(que.peekFirst()); // 맨앞
		System.out.println(que.toString()); // 값에는 변함 없음
		
		System.out.println(que.peekLast()); // 맨뒤
		
		
		
	}

}
