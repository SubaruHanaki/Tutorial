package com.reevon.test.domain.primary;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class RolePAndPermissionPK implements Serializable{
	@Basic(optional = false)
	@Column(name="role_id")
	private String roleId;
	
	@Basic(optional = false)
	@Column(name="permission_id")
	private String permissionId;
	
	public RolePAndPermissionPK() {
		
	}
	
	public RolePAndPermissionPK(String r, String p) {
		roleId = p;
		permissionId = p;
	}

}
