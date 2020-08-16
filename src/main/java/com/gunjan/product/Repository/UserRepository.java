package com.gunjan.product.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gunjan.product.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	Optional<User> findByUsername(String username);
	
	Boolean existsByUsername(String username);
}
