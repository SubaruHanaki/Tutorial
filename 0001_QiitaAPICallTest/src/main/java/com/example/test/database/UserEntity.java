package com.example.test.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="M_USER")
public class UserEntity {
	@Id
    @Column(name="UserId")
    private String id;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="RoleId")
	private String roleId;
	
	@Column(name="UserName")
	private String username;
}
