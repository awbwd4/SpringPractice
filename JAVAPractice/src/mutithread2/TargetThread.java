package mutithread2;

public class TargetThread extends Thread {

	public void run() {
		
		for (int i = 0; i < 10000000; i++) {}
		
		
		try {
			Thread.sleep(1500);
		} catch (Exception e) {}
		
		
		for (int i = 0; i < 10000000; i++) {}
		
		
		
	}
	
	
}
