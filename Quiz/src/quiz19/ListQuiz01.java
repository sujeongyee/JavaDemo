package quiz19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.list에 1~20까지 값을 순서대로 저장
		 * 
		 * 2.list에 값을 순서대로 출력
		 * 
		 */

		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 1 ; i <= 20 ; i++ ) {
			list.add(i);
		}
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
		/*
		 * 1. User 를 저장하는 list 생성
		 * 2. 3개의 각각 다른 user 객체를 만들고 순서대로 저장
		 * 3. user객체 안에 홍길동이 있으면 해당 객체의 name과 age를 출력하는
		 * 4. user객체 안에 홍길자가 있으면 해당 객체를 삭체  코드
		 */
		
//		LinkedList<User> list2 = new LinkedList<>();
//		
//		list2.add(new User("홍길동",20));
//		list2.add(new User("이순신",20));
//		list2.add(new User("홍길자",20));
//		
//		System.out.println(list2.toString());
//		
//		for(User a : list2) {
//			
//			if(a.getName().equals("홍길동")) {
//				
//				System.out.println("이름 : " + a.getName() + ", 나이 : " +a.getAge());
//			
//			}else if(a.getName().equals("홍길자")) {
//				
//				list2.remove(a);
//			}
//			
//		}		
//		System.out.println(list2.toString());
		
		List<User> lists = new ArrayList<>();
		
		User u1 = new User ("홍길동", 10);
		User u2 = new User ("이순신", 20);
		User u3 = new User ("홍길자", 30);
		
		lists.add(u1);
		lists.add(u2);
		lists.add(u3);
		System.out.println(lists.toString());
		
		for(int i = 0 ; i < lists.size(); i++) {
			User u = lists.get(i);
			if(u.getName().equals("홍길동")) {
				System.out.println("이름 : "+u.getName() + ", 나이 : "+u.getAge());
			}
			if(u.getName().equals("홍길자")) {
				lists.remove(i);
			}		
		}
		System.out.println(lists.toString());
		
	}

}
