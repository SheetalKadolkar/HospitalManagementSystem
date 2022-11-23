package com.edubridge.model;

public class OpdRecord {
String doctorId;
String doctorName;
String pid;
String patientName;
public OpdRecord() {
	super();
	// TODO Auto-generated constructor stub
}
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
@Override
public String toString() {
	return "OpdRecord [doctorId=" + doctorId + ", doctorName=" + doctorName + ", pid=" + pid + ", patientName="
			+ patientName + "]";
}

}
