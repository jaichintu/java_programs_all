package yte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class kia {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polo","root","Jaichintu@1146");
		
//		PreparedStatement pt=con.prepareStatement("create database polo");
		PreparedStatement pt=con.prepareStatement("create table info(id integer,name varchar(50),phonenumber bigint,age integer)");
		boolean e=pt.execute();
		con.close();
		System.out.println("done");
	}

}
