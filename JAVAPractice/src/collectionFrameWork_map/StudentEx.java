package collectionFrameWork_map;

import java.util.HashMap;
import java.util.Map;

public class StudentEx {
	
	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		//키값을 Student타입으로 갖는다.
		
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		//학번과 이름이 동일한 Student객체를 키로 저장
		
		System.out.println("총 entry 수 : "+ map.size());
		
		
	}
}


class Student{
	
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno)&&(name.equals(student.name));
			//새로 들어온 student객체의 이름과 학번이 같은지 확인.
		} else {
			return false;
		}
	}
	
	public int hashCode() {//학번과 이름이 같다면 동일한 값을 리턴.
		return sno+name.hashCode();
	}
	
	
	
	
	
	
}
