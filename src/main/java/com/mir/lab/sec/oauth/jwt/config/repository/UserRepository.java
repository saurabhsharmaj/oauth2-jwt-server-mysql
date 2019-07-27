package com.mir.lab.sec.oauth.jwt.config.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mir.lab.sec.oauth.jwt.config.model.User;

@Repository
public interface UserRepository extends CrudRepository<User ,Long> {
	@Override
    List<User> findAll();
}