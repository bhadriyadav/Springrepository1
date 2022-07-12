package com.skillogic.jdbc.customer;

import java.util.Scanner;

public class TestCustomerInsert {


		
	public static void main(String[] args) {
		String name=null;
		String email=null;
		String contact=null;
		String address=null;
		char c='\0';
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("enter customer name:");
		name=sc.next();
		System.out.println("enter customer email:");
		email=sc.next();
		System.out.println("enter customer contact:");
		contact=sc.next();
		System.out.println("enter customer address:");
		address=sc.next();
		System.out.println("do u want add any other customer details?( y or n):");
        c=sc.next().charAt(0);	
        sc.nextLine();
        
		CustomerInsert ci = new CustomerInsert();
		ci.insertCoustomer(name,email,contact,address);
		}while(c == 'y' ||c  == 'Y');
		sc.close();
		}
	}


