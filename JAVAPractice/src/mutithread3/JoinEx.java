package mutithread3;

public class JoinEx {

	public static void main(String[] args) {
		SumThr sum = new SumThr();
		sum.start();
		
		try {
			sum.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("합 : "+sum.getSum());
		
		
	}
	
	
	
	
	
	
}

class SumThr extends Thread{
	
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
	}
}