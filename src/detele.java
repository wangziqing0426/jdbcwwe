import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class detele {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���سɹ�");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����쳣");
		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studb", "root", "wzq");
			System.out.println("���ӳɹ�");
			Statement sta = (Statement) con.createStatement();
			int n = sta.executeUpdate("delete  form studentinfo   where usersname='tom'");
			System.out.println("ɾ���ɹ�" + n + "��");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�����쳣");
			e.printStackTrace();
		}

	}

}
