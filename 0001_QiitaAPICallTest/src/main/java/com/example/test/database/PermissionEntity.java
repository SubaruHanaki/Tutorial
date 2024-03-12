package com.example.test.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="m_permission")
public class PermissionEntity {
	@Id
    @Column(name="permission_id")
    private String id;
	
	@Column(name="permission_name")
	private String permissionName;

}
