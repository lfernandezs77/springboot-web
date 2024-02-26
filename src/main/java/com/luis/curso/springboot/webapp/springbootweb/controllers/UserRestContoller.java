package com.luis.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springbootweb.models.User;
import com.luis.curso.springboot.webapp.springbootweb.models.dto.UserDTO;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class UserRestContoller {
    
    

    @GetMapping("/details")
    public UserDTO getDetails() {
        
        UserDTO userDTO = new UserDTO();
        User user = new User("Luis Eduardo","Fernandez Samano");
        
        userDTO.setUser(user);
        userDTO.setTitle("Hola Mundo con Spring Boot");

        return userDTO;
    }
    
    @GetMapping("/list")
    public List<User> getUserList(){

        User user = new User("Luis","Fernández Sámano");
        User user2 = new User("Pamela","Campos Salazar");
        User user3 = new User("Elisa","Fernández Campos");
        User user4 = new User("Aáron","Fernández Campos");

        //List<User> userList = new ArrayList<>();
        List<User> users = Arrays.asList(user,user2,user3,user4);

        /*userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);*/

        //return userList;
        return users;
    }

    /*@GetMapping("/details")
    public Map<String,Object> getDetails() {
        User user = new User("Luis Eduardo","Fernandez Samano");
        
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Hola Mundo con Spring Boot");
        body.put("user", user);
        return body;
    }*/
    

}
