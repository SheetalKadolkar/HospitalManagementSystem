package com.edubridge.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Opd {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int opdId=1;

@Temporal(TemporalType.DATE)
private Date visitDate;
private String pid;
private String doctorId;
private int status;

public static final int PENDIND=1;
public static final int DONE=0;
public Opd() {
	super();
	// TODO Auto-generated constructor stub
}
public Opd( String pid, String doctorId, int status) {
	super();
	
	this.pid = pid;
	this.doctorId = doctorId;
	this.status = status;
}
public int getOpdId() {
	return opdId;
}
public void setOpdId(int opdId) {
	this.opdId = opdId;
}
public Date getVisitDate() {
	return visitDate;
}
public void setVisitDate(Date visitDate) {
	this.visitDate = visitDate;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
@Override
public String toString() {
	return "Opd [opdId=" + opdId + ", visitDate=" + visitDate + ", pid=" + pid + ", doctorId=" + doctorId + ", status="
			+ status + "]";
}




}
