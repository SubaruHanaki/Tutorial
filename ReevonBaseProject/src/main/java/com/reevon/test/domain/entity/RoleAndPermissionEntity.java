package com.reevon.test.domain.entity;

import com.reevon.test.domain.primary.RolePAndPermissionPK;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="m_rp")
@IdClass(RolePAndPermissionPK.class)
public class RoleAndPermissionEntity {
	
	/*
	@EmbeddedId
	private RolePAndPermissionPK primaryKey;

	*/
	/*
	*/
	@Id
	@Column(name="role_id")
	private String roleId;
	
	//@Id
	@Column(name="permission_id")
	private String permissionId;
}

