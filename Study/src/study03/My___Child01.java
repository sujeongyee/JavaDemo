package study03;

public class My___Child01 extends My___Parents{

	My___Child01() {
		super(5,10);
	}
	public int method1(){
		int result = super.getNum()+super.getNum2();
		
		return result*2;
	}
	
	

}