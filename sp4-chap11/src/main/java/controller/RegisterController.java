package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/register")
public class RegisterController {

	@RequestMapping("/step1")
	public String handleStep1() {
		return "register/step1";
	}
	
	
}
