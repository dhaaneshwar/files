package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component      //to make the customers clss that belong to spring object
public class Customers {
	private int custid;
	private String custname;
	private String coursename;
	@Autowired         //searches based on the type...@Qualifier("techdet")-->searches based on the name
	private Technologies techdetail;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Technologies getTechdetail() {
		return techdetail;
	}
	public void setTechdetail(Technologies techdetail) {
		this.techdetail = techdetail;
	}
	public void display() {
		System.out.println("Customer Objects returned successfully");
		techdetail.tech();
	}
	

}
