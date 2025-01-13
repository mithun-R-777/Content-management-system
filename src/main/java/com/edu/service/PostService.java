package com.edu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.Entity.Post;
import com.edu.Repository.PostRepository;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public <S> Post createPost(Post post) {
    	  return postRepository.save(post);
    }

    public List<com.edu.Repository.Post> getPostsByUser(Long userId) {
        return postRepository.findByAuthorId(userId);
    }
}
