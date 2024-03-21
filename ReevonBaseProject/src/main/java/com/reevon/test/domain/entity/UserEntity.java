package com.reevon.test.domain.entity;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="m_user")
public class UserEntity implements UserDetails {
	
	@Id
    @Column(name="user_id")
    private String id;
	
	@Column(name="password")
	private String password;
	/*
	@Column(name="role_id")
	private String roleId;
	*/
	
	@Column(name="user_name")
	private String username;
	
	@ManyToOne
	@JoinColumn(name = "role_id", insertable=false, updatable=false)
	private RoleEntity role; 
		
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		Collection<GrantedAuthority> results = new ArrayList<>();
		results.add(new SimpleGrantedAuthority(role.getRoleName()));
		return results;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}

