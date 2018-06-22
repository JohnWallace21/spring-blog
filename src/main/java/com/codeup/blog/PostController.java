package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
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
    public @ResponseBody
    String edit(@PathVariable long id, Model view) {
        Post existingPost = postService.findOne(id);
        view.addAttribute("post", existingPost);
        return "posts/edit";
    }


    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable long id, Model view) {

       return postService.save(Post post);
    }
}