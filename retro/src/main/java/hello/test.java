package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/retro","root","Jaichintu@1146");
//		PreparedStatement pt=con.prepareStatement("create database retro");
//		PreparedStatement pt=con.prepareStatement("create table tester(id integer,name varchar(50),address varchar(50))");
//		PreparedStatement pt=con.prepareStatement("insert into tester values(1,'simon','bangalore')");
		PreparedStatement pt=con.prepareStatement("insert into tester values(2,'sai kumar','belagum')"); 
		int b=pt.executeUpdate();
		con.close();
		System.out.println(b);
	}

}
