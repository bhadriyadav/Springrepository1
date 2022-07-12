package com.skillogic.jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerInsert {

	
		public void insertCoustomer(String name, String email, String contact, String address) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection  con =DriverManager .getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				String Customerinsert="insert into customer_details(Customer_name ,Customer_email ,Customer_contact,Customer_address)values('"+name+"' ,'"+email+"','"+contact+"' ,' "+address+" ' )";
				 Statement st = con.createStatement();
				int  i =st.executeUpdate(Customerinsert);
			if(i>0)
				         	System.out.println(i+" customer Inserted......");
				else
					System.out.println(i+"customer Inserted failed...");
				st.close();
				con.close();
					
			}catch(ClassNotFoundException cnf) {
				cnf.printStackTrace();
				System.out.println("Driver class not loadded...");
			}catch(SQLException sqe) {
				sqe.printStackTrace();
				System.out.println("Connection is not established");
				
			}
			}
		
		
		
	}


