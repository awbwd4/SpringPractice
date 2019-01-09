package collectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import reference_type.ArrayInArrayEx;

public class LinkedListEx {

	//arraylist와 linkedlist에 각각 10000개의 객체를 삽입하는데 걸린 시간 측정
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

				
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));//인트타입의 숫자를 스트링으로 바꿔줌.
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간 : "+(endTime-startTime));

		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {                                                                         
			list2.add(0, String.valueOf(i));//인트타입의 숫자를 스트링으로 바꿔줌.
		}
		endTime = System.nanoTime();
		
		System.out.println("걸린시간 : "+(endTime-startTime));
		
		
		
				
		
	}
	
	
	
	
	
}
