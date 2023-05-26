package study03;

public class My___Child02 extends My___Parents{
	
	My___Child02(int num,int num2){
		super.setNum(num);
		super.setNum2(num2);
	}
	
	public int method2() {
		super.setNum2(5);
		result = super.getNum()-super.getNum2();
		return result;
	}
	
	

}
