package collectionFrameWork_set;

public class Member {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	@Override
	private void eqauls(Object obj) {//name과 age값이 같으면 true를 리턴
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	
	
	
}
