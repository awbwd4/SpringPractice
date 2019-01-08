package mutithread;

import java.awt.Toolkit;

public class BeepPrintEx1 {

	/*public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//툴킷 객체 얻기
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);//0.5초간 정지
			} catch (Exception e) {}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		//비프음 발생 스레드
		thread.start();
		
		
		//프린팅 스레드
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
		
		
	}*/
}
