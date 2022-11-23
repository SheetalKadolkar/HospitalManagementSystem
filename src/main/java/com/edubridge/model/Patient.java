package com.edubridge.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Patient {
	private String pid;
	
	private String name;
	
	private String birthdate;
	private String gender;
	@Column(unique=true)
	private String emailID;	//optional
	
	@Column(unique=true)
	private long mobileNo;	
	
	@Column(unique=true)
	private long adharNo;
	
	private String country;
	private String state;
	private String city;
	
	private String address;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String pid, String name, String birthdate, String gender, String emailID, long mobileNo,
			long adharNo, String country, String state, String city, String address) {
		super();
		this.pid = pid;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
		this.adharNo = adharNo;
		this.country = country;
		this.state = state;
		this.city = city;
		this.address = address;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", birthdate=" + birthdate + ", gender=" + gender
				+ ", emailID=" + emailID + ", mobileNo=" + mobileNo + ", adharNo=" + adharNo + ", country=" + country
				+ ", state=" + state + ", city=" + city + ", address=" + address + "]";
	}
	

}
