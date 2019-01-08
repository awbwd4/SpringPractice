package mutithread2;

public class ThreadStateEx {
	public static void main(String[] args) {
		
		StatePrintTread statePrintTread = 
				new StatePrintTread(new TargetThread());
		
		statePrintTread.start();
		
		
		
	}

}
