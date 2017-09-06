package mycrm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBD {
	private static ConnectBD conexaoUtil;

	public static ConnectBD getInstance() {
		if (conexaoUtil == null) {
			conexaoUtil = new ConnectBD();
		}
		return conexaoUtil;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost/mycrm";
		String usuario = "root";
		String senha = "";
		Connection con = DriverManager.getConnection(url, usuario, senha);

		return con;
	}

	public static void main(String[] args) {
		try {
			System.out.println(getInstance().getConnection());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
