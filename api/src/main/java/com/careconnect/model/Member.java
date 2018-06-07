package com.careconnect.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " member ")
public class Member implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5403368266304304797L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name = "suffix")
    private String suffix;
	
	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
    private String lastName;

	@Column(name = "middlename")
    private String middleName;

	@Column(name = "dob")
    private String dob;

	@Column(name = "ssn")
    private String ssn;

	@Column(name = "medicaidnumber")
    private Integer medicaidNumber;

	@Column(name = "groupnumber")
    private Integer groupNumber;

	@Column(name = "groupname")
    private String groupName;

    public Integer getId() {
       return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuffix() {
    	return suffix;
    }

    public void setSuffix(String suffix) {
    	this.suffix = suffix == null ? null : suffix.trim();
    }

    public String getFirstName() {
    	return firstName;
    }

    public void setFirstName(String firstName) {
    	this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
    	return lastName;
    }

 
    public void setLastName(String lastName) {
    	this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getMiddleName() {
    	return middleName;
    }

    public void setMiddleName(String middleName) {
    	this.middleName = middleName == null ? null : middleName.trim();
    }

    public String getDob() {
    	return dob;
    }

    public void setDob(String dob) {
    	this.dob = dob == null ? null : dob.trim();
    }

    public String getSsn() {
    	return ssn;
    }

    public void setSsn(String ssn) {
    	this.ssn = ssn == null ? null : ssn.trim();
    }

    public Integer getMedicaidNumber() {
    	return medicaidNumber;
    }

    public void setMedicaidNumber(Integer medicaidNumber) {
    	this.medicaidNumber = medicaidNumber;
    }

    public Integer getGroupNumber() {
    	return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
    	this.groupNumber = groupNumber;
    }

    public String getGroupName() {
    	return groupName;
    }

    public void setGroupName(String groupName) {
    	this.groupName = groupName == null ? null : groupName.trim();
    }
    
//    public Member(String firstName, String lastName, String suffix, String middleName
//    		, String dob, String ssn, Integer medicaidNumber, Integer groupNumber, String groupName) {
//    	this.firstName=firstName;
//    	this.lastName=lastName;
//    	this.middleName=middleName;
//    	this.suffix=suffix;
//    	this.dob=dob;
//    	this.ssn=ssn;
//    	this.medicaidNumber=medicaidNumber;
//    	this.groupName=groupName;
//    	this.groupNumber=groupNumber;
//    }

   
}
