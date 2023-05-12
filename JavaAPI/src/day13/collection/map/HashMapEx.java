package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		// Map 인터페이스를 구현하는 클래스 HashMap
		
		Map<Integer,String> map = new HashMap<>();
		
		
		// map 에 값을 저장 put(키, 값)
		
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		
		// 문자열로 맵의 결과 출력
		System.out.println(map.toString());
		System.out.println(map.size());
		
		
		// 맵에 동일한 키를 저장하면? 값을 바꾸고 싶다면 key
		map.put(4, "강감찬");
		System.out.println(map.toString()); // 값이 바뀝니다
		
		
		// 맵에 값을 얻기
		System.out.println(map.get(1));
		
		// key의 유무확인 containskey (키)
		
		if(map.containsKey(3)) {
			System.out.println("3번 키가 존재함");
		}
		
		// 맵의 삭제 remove(키)
		
		String de =  map.remove(4);
		System.out.println("삭제된 키의 값 : "+de);
		System.out.println(map.toString());
		
		// 맵의 순회	
		// 방법 1
		Set<Entry<Integer,String>> entrySet = map.entrySet(); // 맵을 => 셋으로 변경
		// 엔트리에는 키, 값을 꺼내는 기능
		for(Entry<Integer,String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("-----------------------");
		//방법2
		
		Set<Integer> set = map.keySet(); // 키만 꺼내서 set에 저장
		for(int key : set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("--------------------------------");
		
		// 맵에 객체를 담는 모형
		
		//Map<Integer,User> map2 = new HashMap<>();
		//Map<Integer,Object> map2 = new HashMap<>();
		
		
		
		
	}

}
