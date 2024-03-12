package com.example.test.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="M_PERMISSION")
public class PermissionEntity {
	@Id
    @Column(name="PermissionId")
    private String id;
	
	@Column(name="PermissionName")
	private String permissionName;

}
