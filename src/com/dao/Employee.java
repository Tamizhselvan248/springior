package com.dao;

public class Employee {
	private int eid;
	private String ename;
	
	public Employee(int eid, String ename) {
		this.setEid(eid);
		this.setEname(ename);
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

}
