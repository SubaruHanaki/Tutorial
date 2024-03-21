package com.reevon.test.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reevon.test.domain.entity.RoleAndPermissionEntity;

public interface RoleAndPermissionRepository extends JpaRepository<RoleAndPermissionEntity, String> {

}
