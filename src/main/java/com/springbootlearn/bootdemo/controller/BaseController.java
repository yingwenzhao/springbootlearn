package com.springbootlearn.bootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping
    public String helloWordle(){
        return "helloWordle";
    }

}
