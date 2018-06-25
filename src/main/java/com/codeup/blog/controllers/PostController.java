package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import com.codeup.blog.repositories.Users;
import com.codeup.blog.services.PostService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;
    private Users users;

    public PostController(PostService postService, Users users) {
        this.postService = postService;
        this.users = users;
    }

    @GetMapping("")
    public String index(Model view) {
        List<Post> posts = postService.findAll();
        view.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/{id}")
    public String individualPost(@PathVariable long id, Model view) {
        view.addAttribute("post", postService.findOne(id));

        return "posts/show";
    }


    @GetMapping("/create")
    public String postCreateForm(Model view) {
        view.addAttribute("post", new Post());
        return "posts/create";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id) {
        postService.delete(id);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable long id, Model view) {
        view.addAttribute("post", postService.findOne(id));
        return "posts/edit";
    }


    @PostMapping("/{id}/edit")
    public String updatePost(@PathVariable long id, @ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/posts/" + id;
    }
}