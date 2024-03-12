package com.example.test.database;

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
}
