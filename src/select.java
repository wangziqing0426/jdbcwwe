import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;


public class select {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("加载成功");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("加载异常");
		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studb", "root", "wzq");
			System.out.println("连接成功");
			Statement sta = (Statement) con.createStatement();

			ResultSet rs = (ResultSet) sta.executeQuery("select*form studentinfo");
			while (rs.next()) {
				String usersname = rs.getString("usersname");
				String password = rs.getString("password");
				System.out.println(usersname+ password);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接异常");
			e.printStackTrace();
		}

	}

	
	
	
	
	
	

}
