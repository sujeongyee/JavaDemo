package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		/*
		 * ArrayList
		 * => 배열기반
		 * => 순서 o, 중복 o
		 */
		
		// ArrayList<String> list = new ArraysList<>();
		List<String> list = new ArrayList<>(); 
		
		// list추가 add()
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍길동");
		list.add("신사임당");
		
		// 문자열로 확인
		System.out.println(list.toString());
		
		// 길이 확인 size()
		int size = list.size();
		System.out.println(size);
		
		// 중간에 추가 add()
		
		list.add(0, "0번째추가");
		System.out.println(list.toString());
		
		// 값의 확인 get()
		System.out.println(list.get(3));
		
		// 값의 수정 set()
		System.out.println(list.set(0, "강감찬"));
		System.out.println(list.toString());
		
		// 값의 제거 remove()
		list.remove("신사임당");
		System.out.println(list.remove(0));
		System.out.println(list.toString());
		
		// 포함 여부 contains()
		
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음");
		}
		
		// 값의 유무 빈 리스트 확인 isEmpty()
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
		}else {
			System.out.println("리스트가 비어있지 않음");
		}
		
		//전부삭제 clear();
		list.clear();
		
		System.out.println("------------------------------------");
		
		// 제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		// 제네릭<? extends String> = String과 String의 자식들
		// 제네릭<? super String> = String타입이 될수 있다면 전달가능
		
		List<String> list2 = Arrays.asList("a","b","c","d");
		System.out.println(list2.toString());
		
		//리스트를 병합
		list.addAll(list2);
		System.out.println(list.toString());
		
		
		
		
		
		
		
	}

}
