package com.reevon.test.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="m_rp")
public class RoleAndPermissionEntity {

	@Id
	@Column(name="role_id")
	private String roleId;
	
	//@Id
	@Column(name="permission_id")
	private String permissionId;
	
	
	
}

