package com.api.mongodb.projectSB.repositories;

import com.api.mongodb.projectSB.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
