package com.user;

import java.util.Scanner;

import com.dao.*;
import com.dto.*;

public class Main extends Controller{

	public Main(int eid, String ename) {
		super(eid, ename);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int eid=0;
		String ename=" ";
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Enter Emp ID :");
			eid=sc.nextInt();
			
			System.out.println("Enter Emp Name :");
			ename=sc.next();
			
			Employee e=new Employee(eid, ename);
			
			System.out.println("Make your choice : \n 1. Save \n 2. Update \n 3. Get Data \n 4. GetDataById");
			
			int choice=sc.nextInt();
			
			
			switch (choice) {
			case 1 : {
				
			}break;
			
			case 2: {
				System.out.println("Enter new emp ID : ");
				int id=sc.nextInt();
				
				System.out.println("Enter new emp Name : ");
				String name=sc.next();

				update(e, id, name);
				
			}break;
			
			case 3 : {
				
			}break;
			
			case 4 : {
				
			}break;
			}
		}
	}

}
