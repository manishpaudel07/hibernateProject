package com.hibernate.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employ_table")
public class EmployeeEntity {
	
	
	private int employeeId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(columnDefinition = "varchar(30) default 'customer'")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public Timestamp getDOB() {
		return DOB;
	}
	public void setDOB(Timestamp dOB) {
		DOB = dOB;
	}
	
	@Column(columnDefinition="longblob")
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	private String name;
	private String address;
	private String role;
	private String Salary;
	private Timestamp DOB;
	private byte[] photo;

}
