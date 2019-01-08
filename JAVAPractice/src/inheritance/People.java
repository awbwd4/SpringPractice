package inheritance;

public class People {
	
	public String name;
	public String ssn;
	
	///기본 생성자가 없다
	//따라서 이것을 상속하는 클래스는 생성자에서 Peroson클래스의 생성자를 호출해야 한다.
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	//기본 생성자도 있다면, 이를 상속하는 클래스에서는 위의 생성자를 호출하지 않아도 된다.	
	public People() {
		// TODO Auto-generated constructor stub
	}
	

}
