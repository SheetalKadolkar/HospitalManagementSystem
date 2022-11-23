package com.edubridge.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
private String residentialAddress;
private String permanentAddress;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String residentialAddress, String permanentAddress) {
	super();
	this.residentialAddress = residentialAddress;
	this.permanentAddress = permanentAddress;
}
public String getResidentialAddress() {
	return residentialAddress;
}
public void setResidentialAddress(String residentialAddress) {
	this.residentialAddress = residentialAddress;
}
public String getPermanentAddress() {
	return permanentAddress;
}
public void setPermanentAddress(String permanentAddress) {
	this.permanentAddress = permanentAddress;
}
@Override
public String toString() {
	return "Address [residentialAddress=" + residentialAddress + ", permanentAddress=" + permanentAddress + "]";
}


}
