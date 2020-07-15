package com.hibernate.dao.dto;

import java.sql.Timestamp;
import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;


public class EmployeeDTO {
	
	private MultipartFile photo;
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [photo=" + photo + ", name=" + name + ", address=" + address + ", role=" + role
				+ ", Salary=" + Salary + ", DOB=" + DOB + ", bphoto=" + Arrays.toString(bphoto) + "]";
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
	public byte[] getBphoto() {
		return bphoto;
	}
	public void setBphoto(byte[] bphoto) {
		this.bphoto = bphoto;
	}
	private String name;
	private String address;
	private String role;
	private String Salary;
	private Timestamp DOB;
	private byte[] bphoto;
}
