package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//This method is used for 'Model' method application purpose
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Model Example");
		model.addAttribute("Name", "Kumar Raunak" );
		model.addAttribute("id", 1234);
		ArrayList<String> a = new ArrayList<String>();
		a.add("Tanay");
		a.add("Ayush");
		a.add("Krishna");
		a.add("Rishabh");
		
		model.addAttribute("List", a);
		return "about";
	}
	 
	//This method is used for 'ModelAndView' method application purpose
	@RequestMapping("/help")
	public ModelAndView test() {
		System.out.println("ModelAndView Example");
		ModelAndView mv = new ModelAndView();
		
		//setting the data
		mv.addObject("name", "Kumar Raunak");
		mv.addObject("id", 122);
		
		//This is setting name of view page
		mv.setViewName("help");
		  		                
		return mv;
	
	}
	
	//JSTL Example
	@RequestMapping("/ui")
	public ModelAndView home() {
		ModelAndView m = new ModelAndView();
		
		LocalDateTime now = LocalDateTime.now();
 		m.addObject("Name", "Kumar Raunak" );
		m.addObject("id", 1234);
		m.addObject("time", now);
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Tanay");
		a.add("Ayush");
		a.add("Krishna");
		a.add("Rishabh");
		
		m.addObject("List", a);
		
		m.setViewName("ui");

		return m;
	}

}
