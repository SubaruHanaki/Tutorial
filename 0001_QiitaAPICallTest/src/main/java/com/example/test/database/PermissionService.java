package com.example.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {
	
	@Autowired
	PermissionRepository repository;
	
	public List<PermissionEntity> SearchAll(){
		return repository.findAll();
	}

}
