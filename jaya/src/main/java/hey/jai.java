package hey;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class jai {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaya","root","Jaichintu@1146");
//		PreparedStatement pt=con.prepareStatement("create database jaya");
		PreparedStatement pt=con.prepareStatement("create table demo(id integer,name varchar(50),address varchar(50))");
//	PreparedStatement pt=con.prepareStatement("insert into demo values(1,'dboss')");
//		PreparedStatement pt=con.prepareStatement("update demo set id=10 where name='dboss'");
//		PreparedStatement pt=con.prepareStatement("delete from demo where id=10");
		
		
		boolean b=pt.execute();
		con.close();
		System.out.println(b);
		
	}

}
