package com.adineh.hw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adineh.hw.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	User findByUsername(String username);

}
