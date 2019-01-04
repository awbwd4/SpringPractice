package com.chap09.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
//컨트롤러 애노테이션을 적용한 클래스는 스프링 mvc에서 컨트롤러로 사용된다.
public class HelloController {
	
	@RequestMapping("/hello")
	//requestmapping어노테이션은 메서드가 처리할 요청 경로를 지정한다.
	//위 코드의 경우 "/hello"경로로 들어온 요청을 hello()메서드를 이용해서
	//처리한다고 설정했다.
	public String hello(Model model,//컨트롤러의 처리결과를 뷰에 전달할때 사용
			@RequestParam(value="name", required=false)
			//http 요청 파라미터 값을 메서드의 파라미터로 전달할 때 사용된다.
			//위 코드의 경우 name요청 파라미터 값을 name 파라미터에 전달한다.
			String name) {
			model.addAttribute("greeting", "안녕하세요, "+name);
			return "hello";
			//컨트롤러의 처리 결과를 보여줄 뷰 이름으로 "hello"를 사용한다.
	}
	
	
	
}
