package mutithread5;

public class InterructEx {

	public static void main(String[] args) {
		Thread th = new PrintThread2();
		th.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		th.interrupt();
	}
	
	
}



class PrintThread2 extends Thread{
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}

		System.out.println("자원정리");
		System.out.println("종료");
	
	
	
	}
	
	
	
	
}