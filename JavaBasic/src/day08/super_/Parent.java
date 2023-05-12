package day08.super_;

public class Parent {
	
	String mother;
	String father;
	
//	만들어 주지 않아도 기본 생성자가 생성 돼있음
//	Parent(){
//		super();
//	}
	
	Parent (String mother, String father){ 
		this.mother = mother;
		this.father = father;
	}
	
	String info() {
		return "name :" + mother + ", name : " + father;
	}
	
}
