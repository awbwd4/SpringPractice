package mutithread2;

public class MainThreadEx {

	/*public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();
	}*/
	
	
	
	
}

class User1 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");//스레드 이름을 User1으로 설정
		this.calculator = calculator;
		//공유객체인 Calculator를 필드에 저장
	}
	
	public void run(){
		calculator.setMemory(100);
		//공유객체인 Calculator의 메모리에 100 저장.
	}
}



class User2 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");//스레드 이름을 User2으로 설정
		this.calculator = calculator;
		//공유객체인 Calculator를 필드에 저장
	}
	
	public void run(){
		calculator.setMemory(50);
		//공유객체인 Calculator의 메모리에 50 저장.
	}
	
	
	
}
