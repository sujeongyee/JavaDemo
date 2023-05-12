package day13.collection.queue;

public class User implements Comparable<User>{
	
	private String name;
	private int age;
	
	@Override
	public int compareTo(User o) {
		// 내꺼와 매개변수로 들어오는 User 객체의 멤버변수 값의 비교		
		return this.name.compareTo(o.getName());
	}
	
	public String toString() {
		return "User [name =" + name + ", age = "+age+ "]"; 
	}
	
	public User() {
		
	}	

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	

}
