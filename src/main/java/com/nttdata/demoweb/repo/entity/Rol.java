package com.nttdata.demoweb.repo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table
public class Rol implements GrantedAuthority {
	@Id
	@Column
	private Integer id;
	
	@Column
	private String rol;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return ("ROLE_"+ this.rol).toUpperCase();
	}
	
	
	
}
