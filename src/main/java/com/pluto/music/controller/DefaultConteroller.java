package com.pluto.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DefaultConteroller {
    @GetMapping
    public String sayHolle(){
        return "Come on";
    }
}
