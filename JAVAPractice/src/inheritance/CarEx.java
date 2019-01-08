package inheritance;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLoc = car.run();
			
			if (problemLoc != 0) {
				System.out.println(car.tires[problemLoc-1].location
						+"  hk교체");
				
				car.tires[problemLoc-1] = 
						new HankookTire(car.tires[problemLoc-1].location, 15);
			}
			System.out.println("----------------------------");
		}
		
	}
}
