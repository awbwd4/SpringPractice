package mutithread4;

public class ProducerThread extends Thread {

	private DataBox db;
	
	public ProducerThread(DataBox dataBox) {
		this.db = dataBox;
	}
	

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-"+i;
			db.setData(data);
		}
	}
}


class ConsumerThread extends Thread{
	
	private DataBox db;
	
	public ConsumerThread(DataBox dataBox) {
		this.db = dataBox;//공유객체를 필드에 저장
	}

	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			String data = db.getData();
			//새로운 데이터를 읽음.
		}
		
	}
	
	
	
	
	
	
	
}

