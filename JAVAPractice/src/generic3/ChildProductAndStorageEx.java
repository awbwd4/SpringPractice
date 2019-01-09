package generic3;

public class ChildProductAndStorageEx {

	//제네릭 타입을 상속 받은 자식 클래스와,
	//제네릭 타입 인터페이스의 구현 클래스 사용
	
	public static void main(String[] args) {
		
		childProduct<Tv, String, String> product = 
				new childProduct<>();
		
		product.setKind(new Tv());
		product.setModel("smartTv");
		product.setCompany("samsung");
		
		
		Storage<Tv> storage = 
				new StorageImpl<Tv>(100);
		
		storage.add(new Tv(), 0);
		
		Tv tv = storage.get(0);
		
		
		
	}
	
	
	
	
	
	
}
