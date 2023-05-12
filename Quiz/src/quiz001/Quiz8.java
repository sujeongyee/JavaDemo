package quiz001;

public class Quiz8 {
	
	public static void main(String[] args) {
		
		String[] arr = {"안녕","hello","니하오","오하~","#$%"};
		
		int a = (int) (Math.random()*5);
		String b = arr[a];
		System.out.println(a);
		
		switch(b) {
		
		case "안녕" :
			System.out.println("한국어입니다!");
			break;
		case "hello" :
			System.out.println("영어입니다!");
			break;
		case "니하오" :
			System.out.println("중국어입니다!");
			break;
		case "오하~" :
			System.out.println("일본어입니다!");
			break;
		case "#$%" :
			System.out.println("알수없는 언어입니다!");
			break;
		default :
			System.out.println("다시 입력 해주세요!");
			break;
		
		}
		
	}

}
