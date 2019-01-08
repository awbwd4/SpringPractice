package mutithread4;

public class WaitNotifyEx {

	public static void main(String[] args) {
		
		/*WorkObject sharedObject = new WorkObject();
		
		ThreadA a = new ThreadA(sharedObject);
		ThreadB b = new ThreadB(sharedObject);
		
		a.start();
		b.start();*/
		
		DataBox db = new DataBox();
		
		ProducerThread pt = new ProducerThread(db);
		ConsumerThread ct = new ConsumerThread(db);
		
		pt.start();
		ct.start();
		
		
		
		
		
	}
	
	
	
}
