package cybersoft.java.crm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cybersoft.java.crm.config.MysqlConnection;
import cybersoft.java.crm.model.Role;

public class RoleDao {
	
	public List<Role> findAll(){
		List<Role> listRole = new LinkedList<Role>();
		Connection connection = MysqlConnection.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			String query = "select id, name, description from role";
			
			ResultSet res = statement.executeQuery(query);
			
			while(res.next()) {
				Role newRole = new Role();
				newRole.setId(res.getInt("id"));
				newRole.setName(res.getString("name"));
				newRole.setDescription(res.getString("description"));
				
				listRole.add(newRole);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listRole;
	}
}
