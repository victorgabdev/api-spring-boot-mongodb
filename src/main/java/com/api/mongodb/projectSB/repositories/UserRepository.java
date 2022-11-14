package com.api.mongodb.projectSB.repositories;

import com.api.mongodb.projectSB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
