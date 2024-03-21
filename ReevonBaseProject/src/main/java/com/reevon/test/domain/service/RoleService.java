package com.reevon.test.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reevon.test.domain.entity.RoleEntity;
import com.reevon.test.domain.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository repository;
	
	public List<RoleEntity> SearchAll(){
		return repository.findAll();
	}

}
