package com.example.test.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	//UserEntity findByUsername(String userName);

}
