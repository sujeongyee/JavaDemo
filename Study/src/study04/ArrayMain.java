package study04;

public class ArrayMain {
	
	public static void main(String[] args) {
		
		//객체 생성
		
		ArrayChild ac = new ArrayChild("박수정", 27, "공부");
		ArrayChild ac2 = new ArrayChild("단비", 5, "떼쓰기");
		ArrayChild ac3 = new ArrayChild("뽀로로", 6, "놀기");
		ArrayChild ac4 = new ArrayChild("짱구", 4, "흰둥이산책");
				
		System.out.println("static 변수 : " + ArrayParents.hobby2); //static변수는 메인에서 클래스명.변수명으로 사용이 가능합니다!
		
		ArrayParents[] arr = {ac,ac2,ac3,ac4}; // 부모타입을 가지고 있는 배열 생성
		
		
		for(ArrayParents ap : arr) { //출력해주기
			ap.info();
			ap.year();
		}
		
		
		
	}

}
