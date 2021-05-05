package cybersoft.java.crm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java.crm.bussiness.RoleBiz;
import cybersoft.java.crm.model.Role;

@WebServlet(name = "roleServlet", urlPatterns = {
		"/role"
})
public class RoleServlet extends HttpServlet {
	private RoleBiz biz;
	
	@Override
	public void init() throws ServletException {
		// TODO: init RoleBiz
		super.init();
		biz = new RoleBiz();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Role> listRole = biz.findAll();
		
		for(Role role : listRole) {
			resp.getWriter().append(role.toString());
		}
	}
}