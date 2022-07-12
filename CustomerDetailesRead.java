package com.skillogic.jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;

public class CustomerDetailesRead {
	public int  id =0;
	public void readDetails(int id ) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st =  con.createStatement();
			ResultSet rs =st.executeQuery("select * from customer_details where Customer_id in ('"+id+"') ");
			while (rs .next()) {
				System.out.println(rs.getString("Customer_id")+" "+rs.getString("Customer_name")+" "+rs.getString("Customer_email")+" "+rs.getString("Customer_contact")+" "+rs.getString("Customer_address"));
			}
			rs.close();
			st.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

    public static void main(String[] args) {
    	int  id =0;
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter tha customer_id");
    	id=sc .nextInt();
    	sc.close();
    	CustomerDetailesRead cdr =new CustomerDetailesRead();
		cdr.readDetails(id);
    }
}