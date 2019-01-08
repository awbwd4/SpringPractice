package mutithread4;

public class DataBox {

	private String data;
	
	
	public synchronized String getData() {
		
		if (this.data == null) {
			try {
				wait(); //data 필드가 null이면 소비자스레드를 일시 정지 상태로 만듦.
			} catch (InterruptedException e) {
			}
		}
		
		
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : "+ returnValue);
		data = null;
		notify(); //data필드를 null로 만들고, 생산자 스레드를 실행 대기 상태로 만듦.
		
		return returnValue;
	}
	
	
	public synchronized void setData(String Data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}

		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : "+ data);
		notify(); //data필드에 값을 저장하고 소비자 스레드를 실행 대기 상태로 만듦.
		
	}
	
	
	
	
	
}
