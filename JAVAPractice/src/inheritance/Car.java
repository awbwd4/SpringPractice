package inheritance;

public class Car {
	
	Tire[] tires = {
			new Tire("1", 6),
			new Tire("2", 2),
			new Tire("3", 3),
			new Tire("4", 4)
	};
	
	
	public int run() {
		System.out.println("run");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll()==false) {
				stop();
				return(i+1);
			}
		}
		
		return 0;
	}
	
	public void stop() {
		System.out.println("stop");
	}
	
	
	
	
}
