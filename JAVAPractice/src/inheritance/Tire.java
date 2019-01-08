package inheritance;

public class Tire {
	
	public int maxRot;
	public int accumRot;
	public String location;
	
	
	//생성자
	public Tire(String location, int maxRot) {
		this.location = location;
		this.maxRot = maxRot;
	}

	
	public boolean roll() {
		++accumRot;
		if (accumRot<maxRot) {
			System.out.println(location+" tire 수명 : "+(maxRot-accumRot)+"회");
			return true;
		} else {
			System.out.println(location+"tire 펑크");
			return false;
		}
	}
	
	
	

}
