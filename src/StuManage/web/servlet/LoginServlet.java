package StuManage.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import StuManage.been.NoteBeen;
import StuManage.been.UserBeen;
import StuManage.dao.AdminDao;
import StuManage.dao.impl.AdminDaoImpl;
import StuManage.service.LoginServiceImpl;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String temp=request.getParameter("temp");
		AdminDao admin =new AdminDaoImpl();
		ServletContext application=request.getServletContext();
		if("logout".equals(temp)) {
			exitSystem(request, response);
		}
		int num = Integer.parseInt(request.getParameter("userType"));
		String name =request.getParameter("username");
		String pass = request.getParameter("userpass");
		UserBeen user =new  UserBeen();
		user.setUserName(name);
		user.setUserPass(pass);
		user.setType(num);
		if("".equals(name) || "".equals(pass)) {
			request.setAttribute("msg", "用户名和密码不能为空，请重新登录！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		if(num==0) {
			request.setAttribute("msg", "请选择用户类型，请重新登录！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		System.out.println(num+name+pass);
		LoginServiceImpl ls=new LoginServiceImpl();
		HttpSession session =request.getSession();
		if(num==1) {
			UserBeen u =ls.login(user);
			System.out.println(u.getUserName());
			if(u.getUserName()==null) {
				request.setAttribute("msg", "该用户不存在，请重新登录！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				List<NoteBeen> note =admin.Note(); 
				application.setAttribute("note", note);
				session.setAttribute("user", u);
				response.sendRedirect("admin/index.jsp");
			}
			
		}else if(num==2) {
			UserBeen u =ls.login(user);
			System.out.println(u.getUserName());
			if(u.getUserName()==null) {
				request.setAttribute("msg", "该用户不存在，请重新登录！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				List<NoteBeen> note =admin.Note(); 
				application.setAttribute("note", note);
				session.setAttribute("user", u);
				response.sendRedirect("teacher/index.jsp");
			}
			
		}else if(num==3) {
			UserBeen u =ls.login(user);
			System.out.println(u.getUserName());
			if(u.getUserName()==null) {
				request.setAttribute("msg", "该用户不存在，请重新登录！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				List<NoteBeen> note =admin.Note(); 
				application.setAttribute("note", note);
				session.setAttribute("user", u);
				response.sendRedirect("student/index.jsp");
			}
		}else {
			response.sendRedirect("404.jsp");
		}
		
	}
	//退出系统
			protected void exitSystem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				HttpSession session = request.getSession();
				session.removeAttribute("user");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

}
