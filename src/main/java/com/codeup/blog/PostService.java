package com.codeup.blog;

import com.codeup.blog.repositories.BlogRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PostService {
    private BlogRepository blogRepository;

    public PostService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Post> findAll() {
        return (List<Post>) blogRepository.findAll();
    }

    public Post save(Post post) {
        blogRepository.save(post);
        return post;
    }
    public Post findOne(long id) {
        return blogRepository.findOne(id);

    }

    public  Post editPost(Post post){
        return blogRepository.save(post);
    }


    public void delete(long id){
        blogRepository.delete(id);
    }
}




