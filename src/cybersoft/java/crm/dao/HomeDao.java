package cybersoft.java.crm.dao;

import java.sql.Connection;
import java.sql.Statement;

import cybersoft.java.crm.config.MysqlConnection;


public class HomeDao {
	public boolean testConnection() {
		Connection connection = MysqlConnection.getConnection();
		if(connection == null) {
			return false;
		}
		return true;
	}
	
	public boolean checkHealth() {
		boolean result = false;
		Connection connection = MysqlConnection.getConnection();
		if(connection == null)
			return false;
		
		String test = "select 1 from dual";
		try {
			Statement statement = connection.createStatement();
			result = statement.execute(test);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
}
