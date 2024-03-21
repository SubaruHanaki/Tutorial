package com.reevon.test.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="m_role")
public class RoleEntity {
	@Id
    @Column(name="role_id")
    private String id;
	
	@Column(name="role_name")
	private String roleName;
	
	/*
    @OneToMany
    @JoinColumn(name = "role_id", insertable=false, updatable=false)
    private List<RoleAndPermissionEntity> RolePermissions; // 読み取り専用にする
    */
}
