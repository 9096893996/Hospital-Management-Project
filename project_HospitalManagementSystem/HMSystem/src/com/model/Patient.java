package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String pcity;
	private String pdescrption;
	public String getPdescrption() {
		return pdescrption;
	}
	public void setPdescrption(String pdescrption) {
		this.pdescrption = pdescrption;
	}
	
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", pcity=" + pcity + ", pdescrption=" + pdescrption + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

}
