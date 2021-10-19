package com.training;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetailsImplementation {
	static ArrayList<EmployeeDetailsShow> employeelist=new ArrayList<EmployeeDetailsShow>();
	static Scanner sc=new Scanner(System.in);
	public static void addEmployee(){
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		System.out.println("Enter Employee First Name:");
		String fname=sc.next();
		System.out.println("Enter Employee Last Name:");
		String lname=sc.next();
		EmployeeDetailsShow emp=new EmployeeDetailsShow(id,fname,lname);
		employeelist.add(emp);
		
	}
	public static void delEmployee(){
		System.out.println("Enter Employee Id To be removed:");
		int id=sc.nextInt();
		for(EmployeeDetailsShow e : employeelist) {
	        if(e.getId() == id){
	        	System.out.println("Employee With Following Details Is going to be removed");
	            System.out.print("\n"+e.getId());
	            System.out.print("\n"+e.getFname());
	            System.out.print("\n"+e.getLname());
	        }else {
	        	System.out.println("Employee with id "+id+" not existing");
	        }
	    }
		employeelist.remove(id);
	}
	
	public static void showAllEmployee(){
		System.out.println("Showing All Employee List");
		System.out.println(employeelist);
	}
	
	public static void showParticularEmployee(){
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		for(EmployeeDetailsShow e : employeelist) {
	        if(e.getId() == id){
	            System.out.print("\nEmployee Id:"+e.getId());
	            System.out.print("\nEmployee First Name"+e.getFname());
	            System.out.print("\nEmployee Last Name"+e.getLname());
	        }
	    }
	}
	
	public static void modifyEmployee(){
		System.out.println("Enter only the data you want to modify");
		System.out.println("Enter Employee Id: to be modified");
		int id=sc.nextInt();
		System.out.println("Enter Employee First Name:");
		String fname=sc.next();
		System.out.println("Enter Employee Last Name:");
		String lname=sc.next();
		EmployeeDetailsShow emp=new EmployeeDetailsShow(id,fname,lname);
		employeelist.set(id, emp);
	}

}