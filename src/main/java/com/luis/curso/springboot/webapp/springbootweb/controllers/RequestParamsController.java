package com.luis.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;
import com.luis.curso.springboot.webapp.springbootweb.models.dto.ParamMixDTO;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDTO getMessage(@RequestParam(required=false,
                                             defaultValue = "Hola que tal",
                                             name="mensaje") String message) {
        ParamDTO param = new ParamDTO();

        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDTO getParams (@RequestParam String text, @RequestParam Integer code) {
        ParamMixDTO paramMixDTO = new ParamMixDTO();
        paramMixDTO.setMessage(text);
        paramMixDTO.setCode(code);

        return paramMixDTO;
    }
    
    @GetMapping("/request")
    public ParamMixDTO getMethodName(HttpServletRequest request) {
        ParamMixDTO paramMixDTO = new ParamMixDTO();

        paramMixDTO.setCode(Integer.parseInt(request.getParameter("code")));
        paramMixDTO.setMessage(request.getParameter("message"));
        
        return paramMixDTO;
    }
    
}
