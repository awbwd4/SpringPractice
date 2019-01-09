package collectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstEx {

	public static void main(String[] args) {
	
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
			//그때그때 객체들을 추가 하는 것이 아닌 고정된 객체들로 구성된 list생성.
		for (String name : list1) {
			System.out.println(name);
		}
		
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		
		for(int value:list2) {
			System.out.println(value);
		}
		
		
	}
	
	
}
