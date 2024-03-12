package com.example.test.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="M_ROLE")
public class RoleEntity {
	@Id
    @Column(name="RoleId")
    private String id;
	
	@Column(name="RoleName")
	private String roleName;
}
