package com.dailycodebuffer.Springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping
    public String helloWorld()
    {
        return "Welcome To Daily Code Buffer!! Ramakanth";
    }
}
