package com.reevon.test.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reevon.test.domain.entity.PermissionEntity;

public interface PermissionRepository extends JpaRepository<PermissionEntity, String> {

}
