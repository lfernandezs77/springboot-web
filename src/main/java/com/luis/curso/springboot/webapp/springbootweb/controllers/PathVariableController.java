package com.luis.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/params")
public class PathVariableController {

    @GetMapping("/baz/{param}")
    public ParamDTO getMethodName(@PathVariable() String param) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(param);
        return paramDTO;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String,Object> getMethodName(@PathVariable String product, @PathVariable String id) {
        Map<String,Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);

        return json;
    }
    
    
}
