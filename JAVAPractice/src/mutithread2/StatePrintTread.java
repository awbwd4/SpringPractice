package mutithread2;

public class StatePrintTread extends Thread{
//스레드의 상태를 출력하는 클래스
	private Thread targetThread;
	
	public StatePrintTread(Thread targetThread)//상태를 조사할 스레드 
	{
		this.targetThread = targetThread;
	}
	
	public void run() {
		
		while (true) {
		
			Thread.State state = targetThread.getState();
			//스레드 상태 얻기
			System.out.println("타겟 스레드 상태 : "+state);
			
			if (state == Thread.State.NEW) {
				targetThread.start();
			//스레드 객체가 이제 막 생성된 경우,
			//실행 대기 상태로 만듦.
			}
			if (state == Thread.State.TERMINATED) {
				break;
				//스레드 실행이 끝나있으면 반복문 종료.
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
