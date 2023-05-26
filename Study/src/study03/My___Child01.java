package study03;

public class My___Child01 extends My___Parents{
	
	//기본 생성자 有
	My___Child01() {
		super.setNum(5);
		super.setNum2(10);
	}

    // 부모클래스 num과 num2를 더해준 값 *2 리턴
	public int method1(){
		int result = super.getNum()+super.getNum2();
		
		return result*2;
	}
	
	

}
