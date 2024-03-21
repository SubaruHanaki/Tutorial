package com.example.test.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

    //public User getUserByUsername(String username);
    public UserEntity findByUsername(String username);
    
	//User getUserByUsername(String username);
	
	//UserEntity findByUsername(String userName);

}
