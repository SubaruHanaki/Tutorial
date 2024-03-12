package com.example.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository repository;
	
	public List<RoleEntity> SearchAll(){
		return repository.findAll();
	}

}
