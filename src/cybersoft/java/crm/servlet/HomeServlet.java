package cybersoft.java.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java.crm.bussiness.HomeBussiness;

@WebServlet(name = "homeServlet", urlPatterns = {
		"/health"
})
public class HomeServlet extends HttpServlet {
	private HomeBussiness biz;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		biz = new HomeBussiness();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO check database Health
		boolean databaseCheckHealthResult = biz.checkHealth();
		if(databaseCheckHealthResult) {
			resp.getWriter().append("Connection to databse has been made succesfully ");
		} else {
			resp.getWriter().append("Connection to databse has been unsuccesfully");	
		}
	}
	
}
