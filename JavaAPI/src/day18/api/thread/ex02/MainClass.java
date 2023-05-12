package day18.api.thread.ex02;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 1개의 객체를 N개의 쓰레드로		
		ThreadTest thread = new ThreadTest();
		Thread th1 = new Thread(thread,"Thread_A");
		Thread th2 = new Thread(thread,"Thread_B");
		
		// 스레드가 사용중인 객체를 다른 스레드가 변경할 수 없도록 할 때
		// 객체에 lock을 걸어 다른 스레드가 건들 수 없도록 할 수 있습니다
		// public synchronized void run()
		
		th1.start();
		th2.start();
		
		// 2객체를 각각 돌리는 경우
//		ThreadTest thread01 = new ThreadTest();
//		ThreadTest thread02 = new ThreadTest();
//		
//		Thread th1 = new Thread(thread01,"Thread_A");
//		Thread th2 = new Thread(thread02,"Thread_B");
//		
//		th1.start();
//		th2.start();
		
	}

}
