package com.training;

import java.util.Scanner;

public class EmployeeImpl extends EmployeeDetailsImplementation {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int mychoice=1;
		do{
			System.out.println("1.Add Employee");
			System.out.println("2.Show All Employee");
			System.out.println("3.Show Particular Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Modify Employee");
			
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice){
			case 1:addEmployee();
			break;
			case 2:showAllEmployee();
			break;
			case 3:showParticularEmployee();
			break;
			case 4: delEmployee();
			break;
			case 5:modifyEmployee();
			break;
			default: System.out.println("You Entered wrong choice");
			}
			System.out.println("Enter 1 to continue");
			mychoice=sc.nextInt();
		}while(mychoice==1);

	}

}
