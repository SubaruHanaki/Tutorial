package com.reevon.test.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reevon.test.domain.entity.PermissionEntity;
import com.reevon.test.domain.repository.PermissionRepository;

@Service
public class PermissionService {
	
	@Autowired
	PermissionRepository repository;
	
	public List<PermissionEntity> SearchAll(){
		return repository.findAll();
	}

}
