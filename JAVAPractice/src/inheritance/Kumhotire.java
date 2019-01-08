package inheritance;

public class Kumhotire extends Tire{

	public Kumhotire(String location, int maxRot) {
		super(location, maxRot);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public boolean roll() {
		++accumRot;
		if (accumRot<maxRot) {
			System.out.println(location+"kumhotire수명 : "+(maxRot-accumRot));
			return true;
		} else {
			System.out.println(
					location + "    kumho 펑크 "
					);
			return false;
		}
	}
	
	

}
