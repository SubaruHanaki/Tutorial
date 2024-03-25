package com.reevon.test.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reevon.test.domain.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, String> {
	
}
