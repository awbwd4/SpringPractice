package collectionFrameWork_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servlet");
		set.add("java");//java는 한번만 저장됨.
		set.add("iBatis");
		
		
		int size = set.size();
		System.out.println("총 객체 수" + size);
		
		
		//set의 객체들 출력을 위한 iterater객체 생성
		Iterator<String> iterator = set.iterator();
		
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
			}
		
		set.remove("jdbc");//
		set.remove("servlet");//객체 삭제
		
		System.out.println("총 객체 수 : "+set.size());
		
		iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();//모든 객체를 제거하고 비움
		if(set.isEmpty()) System.out.println("비어있음.");
		
		
	}
	
	
}
