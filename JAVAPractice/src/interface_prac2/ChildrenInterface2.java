package interface_prac2;

public interface ChildrenInterface2 extends ParentInterface{

	@Override
	default void method2() {
		System.out.println("parent의 디폴트 메소드 method2 재정의");
	}
	
	public void method3();
	
	
	
	
}
