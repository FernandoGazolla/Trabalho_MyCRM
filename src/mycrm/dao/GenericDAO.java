package mycrm.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import mycrm.util.ConnectBD;

public class GenericDAO {
	private ConnectBD db = new ConnectBD();
	protected Connection connect;
	
	public void openConnection()throws ClassNotFoundException,IOException,SQLException{
		connect = db.getConnection();
		
	}
	
	public void closeConnection(){
		if(connect != null){
			try {
				connect.close();
			}catch(SQLException e){
				System.out.println("Error on Closing Connection");
			}
		}
	}

}
