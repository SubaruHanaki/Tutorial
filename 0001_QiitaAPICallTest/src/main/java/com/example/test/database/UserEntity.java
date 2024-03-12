package com.example.test.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="m_user")
public class UserEntity {
	@Id
    @Column(name="user_id")
    private String id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role_id")
	private String roleId;
	
	@Column(name="user_name")
	private String userName;
}
