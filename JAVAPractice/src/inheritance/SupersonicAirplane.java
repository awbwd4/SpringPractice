package inheritance;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();//super를 통해 부모 객체의 메소드를 직접 호출.
		}
	}
	
}
