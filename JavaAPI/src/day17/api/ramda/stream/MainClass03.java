package day17.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Random ran = new Random();

		for(int i = 0 ; i < 100 ; i++) {

			list.add(ran.nextInt(100) + 1); // 1 ~ 100까지 
		}		
		System.out.println(list.toString());
		
		
		// 최종집계 함수
		// collect()
		
		List<Integer> newList =list.stream().sorted().filter(a->a % 3 ==0).collect(Collectors.toList());
		System.out.println(newList.toString());
		
		Set<Integer> newList2 = list.stream().sorted().filter(a -> a% 3 == 0).collect(Collectors.toSet());
		System.out.println(newList2.toString());
		
		System.out.println("-------------------------------------");
		
		//sum() , count(), avg(), max(), min() - 숫자를 다루는 스트림에서만 사용
		
		int r1 = list.stream().distinct().mapToInt(a -> a).sum();
		System.out.println("합계 : " + r1);
		
		long r2 = list.stream().distinct().mapToInt(a->a).count();
		System.out.println("개수 ㅣ "+ r2);
		
		OptionalDouble r3 = list.stream().distinct().mapToInt(a->a).average();
		System.out.println(r3.getAsDouble()); // 옵셔널 더블형에서 더블값 반환
		
		OptionalInt r4 = list.stream().distinct().mapToInt(a->a).max();
		System.out.println(r4.getAsInt()); // 옵셔널 인트형에서 인트값 반환
		
		System.out.println("--------------------------------------");
		
		// list에서 50보다 큰 값만 중복없이 저장하는 새로운 리스트를 생성해보세요
		
		List<Integer> newList3 =list.stream().distinct().filter(a -> a > 50 ).collect(Collectors.toList());
		
		
		System.out.println("--------------------------------");
		
		IntStream.range(1, 10).forEach(a-> System.out.println(a)); // 부터 미만
		IntStream.rangeClosed(1, 10).forEach(a -> System.out.println(a)); // 부터 까지
		
		int result = IntStream.rangeClosed(1, 100).sum();
		System.out.println(result);
		
		
		// 정수 스트림 -> 일반 스트림 형변환
		
		Stream<Integer> stream = IntStream.rangeClosed(1, 100).boxed();
		
		
		
		
		
	}

}
