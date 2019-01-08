package generic;


//비제네릭 타입 사용
public class BoxEx {

	public static void main(String[] args) {
		//Box box = new Box();
		
		/*Box<String> box1 = new Box<String>();//타입 파라미터 T를 String타입으로 변경해서 객체 생성
		box1.set("임은혜");
		String name = box1.get();
		System.out.println(name);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(23);
		int age = box2.get();
		System.out.println(age);
		
		
		Box<Integer> box3 = Util.boxing(100);
		System.out.println(box3.get());
		
		
		Box<String> box4 = Util.boxing("김희수");
		System.out.println(box4.get());*/
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.compare(p1, p2);//구체적 제네릭 타입을 명시하지 않아도 알아서 컴파일시 추정해냄.
		if (result1) {
			System.out.println("논리적으로 동등");
		} else {
			System.out.println("논리적으로 다름.");
		}
		
		Pair<Integer, String> p3 = new Pair<Integer, String>(23, "임은혜");
		Pair<Integer, String> p4 = new Pair<Integer, String>(24, "김희수");
		boolean result2 = Util.<Integer, String>compare(p3, p4);//구체적 제네릭 타입을 명시하지 않아도 알아서 컴파일시 추정해냄.
		if (result2) {
			System.out.println("논리적으로 동등");
		} else {
			System.out.println("논리적으로 다름.");
		}
	}
	
	
	
}


class Util{
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box();		
		box.set(t);
		return box;
	}
	
	//pair 객체들의 key값과 value값을 비교하는 메소드
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;
	}
	
	
	
}


class Pair<K,V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
	
	
}




class Box<T>{
	
	private T t;
	
	public void set(T t) { 
		this.t = t;}
	
	public T get() {
		return t;
	}
	
	
}


class Apple{}


