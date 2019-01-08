package interface_prac2;

public class Ex {

	
	
	
	
	public static void main(String[] args) {
		
		ChildrenInterface1 ci1 = new ChildrenInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ci1 parent-method1 구현");
			}
			
			@Override
			public void method3() {
				System.out.println("ci1 children-method3 구현");
			}
		};
		
		ci1.method1();
		ci1.method2();//parent의 디폴트 메소드
		ci1.method3();
		
		System.out.println("==========================");
		
		ChildrenInterface2 ci2 = new ChildrenInterface2() {
			
			@Override
			public void method1() {
				System.out.println("ci2 : parent-method1 구현");
			}
			
			@Override
			public void method3() {
				System.out.println("ci2 : children-method3 구현");
			}
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		System.out.println("==========================");
		
		
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		
		
		
	}
}
