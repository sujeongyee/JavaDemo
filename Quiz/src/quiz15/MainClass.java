package quiz15;

public class MainClass {
	
	public static void main(String[] args) {
		
//		MyBag m = new MyBag();
//		
//		m.insert("가방");
//		m.insert("필통");
//		m.insert("향수");
//		m.print();
//		System.out.println(m.search("필통"));
//		System.out.println(m.search("향수"));
//		System.out.println(m.search("에어팟"));
//		m.insert("에어팟");
//		m.insert("아이라이너");
//		
//		m.print();
//		m.delete("향수");
//		
//		m.print();
//		m.insert("치즈버거");
//		m.print();
		
		IBag i = new MyBag();
		
		i.insert("피자");
		i.insert("회");
		i.insert("짜장면");
		i.insert("파스타");
		i.insert("햄버거");
		i.insert("도넛");
		i.insert("라면");
		i.insert("치킨");
		
		i.print();
		
		System.out.println(i.search("햄버거"));
		
		i.delete("라면");
		i.print();
		
		
	}

}
