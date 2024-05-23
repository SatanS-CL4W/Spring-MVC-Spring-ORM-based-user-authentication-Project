package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ModelAttributeController {
    
    @Autowired
    private UserService userService;    
    
    @ModelAttribute
    public void addCommonAttributes(Model model) {
        model.addAttribute("Header", "This Is Kumar Raunak");
        model.addAttribute("Desc", "ModelAttribute Saviour!!!");
        System.out.println("Adding Common data to model pages");
    }

    @GetMapping("/userForm")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "test"; // Assuming "test" is the name of the view to display the form
    }

    @PostMapping("/processForm1")
    public String processForm(@ModelAttribute("user") User user, Model model) {
        System.out.println(user);
        this.userService.createUser(user);
        return "display"; // Assuming "display" is the name of the view to show after form submission
    }
}