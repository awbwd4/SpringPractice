package api_prac;

import java.util.HashMap;

public class KeyEx {

	
	/*public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 new Key(1)으로 홍길동을 저장
		hashMap.put(new Key(1), "홍길동");
		
		//홍길동 읽어오기
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
	}*/
	
	
	
}


class Key{
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	public boolean eqauls(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key)obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return number;
	}
	
	
}