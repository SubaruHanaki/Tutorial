package com.example.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public List<UserEntity> SearchAll(){
		return repository.findAll();
	}

}
