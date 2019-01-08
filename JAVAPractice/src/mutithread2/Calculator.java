package mutithread2;

public class Calculator {//공유객체.

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public  void setMemory(int memory) {
		
		synchronized (this) {//this : calculator 객체를 잠근다.
			
		
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		
		System.out.println(Thread.currentThread().getName()
					+" : "+this.memory +"저장");
		
		}
		
		
		
	}
	
	
}
