package cybersoft.java.crm.bussiness;

import java.util.List;

import cybersoft.java.crm.dao.RoleDao;
import cybersoft.java.crm.model.Role;

public class RoleBiz {
	private RoleDao dao;
	
	public RoleBiz() {
		dao = new RoleDao();
	}
	
	public List<Role> findAll(){
		return dao.findAll();
	}

}
