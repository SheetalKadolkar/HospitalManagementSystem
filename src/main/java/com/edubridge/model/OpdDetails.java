package com.edubridge.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OpdDetails {
@Id
int opdId;
String symtoms;
String diagnosis;
String medicinesDose;
String dos;
String donts;
String investigation;
String followupDate;
int fees;
public OpdDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public OpdDetails(int opdId, String symtoms, String diagnosis, String medicinesDose, String dos, String donts,
		String investigation, String followupDate, int fees) {
	super();
	this.opdId = opdId;
	this.symtoms = symtoms;
	this.diagnosis = diagnosis;
	this.medicinesDose = medicinesDose;
	this.dos = dos;
	this.donts = donts;
	this.investigation = investigation;
	this.followupDate = followupDate;
	this.fees = fees;
}
public int getOpdId() {
	return opdId;
}
public void setOpdId(int opdId) {
	this.opdId = opdId;
}
public String getSymtoms() {
	return symtoms;
}
public void setSymtoms(String symtoms) {
	this.symtoms = symtoms;
}
public String getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(String diagnosis) {
	this.diagnosis = diagnosis;
}
public String getMedicinesDose() {
	return medicinesDose;
}
public void setMedicinesDose(String medicinesDose) {
	this.medicinesDose = medicinesDose;
}
public String getDos() {
	return dos;
}
public void setDos(String dos) {
	this.dos = dos;
}
public String getDonts() {
	return donts;
}
public void setDonts(String donts) {
	this.donts = donts;
}
public String getInvestigation() {
	return investigation;
}
public void setInvestigation(String investigation) {
	this.investigation = investigation;
}
public String getFollowupDate() {
	return followupDate;
}
public void setFollowupDate(String followupDate) {
	this.followupDate = followupDate;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "OpdDetails [opdId=" + opdId + ", symtoms=" + symtoms + ", diagnosis=" + diagnosis + ", medicinesDose="
			+ medicinesDose + ", dos=" + dos + ", donts=" + donts + ", investigation=" + investigation
			+ ", followupDate=" + followupDate + ", fees=" + fees + "]";
}

}
