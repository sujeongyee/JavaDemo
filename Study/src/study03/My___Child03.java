package study03;

public class My___Child03 extends My___Parents{
	
	// 기본 생성자 有 생략
	
	
	public int method3(int a, int b){
		super.setNum(a);
		super.setNum2(b);

		return super.getNum()*super.getNum2();
	}
	
	public String method4(String a, String b) {
		
		return a+b;
	}
	
	public String method4 (int a,int b) {
		
		return a+""+b;
	}

}
