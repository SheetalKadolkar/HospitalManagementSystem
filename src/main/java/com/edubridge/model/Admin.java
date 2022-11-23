package com.edubridge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_Table")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adminId");
	private int adminId;
	
	@Column(name="first_name")
	@NotEmpty
	@Size(min=3 , message="firstName must contain atleast 3 characters")

}
