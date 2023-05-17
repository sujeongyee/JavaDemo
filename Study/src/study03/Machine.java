package study03;

public class Machine {

	String name;
	int battery;

	Machine(int battery){
		this.battery = battery>0?battery:0;		
	}

	Machine(String name,int battery){
		this.name = name;
		this.battery = battery>0?battery:0;
	}

	// 메소드1 - 배터리 상태 확인
	public void info(){
		System.out.println("Battery: " + this.battery);
	}

	// 메소드2 - 전원 ON
	public void powerOn() {
		System.out.println("---------------------------------------");
		System.out.println("Power On");
	}

	// 메소드3 - 전원 OFF
	public void powerOff() {
		System.out.println("Power Off");
		System.out.println("---------------------------------------");
	}

	// 메소드4 - FULL 충전
	public void charge(){
		this.battery = 100;
		System.out.println("Fully Charged!");
	}

}
