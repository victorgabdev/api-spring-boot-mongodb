package com.api.mongodb.projectSB.services;

import com.api.mongodb.projectSB.domain.Post;
import com.api.mongodb.projectSB.domain.User;
import com.api.mongodb.projectSB.dto.UserDTO;
import com.api.mongodb.projectSB.repositories.PostRepository;
import com.api.mongodb.projectSB.repositories.UserRepository;
import com.api.mongodb.projectSB.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isEmpty()) throw new ObjectNotFoundException("Objeto não encontrado");
        return post.get();
    }



}
