package com.tnsif.collegeservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
@Id
@Column(name="id")
	private int id;
@Column(name="Name")
private String Name;
@Column(name="Email")
private String Email;
@Column(name="PhoneNumber")
private String PhoneNumber;
@Column(name="Department")
private String Deparment;
@Column(name="Batch")
private String Batch;
@Column(name="CGPA")
private double CGPA;
@Column(name="PlacementStatus")
private String PlacementStatus;
@Column(name="CompanyName")
private String CompanyName;
@Column(name="SalaryOffered")
private String SalaryOffered;


public College() {
	super();
	// TODO Auto-generated constructor stub
}


public College(int id, String name, String email, String phoneNumber, String deparment, String batch,
		double cGPA, String placementStatus, String companyName, String salaryOffered) {
	super();
	this.id = id;
	Name = name;
	Email = email;
	PhoneNumber = phoneNumber;
	Deparment = deparment;
	Batch = batch;
	CGPA = cGPA;
	PlacementStatus = placementStatus;
	CompanyName = companyName;
	SalaryOffered = salaryOffered;
}


/**
 * @return the id
 */
public int getId() {
	return id;
}


/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}


/**
 * @return the name
 */
public String getName() {
	return Name;
}


/**
 * @param name the name to set
 */
public void setName(String name) {
	Name = name;
}


/**
 * @return the email
 */
public String getEmail() {
	return Email;
}


/**
 * @param email the email to set
 */
public void setEmail(String email) {
	Email = email;
}


/**
 * @return the phoneNumber
 */
public String getPhoneNumber() {
	return PhoneNumber;
}


/**
 * @param phoneNumber the phoneNumber to set
 */
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}


/**
 * @return the deparment
 */
public String getDeparment() {
	return Deparment;
}


/**
 * @param deparment the deparment to set
 */
public void setDeparment(String deparment) {
	Deparment = deparment;
}


/**
 * @return the batch
 */
public String getBatch() {
	return Batch;
}


/**
 * @param batch the batch to set
 */
public void setBatch(String batch) {
	Batch = batch;
}


/**
 * @return the cGPA
 */
public double getCGPA() {
	return CGPA;
}


/**
 * @param cGPA the cGPA to set
 */
public void setCGPA(double cGPA) {
	CGPA = cGPA;
}


/**
 * @return the placementStatus
 */
public String getPlacementStatus() {
	return PlacementStatus;
}


/**
 * @param placementStatus the placementStatus to set
 */
public void setPlacementStatus(String placementStatus) {
	PlacementStatus = placementStatus;
}


/**
 * @return the companyName
 */
public String getCompanyName() {
	return CompanyName;
}


/**
 * @param companyName the companyName to set
 */
public void setCompanyName(String companyName) {
	CompanyName = companyName;
}


/**
 * @return the salaryOffered
 */
public String getSalaryOffered() {
	return SalaryOffered;
}


/**
 * @param salaryOffered the salaryOffered to set
 */
public void setSalaryOffered(String salaryOffered) {
	SalaryOffered = salaryOffered;
}


@Override
public String toString() {
	return "Collegeservice [id=" + id + ", Name=" + Name + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber
			+ ", Deparment=" + Deparment + ", Batch=" + Batch + ", CGPA=" + CGPA + ", PlacementStatus="
			+ PlacementStatus + ", CompanyName=" + CompanyName + ", SalaryOffered=" + SalaryOffered + "]";
}



	

}
