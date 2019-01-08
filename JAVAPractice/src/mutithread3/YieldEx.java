package mutithread3;

public class YieldEx {

	
	/*public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();

		System.out.println("//////////////////////////////////////////////////둘다 실행");
		a.start();
		b.start();
		//a,b 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		System.out.println("//////////////////////////////////////////////////////b만 실행");
		a.work = false;
		///여기서부터는 B만 실행
		
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		System.out.println("/////////////////////////////////////////////////////둘다 실행");
		a.work = true;
		///a,b 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		a.stop = true;
		b.stop = true;
		
		
	}*/
	
	
	
}

class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("threadA");
			} else {
				Thread.yield();
			}
		}
		System.out.println("A 종료");
	}
	
}

class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("threadB");
			} else {
				Thread.yield();
			}
		}
		System.out.println("B 종료");
	}
	
}