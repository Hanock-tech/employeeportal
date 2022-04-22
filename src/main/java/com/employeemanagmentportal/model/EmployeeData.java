package com.employeemanagmentportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="employees")
@Table(name = "employees")

public class EmployeeData {


	@Id
	
	private long emp_id;
	@NotEmpty(message="* field can't be empty ")
     @Size(min=6,max=15,message=" * Please enter 6 letter to 15")
	
	private String first_name;
	@NotEmpty(message="* field can't be empty ")
	private String last_name;
	@NotEmpty(message="* Please choose gender")
	private String gender;
	@NotEmpty(message="pick date ")
	private String dob;
	private String pan_num;
	private String aadhaar_num;
	@NotEmpty(message="field can't be empty   ")
	 @Size(min=0,max=10,message="Please enter Numbers")
	private String mobile_num;
	private String email_id;
	@NotEmpty(message="field can't be empty ")
	@Column(unique=true)
	@Email(message="Please provide valid office email")
	private String office_mail;
	private String present_address;
	@NotEmpty(message="field can't be empty ")
	private String blood_group;
	private String profile_pict;
	@NotEmpty(message="field can't be empty  ")
	private String doj;
	@NotEmpty(message="field can't be empty  ")
	private String emp_level;
	@NotEmpty(message="field can't be empty   ")
	private String post_name;
	
	private int basic_pay;
	
	private int house_allowance;
	private String permanent_address;

	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getPermanent_address() {
		return permanent_address;
	}



	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}



	




	public long getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}



	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPan_num() {
		return pan_num;
	}

	public void setPan_num(String pan_num) {
		this.pan_num = pan_num;
	}

	public String getAadhaar_num() {
		return aadhaar_num;
	}

	public void setAadhaar_num(String aadhaar_num) {
		this.aadhaar_num = aadhaar_num;
	}

	public String getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getOffice_mail() {
		return office_mail;
	}

	public void setOffice_mail(String office_mail) {
		this.office_mail = office_mail;
	}

	public String getPresent_address() {
		return present_address;
	}

	public void setPresent_address(String present_address) {
		this.present_address = present_address;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getProfile_pict() {
		return profile_pict;
	}

	public void setProfile_pict(String profile_pict) {
		this.profile_pict = profile_pict;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	

	
	public String getEmp_level() {
		return emp_level;
	}



	public void setEmp_level(String emp_level) {
		this.emp_level = emp_level;
	}



	public String getPost_name() {
		return post_name;
	}

	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}

	public int getBasic_pay() {
		return basic_pay;
	}

	public void setBasic_pay(int basic_pay) {
		this.basic_pay = basic_pay;
	}

	public int getHouse_allowance() {
		return house_allowance;
	}

	public void setHouse_allowance(int house_allowance) {
		this.house_allowance = house_allowance;
	}

	@Override
	public String toString() {
		return "EmployeeData [emp_id=" + emp_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", gender=" + gender + ", dob=" + dob + ", pan_num=" + pan_num + ", aadhaar_num=" + aadhaar_num
				+ ", mobile_num=" + mobile_num + ", email_id=" + email_id + ", office_mail=" + office_mail
				+ ", present_address=" + present_address + ", blood_group=" + blood_group + ", profile_pict="
				+ profile_pict + ", doj=" + doj + ", emp_level=" + emp_level + ", post_name=" + post_name
				+ ", basic_pay=" + basic_pay + ", house_allowance=" + house_allowance + "]";
	}

}
