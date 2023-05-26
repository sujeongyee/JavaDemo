package study04;


public class Taxi implements Meter{
	
	int distance = 0;
	int distance2;

	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
		
	}

	@Override
	public void drive(int distance) {
		distance2 = distance;
		while(distance>0) {			
			distance-=200;
			int a = (int)(Math.random()*3+1);		
			switch (a) {
			case 1 : System.out.println("운 좋게 초록불! 슝슝 갑니다.");
			break;
			case 2 : System.out.println("아이고.. 빨간불이네.. 손님 , 요금이 쫌 늘어납니다.");
			         distance2+=50;
			break;
			case 3 : System.out.println("교통사고가 났습니다 ㅠㅠ 돌아가서 시간이 지체됩니다.");
					 distance2+=500;
			}
		}
		stop();
		
	}

	@Override
	public void stop() {
		System.out.println("운행을 종료합니다. 요금은 "+(taxiP+(distance2/100)*1200)+"원 입니다.");
		System.out.println("총 운행 거리 : "+distance2 + "m");
	}

}
