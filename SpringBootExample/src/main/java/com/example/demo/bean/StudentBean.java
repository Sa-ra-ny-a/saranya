package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SPRING_STUDENT_TB")
public class StudentBean {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="STU_SEQ")
	@SequenceGenerator(sequenceName="SPRINGSEQ",allocationSize=1,name="STU_SEQ")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private String address;
	
	
	
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
	

}
