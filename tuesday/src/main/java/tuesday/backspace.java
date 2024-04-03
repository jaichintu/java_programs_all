package tuesday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class backspace {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/retro", "root", "Jaichintu@1146");
		PreparedStatement pt = con.prepareStatement("update tester set name=? where id=?");
		 System.out.println("enter name");
		 pt.setString(1,sc.next());
		 System.out.println("enter id");
		 pt.setInt(2,sc.nextInt());

//		ResultSet e = pt.executeQuery();
//		while (e.next()) {
//			System.out.println("ID : " + e.getInt(1));
//			System.out.println("NAME : " + e.getString(2));
//			System.out.println("ADDRESS : " + e.getString(3));
//		}
		 int e=pt.executeUpdate();
		con.close();
		System.out.println(e);

	}
}
