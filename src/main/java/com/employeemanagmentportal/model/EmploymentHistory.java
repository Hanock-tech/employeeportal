package com.employeemanagmentportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="employment_history")
@Table(name = "employment_history")

public class EmploymentHistory {
	
	@Id
	private int id;

	private long emp_id;

	private String organization_name;

	private String from_date;

	private String until_date;

	private String location;
	private String country;
	private String post;
	private String skill_used;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getUntil_date() {
		return until_date;
	}
	public void setUntil_date(String until_date) {
		this.until_date = until_date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getSkill_used() {
		return skill_used;
	}
	public void setSkill_used(String skill_used) {
		this.skill_used = skill_used;
	}
	@Override
	public String toString() {
		return "EmploymentHistory [emp_id=" + emp_id + ", organization_name=" + organization_name + ", from_date="
				+ from_date + ", until_date=" + until_date + ", location=" + location + ", country=" + country
				+ ", post=" + post + ", skill_used=" + skill_used + "]";
	}

	
	
	
	
	

}
