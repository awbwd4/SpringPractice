package collectionFrameWork;

import java.util.List;
import java.util.Vector;

public class VectorEx {
	//벡터는 어레이리스트와는 달리 동기화된 메소드로 구성돼있음
	// -> 멀티 스레드가 동시에 이 메소드를 실행 불가
	// 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행
	//=>스레드 안전하다
	
	/*public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		//list에 board객체를 저장
		
		list.remove(2); //2번 인덱스객체 삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.print("board : "+board.content+" \t"+board.writer+"\n");
		}
		System.out.println(
				);
		
		
	}
	*/
	
	
	
	
	
	
}

class Board{
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	
}
