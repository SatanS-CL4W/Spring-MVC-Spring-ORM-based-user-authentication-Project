package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {

	@RequestMapping("/user")
	public String showForm() {
		return "user";
	}
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String HandleForm(@RequestParam("email") String userEmail, //@RequestParam Annotation in spring MVC used to fetch user's data to console
			@RequestParam("userName") String UserName,
			@RequestParam("userPassword") String UserPassword,
			Model m) {
		
		//Getting Data From View Page to Controller Using "RequestParam" Annotation
		System.out.println("User's Email: " + userEmail);
		System.out.println("User's Name: " + UserName);
		System.out.println("User's Password: " + UserPassword);
		
		
		//Sending Data from controller to view Page 
		m.addAttribute("name", UserName);
		m.addAttribute("email", userEmail);
		m.addAttribute("pass", UserPassword);

		return "success";
			
	}

}
