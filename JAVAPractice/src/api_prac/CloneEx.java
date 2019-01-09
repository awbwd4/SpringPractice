package api_prac;

public class CloneEx {

	/*public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("blue", "김선영", "1234");
		
		
		Member cloned = original.getMember();
		cloned.password = "2345";//복제 객체에서 패스워드 변경
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println(cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.password);
		System.out.println();
		
		System.out.println("원본객체");
		System.out.println(original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		
		
		
	}*/
	
	
	
	
}

class Member implements Cloneable{
	
	public String id;
	public String name;
	public String password;
	
	public Member(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		
		try {
			cloned = (Member) clone();//Member 객체의 클론을 리턴함.
			//원본과 동일한 필드값을 가진 얕은 복제된 객체를 리턴함. 
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
		
	}
}
