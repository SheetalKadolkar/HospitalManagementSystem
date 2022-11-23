package com.edubridge.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Login {
	private String id;	//foreign key, consists eid and pid
	private String role;
	@Id
	private String username;	//primary key
	private String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String id, String role, String username, String password) {
		super();
		this.id = id;
		this.role = role;
		this.username = username;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", role=" + role + ", username=" + username + ", password=" + password + "]";
	}
	

}
