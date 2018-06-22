package com.codeup.blog.repositories;

import com.codeup.blog.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository  extends CrudRepository<Post, Long>{
}
