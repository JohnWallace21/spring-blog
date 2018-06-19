package com.codeup.blog;

import org.springframework.stereotype.Service;
import com.codeup.blog.Post;


import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {
    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createAds();
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post save(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post findOne(long id) {
        return posts.get(((int)id) - 1);
    }

    private void createAds() {
        posts.add(new Post("Test Title 1", "This is a test post description 1."));
        posts.add(new Post("Test Title 2", "This is a test post description 2."));

    }
}




