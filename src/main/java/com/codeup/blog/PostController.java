package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PostController {


    @GetMapping("/posts")
    public @ResponseBody String postIndex() {
        return "This will be our posts index.";
    }

    @GetMapping("/posts/{id}")
    public @ResponseBody String individualPost(@PathVariable long id) {
        return "This will be an individuals post." + id;
    }


    @GetMapping("/posts/create")
    public @ResponseBody String postCreate() {
        return "This will let you view form for creating a post." ;
    }


    @PostMapping("/posts/create")
    public @ResponseBody String postSave() {
        return "This will be the form for creating a post." ;
    }
















}
