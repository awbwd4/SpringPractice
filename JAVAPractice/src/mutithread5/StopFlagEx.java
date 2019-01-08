package mutithread5;

public class StopFlagEx {
	/*public static void main(String[] args) {
		
		PrintThread1 pt = new PrintThread1();
		pt.start();///스레드 시작
		
		try {
			Thread.sleep(1000);//스레드 시작 1초 뒤 이 메소드 시행 ->스레드 일시정지
		} catch (InterruptedException e) {
		}
		
		pt.setStop(true);//스레드가 일시정지 된 상태에서 실행되는 메소드
		
	}*/
}

class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	public void run() {
		while (!stop) {
			System.out.println("실행중");
		}
		//stop이 true가 되면
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
	
	
	
}
