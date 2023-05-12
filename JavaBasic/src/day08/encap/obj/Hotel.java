package day08.encap.obj;

public class Hotel {
	
	private Chef chef;
	
	// 호텔은 생성될 때 외부에서 chef 객체를 받는다.
	
//	public Hotel(){
//		this.chef = new Chef();
//	}
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	// chef의 getter setter
	
	//chef의 게터 세터
	// 객체를 매개변수로 받는 모형
	public void setChef (Chef chef) {
		this.chef = chef;		
	}	
	
	// 객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}
	

}
