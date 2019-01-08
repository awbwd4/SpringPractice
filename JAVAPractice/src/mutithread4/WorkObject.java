package mutithread4;

public class WorkObject {//공유객체, 두개의 스레드가 공유함.

	public synchronized void methodA() {
		
		System.out.println("threadA의 methodA 작업 실행");
		
		
		//한 스레드가 작업을 완료하면
		notify();//일시 정지 상태에 있는 스레드B를 실행 대기 상태로 만듦
		try {
			wait();//자신은 두번 작업하지 않도록 일시정지 상태로.
		} catch (InterruptedException e) {
		}
	}

	public synchronized void methodB() {
		
		System.out.println("ThreadB의 methodB() 작업 실행");
		
		notify();//일시정지 상태에 있는 threadA를 실행 대기 상태로 만듦.
		
		try {
			wait();
		} catch (InterruptedException e) {
		}
		
	}
}


class ThreadA extends Thread{
	
	private WorkObject wo;
	
	
	public ThreadA(WorkObject workObject) {
		this.wo = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodA();//공유객체의  methodA를 10번 호출
		}
	}
}

class ThreadB extends Thread{
	
	private WorkObject wo;
	
	
	public ThreadB(WorkObject workObject) {
		this.wo = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodB();//공유객체의 메소드B를 10번 반복 호출
		}
	
	}
	
	
	
}

