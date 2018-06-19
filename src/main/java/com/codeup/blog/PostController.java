package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/posts")
    public String index(Model view) {
        List<Post> aListOfPosts = makeSomePosts();
        view.addAttribute("posts", postService.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/show/{id}")
    public String individualPost(@PathVariable long id, Model view) {
        Post post = new Post("cool title","this is a cool story about some stuff and some other stuff", id);
        view.addAttribute("post", postService.findOne(id));
        return "posts/show";
    }


    @GetMapping("/posts/create")
    public @ResponseBody
    String postCreate() {
        return "This will let you view form for creating a post.";
    }


    @PostMapping("/posts/create")
    public @ResponseBody
    String postSave() {
        return "This will be the form for creating a post.";
    }

private List<Post> makeSomePosts(){

    return Arrays.asList(
        new Post("awesome cool title ", "This is a  post description 1."),
        new Post("Test Title 2", "This is a  post description 2.")


    );
    }
}