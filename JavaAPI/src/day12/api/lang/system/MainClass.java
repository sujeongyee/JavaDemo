package day12.api.lang.system;

public class MainClass {
	
	public static void main(String[] args) {
		
		// system 클래스는 전부 static 메서드로 선언되어 있습니다.
		
		
		//System.exit(0); - 시스템종료
		
		//현재 시간을 밀리초단위로 반환
		//1970년 1월 1일 ~~ 현재까지 시간을 밀리초 반환
		// 간단한 프로그램 시간체크
		// UTC 시간 기준
		long start = System.currentTimeMillis();
		long sum = 0;
		for(long i = 0 ; i < 1000000 ; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		long end = System.currentTimeMillis(); 
		
		System.out.println((end - start) * 0.001);
		
	}

}
