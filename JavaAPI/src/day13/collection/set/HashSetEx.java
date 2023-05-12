package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		// add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");
		
		//
		System.out.println(set.toString()); // 넣은 순서로 표시 해주는건 아님 ㅠㅠ
		
		// 크기
		System.out.println(set.size()); // 5
		
		// 삭제
		set.remove("python");
		System.out.println(set.toString()); // 정확히 일치하는 값만 지워줌
		
		// 순회 => 내부적으로 반복자 (Iterator) 의 개념을 사용해서 회전
		for(String s: set) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------");
		
		// set => iterator 타입으로 변경
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
		System.out.println(iter.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
