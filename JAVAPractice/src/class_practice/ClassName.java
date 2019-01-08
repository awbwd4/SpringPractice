package class_practice;

public class ClassName {

	//인스턴스 필드와 메소드
	int field1;
	void mothod1() {
		System.out.println("gg");
	};
	
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {
		System.out.println("glgl");
	}
	
	
	static {
		ClassName cn = new ClassName();
		cn.field1 = 20;
		//정적 메소드와 정적 블록에서 인스턴스 멤버를 쓰고 싶다면 객체 생성을 해야 함.
		
		
		field2 = 10;
		
	}
	
	
	
	
	
}
