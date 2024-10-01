package com.dto;
import com.dao.*;

public class Controller extends Employee{
	
	public Controller(int eid, String ename) {
		super(eid, ename);
		// TODO Auto-generated constructor stub
		
	}

	Employee arr[]=new Employee[10];
	
	public static void save() {
		
	}
	
	public static void update(Employee e, int eid, String ename) {
		e.setEid(eid);
		e.setEname(ename);
		
	}
	
	public static void getData() {
		
	}
	
	public static void getById() {
		
	}
	
//	@Override
//	public void setEid(int eid) {
//		this.eid=eid;
//	}
	

}
