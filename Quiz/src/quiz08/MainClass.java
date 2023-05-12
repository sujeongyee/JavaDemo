package quiz08;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyCart mycart = new MyCart(20000);
		
		mycart.buy("tv");
		
		mycart.buy("radio");
		
		mycart.buy("com");
		
		mycart.buy("a");
		
		mycart.buy("tv");
		
		mycart.buy("com");
		
		mycart.buy("radio");
	}

}
