package class_practice;

public class SingletonEx {
	
	/*public static void main(String[] args) {
		
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		
		
		System.out.println(sg1==sg2);
		
		
	}*/
	

}


class Singleton{
	
	
private static Singleton sg = new Singleton();
	
	public Singleton() {
	}

	
	static Singleton getInstance() {
		return sg;
	}
	
	
}
