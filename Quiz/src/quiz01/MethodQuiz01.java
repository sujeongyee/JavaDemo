package quiz01;


public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		method1(); // 안녕
		
		System.out.println(method2("메롱")); // 메롱
		
		System.out.println(method3(5,7,8.0)); // 20
		
		System.out.println(method4(18)); // 짝수
		
		method5("메롱 ",5); // 메롱 메롱 메롱 메롱 메롱
		
		System.out.println(maxNum(8,10)); // 10
		
		System.out.println(abs(-18)); // 18
		
		System.out.println(java(17));
		
	} //메인의 끝
	
	static String java (int a){
		String str = "";
		for(int i = 1; i<=a; i++ ) {
			if(i % 2 != 0) {
				str += "자";
			}else {
				str += "바";
			}
		}
		return str; 
	}
	
	
	
	
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		return s;
	}
	
	static int method3(int a, int b, double c) {
		int result = a + b + (int)c; 
		return result;
	}
//	static double method03(int a, int b , double c) { 쌤 풀이
//		return a+b+c;
//	}
	
	static String method4 (int a) {
		String str = "";
		if(a%2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
	}
	
//	 if(a%2==0){  이렇게도 가능 쌤풀이
//		 return "짝수";
//	 }else {
//		 return"홀수";
//	 }
	
//   return a%2 == 0 ? "짝수" : "홀수"; // 이렇게도 가능
	
	
	static void method5 (String s , int a) {
		String str = "";
		for(int i = 1; i <= a; i++) {
			str += s;
		}
		System.out.println(str);
	}
	
	static int maxNum (int a , int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	static int abs (int a) {
		
		if(a<0) {
			a = -a;
		}
		return a; 
	}
	
	// return a > 0 ? a : -a ;

}
