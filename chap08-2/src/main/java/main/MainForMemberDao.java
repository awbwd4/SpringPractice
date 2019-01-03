package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import spring.ChangePasswordService;
import spring.IdPasswordNotMatchingException;
import spring.MemberDao;
import spring.MemberNotFoundException;

public class MainForMemberDao {

	private static MemberDao memberDao;
	
	public static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException {
		
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		memberDao = ctx.getBean("memberDao",MemberDao.class);
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("명령어를 입력하세요.");
			String command = reader.readLine();
			if (command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			if (command.startsWith("new ")) {
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		memberDao.selectByEmail("asdf");
		
		
		ChangePasswordService cps = 
				ctx.getBean("changePwdSvc", ChangePasswordService.class);
		
		
		
		try {
			cps.changePassword("asdf", "1234", "1111");
			System.out.println("암호를 변경했습니다.");
		} catch (MemberNotFoundException e) {
			System.out.println("회원 데이터가 존재하지 않습니다.");
		}catch (IdPasswordNotMatchingException e) {
			System.out.println("암호가 올바르지 않습니다.");
		}
		
	}
	
	public static void processNewCommand(String[] arg) {
		if (arg.length != 5) {
			return;
		}
	}
	
	
	
	
	
	
	
	
}
