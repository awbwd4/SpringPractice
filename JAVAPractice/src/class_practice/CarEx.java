package class_practice;

public class CarEx {

	/*public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setSpeed(-50);

		System.out.println("speed : "+car.getSpeed());
		
		
		if (!car.isStop()) {
			car.setStop(true);
			System.out.println("디폴트 : false");
		}else {
			System.out.println("디폴트 true");
		}
		
		
		
		
	}
	*/
	
	
	
	
	
}


class Car{
	
	/*private int speed;
	private boolean stop;//boolean : 디폴트 = false
	char gg = '\t';//이런 리터럴을 저장할 수 잇는건 char뿐임.
	
	
	
	
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	public boolean isStop() {
		return stop;
	}
	
	
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}*/
	
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	
	 Car() {
		// TODO Auto-generated constructor stub
	}
	
	 Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String model){
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	
	
	
	
	
}

