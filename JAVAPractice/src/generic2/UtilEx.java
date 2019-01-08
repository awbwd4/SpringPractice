package generic2;

//제한된 타입 파라미터
public class UtilEx {

	/*public static void main(String[] args) {
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
	*/
	
	
	
}

class Util{
	
	public static <T extends Number> int compare(T t1, T t2) {//제네릭 : 파라미터의 타입을 제한.
		
		double v1 = t1.doubleValue();//Number클래스에 정의돼있는 메소드로, 숫자를 double타입으로 변환함.
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);//Double.compare() 메소드는 앞 숫자가 뒤의 숫자보다 작으면 int타입의 -1
		//같으면 0, 더 크면 1을 리턴한다.
		
		
	}
	
	
	
}