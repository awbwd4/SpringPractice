package collectionFrameWork_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	/*public static void main(String[] args) {
		//map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		//키 타입은 주로 String을 많이 쓴다.
	
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //키가 같기 때문에 마지막에 저장한 값으로 대치함.
		System.out.println("총 entry 수 : "+map.size());
	
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동"));//key로 value검색
		System.out.println();
	
		
		
		
		//저장된 전체 객체를 대상으로 하나씩 얻고 싶을 경우
		
		//1. keySet() 메소드로 모든 키를 Set컬렉션으로 얻은 후, 
		//반복자를 통해 키를 하나씩 얻고 get메소드를 통해 값을 얻는다.
		Set<String> keySet = map.keySet(); //set컬렉션 타입의 key묶음 
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();

		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 entry 수 : "+map.size());
		
		
		
		2. entrySet메소드로 모든 Map.entry를 set컬렉션으로 얻은 뒤,
		 * 반복자를 통해 map.entry를 하나씩 얻고 키와 값을 얻는다
		 * 
		 * 즉 키을 먼저 구하냐, 아니면 엔트리를 구한뒤 키와 값을 동시에 구하냐의 차이
		 * 
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		
		map.clear();//모든 Map.Entry 삭제
		System.out.println("총 Entry 수 : "+map.size());
		
		
	}*/
}
