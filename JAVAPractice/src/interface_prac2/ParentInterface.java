package interface_prac2;

public interface ParentInterface {

	public void method1();
	public default void method2() {
		System.out.println("parent 디폴트 메소드2");
	}
	
	
}
