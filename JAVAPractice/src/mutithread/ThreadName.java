package mutithread;

public class ThreadName {

	/*public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		//이 코드를 실행하는 스레드 객체 얻기
		
		System.out.println("프로그램 시작 스레드 이름 : "
				+mainThread.getName());
		
		ThreadA a = new ThreadA();
		System.out.println("작업 스레드 이름 : "+a.getName());
		a.start();
		
		ThreadB b = new ThreadB();
		System.out.println("작업 스레드 이름 : "+ b.getName());
		b.start();
		
	}*/
}

class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	public void run() {
		for (int i = 0; i <2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
	
}

class ThreadB extends Thread{
	public void run() {
		for (int i = 0; i <2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
		
	}
}