package com.reevon.test.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reevon.test.domain.entity.RoleAndPermissionEntity;
import com.reevon.test.domain.primary.RolePAndPermissionPK;

public interface RoleAndPermissionRepository extends JpaRepository<RoleAndPermissionEntity, RolePAndPermissionPK> {
	/*
	@Query("select o from m_rp o where o.role_id = :role_id and o.permission_id = :permission_id")
	public RoleAndPermissionEntity findByCompositePrimaryKey(@Param("role_id")String role_id, @Param("permission_id")String permission_id);
	*/

}
