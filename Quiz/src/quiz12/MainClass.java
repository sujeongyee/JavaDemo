package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		Radio r = new Radio(); // 300, 어쩔라디오
//		
//		System.out.println(r.getName() + r.getPrice());
//		
		MyCart c = new MyCart(3000);
		Tv t = new Tv();
		Computer co = new Computer();
		
		c.buy(r);
		c.buy(co);
		c.buy(t);
		c.buy(r);
		c.buy(co);
		c.buy(t);
		c.buy(r);
		c.buy(co);
		
	}

}
