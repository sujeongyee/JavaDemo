package study04;

public interface Meter {
	
	int taxiP = 3500;
	int premi = 5000;
	
	void start();
	void drive(int distance);
	void stop();

}
