package com.app.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.main.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
