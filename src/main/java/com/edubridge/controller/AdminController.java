package com.edubridge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.edubridge.model.Admin;
import com.edubridge.service.AdminService;

@CrossOrigin()
@RestController
@RequestMapping("")
public class AdminController {

@Autowired

private AdminService adminService;

public AdminController(AdminService adminService) {
	super();
	this.adminService=adminService;
}
	@PostMapping
public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) 
{
	System.out.println(admin);
	return new ResponseEntity<Admin>
	(adminServices.saveAdmin(admin),HttpStatus.CREATED);
	
}
	




}
