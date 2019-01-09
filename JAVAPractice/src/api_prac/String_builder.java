package api_prac;

public class String_builder {

	public static void main(String[] args) {
	
		
		StringBuilder sb = new StringBuilder(); //StringBuilder 객체 생성
		
		//문자열을 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		
		//4번째 문자 뒤에 2를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//4번째 문자 뒤의 문자를 6으로 변경
		sb.setCharAt(4, '6');//String이 아닌 char이므로 ""가 아닌 ''를 사용해야 한다.
		System.out.println(sb.toString());
		
		
		//6번째 문자 뒤부터 13번째 문자까지를 book문자열로 대치
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		
		//5번째 문자를 삭제 ->4번째 문자뒤부터 5번째까지
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		System.out.println(sb.length());
		
		
		//버퍼에 있는 것을 String 타입으로 리턴
		String result = sb.toString();
		System.out.println(result);
		
		
	}
}
