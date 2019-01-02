package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import spring.MemberDao;

public class MainForMemberDao {

	private static MemberDao memberDao;
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		memberDao = ctx.getBean("memberDao",MemberDao.class);
		
		
		memberDao.selectByEmail("asdf");
		
		
		
		
		
		
	}
}
