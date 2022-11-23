package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubridge.model.Patient;
import com.edubridge.service.PatientService;

@Controller
@RequestMapping("")
public class PatientController {
@Autowired

private PatientService patientService;
@GetMapping
public ResponseEntity<Object> getAll() throws Exception
{
return ResponseEntity.ok(patientService.findAll()); 	
}
//
//@GetMapping("/find-by-id/{patientid}")
}
