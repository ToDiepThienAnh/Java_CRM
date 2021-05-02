package cybersoft.java.crm.bussiness;

import cybersoft.java.crm.dao.HomeDao;

public class HomeBussiness {
	private HomeDao dao;
	
	public HomeBussiness() {
		dao = new HomeDao();
	}
	
	public boolean checkHealth() {
		return dao.checkHealth();
	}
}
