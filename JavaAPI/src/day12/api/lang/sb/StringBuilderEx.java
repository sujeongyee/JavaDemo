package day12.api.lang.sb;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		String str = new String("Java ");
		
		// StringBuilder - 메인이 하나일때
		// StringBuffer - 멀티 쓰레드환경에서 사용 
		
		StringBuilder sb = new StringBuilder("Java ");
		
		// 차이점
		str = str + "program";
		sb.append("program");
//		System.out.println(str + "program");
//		System.out.println(sb.append("program"));
		
		
		System.out.println(str);
		System.out.println(sb);
		
		// 빌더의 함수 (메서드)
		
		// append() - 문자열 끝에 추가
		sb.append("ming");
		System.out.println(sb);
		
		// insert() - 중간에 추가
		sb.insert(5,"study ");
		System.out.println(sb);
		
		// replace() - 문자열 변경
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		//delete() - 삭제
		sb.delete(5, 10);  // 이상 ~ 미만
		System.out.println(sb);
		
		sb.deleteCharAt(0); // 인데스번째 삭제
		System.out.println(sb);
		
		// reverse() - 거꾸로
		sb.reverse();
		System.out.println(sb);
		
		// toString() - 문자열로 형변환
		
		String result = sb.toString();
		System.out.println(result);
//		if("gnimmargorp ava".equals(result)) {
//			System.out.println("같음");
//		}
		
		
		
		
		
		
		
	}

}
