package com.luis.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.luis.curso.springboot.webapp.springbootweb.models.User;




@Controller
public class UserController {

    /*@GetMapping("/details")
    public String getDetails(Model model) {

        model.addAttribute("title", "Hola Mundo con Spring Boot");
        model.addAttribute("name", "Luis");
        model.addAttribute("lastName", "Fernandez");

        return "details";
    }*/

    @GetMapping("/details")
    public String getDetails(Map<String,Object> param) {
        
        User user = new User("Luis Eduardo","Fernandez Samano");
        user.setEmail("lefs_77@hotmail.com");
        param.put("title", "Hola Mundo con Spring Boot");
        param.put("user", user);
        
        
        
        return "details";
    }
    
    @GetMapping("/list")
    public String getUserList(ModelMap modelMap) {
        
      /*List<User> users = Arrays.asList(new User("Elisa","Fernández"),
                                         new User("Aáron", "Fernández","evfc_23@hotmail.com"),
                                         new User("Pamela", "Campos","eafc_27@hotmail.com"),
                                         new User("Luis","Fernández"));*/
       /*  List<User> users = new ArrayList<>();*/

        //modelMap.addAttribute("users",users);
        modelMap.addAttribute("title","Lista de Usuarios");
        return "list";
    }
    
    @ModelAttribute("users")  
    public List<User> userModel(){
        return Arrays.asList(new User("Elisa","Fernández"),
        new User("Aáron", "Fernández","evfc_23@hotmail.com"),
        new User("Pamela", "Campos","eafc_27@hotmail.com"),
        new User("Luis","Fernández"));

        
    }
}
