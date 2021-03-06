package com.codeup.blog.controllers;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

    @GetMapping("/say-hello")
    public @ResponseBody
    String myFirstSpringView() {
        return "Hello from Spring";
    }

    @GetMapping("/say-hello/{name)")
    public @ResponseBody
    String sayHello(@PathVariable String name) {
        return String.format("Hello, %s!");
    }
}