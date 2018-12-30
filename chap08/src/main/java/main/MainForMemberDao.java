package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Member;
import spring.MemberDao;

public class MainForMemberDao {
	
	private static MemberDao memberDao;
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:appCtx.xml");
	
		memberDao = ctx.getBean("memberDao", MemberDao.class);
	
		selectAll();
		
	
	
	}
	
	
	//memberDao.count() 메서드로 전체 행의 개수를 구함
	//+ memberDao.selectAll() 메서드를 이용해서 전체 Member 데이터를 구한 뒤 콘솔에
	//차례대로 출력한다.
	
	private static void selectAll() {
		System.out.println("---------selectAll()");
		int total = memberDao.count();//출력되는 행의 개수
		System.out.println("전체 데이터 : "+total);
		List<Member> members = memberDao.selectAll();
		for(Member m : members) {
			System.out.println(m.getId()+":"+m.getEmail()+":"+m.getName());
		}
	}
	
	
	
	
	private static void updateMember() {
		System.out.println("-----updateMember");
		Member member = memberDao.selectByEmail("asdf");
		//email 칼럼값이 asdf인 Member 객체를 구함
		
		String oldPw = member.getPassword();
		String newPw = Double.toHexString(Math.random());
		//그런 뒤 임의로 새로운 암호를 생성.
		
		member.changePassword(oldPw, newPw);
		//새롭게 생성한 암호로 교체
		
		memberDao.update(member);//이렇게 바꾼 멤버 정보를 업데이트 함.
		System.out.println("암호변경 : "+oldPw+"->"+newPw);
		
	}
	
	
	//새로 추가할 member객체를 만든 후 이를 dao를 통해 db에 저장
	private static void insertMember() {
		System.out.println("----insertMember");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
		String prefix = dateFormat.format(new Date());
		Member member = 
				new Member(prefix+"@test.com", prefix, prefix, new Date());
		memberDao.insert(member);
		System.out.println(member.getId());
		
		
	}
	
	
	
	
	
	
	

}
