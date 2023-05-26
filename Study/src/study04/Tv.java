package study04;

public class Tv extends SmartTv implements RC{
	
	private int chNum = 8;

	@Override
	public void on() {
		System.out.println("TV를 켭니다.");			
	}

	@Override
	public void up() {
		chNum++;
		if(chNum==11) {
			chNum = 1;
		}
		System.out.println("TV 채널 위로 넘기기 : " + this.chNum);
	
	}

	@Override
	public void down() {
		chNum--;
		if(chNum==0) {
			chNum = 10;
		}
		System.out.println("TV 채널 아래로 넘기기 : " + this.chNum);

	}
	
	

}
