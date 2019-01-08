package inheritance;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRot) {
		super(location, maxRot);
	}

	
	@Override
	public boolean roll() {
		++accumRot;
		if (accumRot<maxRot) {
			System.out.println(location+"hankooktire수명 : "+(maxRot-accumRot));
			return true;
		} else {
			System.out.println(
					location + "    hankook 펑크 "
					);
			return false;
		}
	}
}
