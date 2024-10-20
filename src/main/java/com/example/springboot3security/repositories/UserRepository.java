package com.example.springboot3security.repositories;

import com.example.springboot3security.entities.User;
import jakarta.annotation.Resource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Resource
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}