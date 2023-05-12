package day08.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		Chef chef = new Chef();	
				
		Hotel h = new Hotel(chef);
		//Hotel h = new Hotel(new Chef());
		
		Chef c = h.getChef(); // 반환유형 보는 습관 들이기
		c.setName("박민정");
		System.out.println(c.getName());
		c.cooking();
		
		
	}
}
