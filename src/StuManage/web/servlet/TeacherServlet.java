package StuManage.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.TeacherBeen;
import StuManage.been.UserBeen;
import StuManage.dao.TeacherDao;
import StuManage.dao.impl.TeacherDaoImpl;
import StuManage.service.StudentService;
import StuManage.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class TeacherServlet
 */
@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(request.getParameter("num"));
		System.out.println(num);
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		TeacherBeen ter = new TeacherBeen();
		ter.setTeachername(user.getUserName());
		TeacherBeen newter = td.queryByname(ter);
		session.setAttribute("ter", newter);
		if(num==0) {//添加学生
			insterStu(request, response);
		}else if(num==1){//查询所有学生
			queryAllStu(request, response);
		}else if(num==2){//查询课程表
//			queryConactInfo(request, response);
		}else if(num==3){//成绩登记
//			queryStuInfo(request, response);
		}else if(num==4){//查询成绩
			queryScore(request, response);
		}else if(num==5){//发布公告
//			updateStuPass(request, response);
		}else if(num==6){//个人信息
			queryme(request, response);
		}else if(num==7){//修改密码
			updateStuPass(request, response);
		}else if(num==8){//修改
			updateInfo(request, response);
		}else if(num==9){//删除
			dropInfo(request, response);
		}
		
	}
	TeacherDao td = new TeacherDaoImpl();
	//添加学生
	protected void insterStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		StudentBeen stu = new StudentBeen();
		stu.setStudentname(request.getParameter("username"));
		stu.setSex(request.getParameter("sex"));
		stu.setIdentityId(request.getParameter("identityId"));
		stu.setSstatus(request.getParameter("sstatus"));
		stu.setSttell(request.getParameter("sttell"));
		stu.setParenttell(request.getParameter("parenttell"));
		stu.setAddress(request.getParameter("address"));
		stu.setStyState(Integer.parseInt(request.getParameter("styState")));
		stu.setSchool(request.getParameter("school"));
		stu.setDorm(request.getParameter("dorm"));
		stu.setStudentpass(request.getParameter("studentpass"));
		TeacherBeen newter = (TeacherBeen)session.getAttribute("ter");
		stu.setCid(newter.getCid());
		int nn = td.inster(stu);
		System.out.println(nn);
		if(nn==1){
			request.getRequestDispatcher("/teacher/addStudent.jsp").forward(request, response);
		}

	}
	//查询所有学生信息
	protected void queryAllStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
//		UserBeen user = (UserBeen)session.getAttribute("user");
		TeacherBeen newter = (TeacherBeen)session.getAttribute("ter");
		List<StudentBeen> Tlist = td.queryByclass(newter);
		session.setAttribute("stu", Tlist);
		request.getRequestDispatcher("/teacher/teacher_chaxun.jsp").forward(request, response);
	}
	//查询个人信息
	protected void queryme(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		TeacherBeen ter = (TeacherBeen)session.getAttribute("ter");
		request.getRequestDispatcher("/teacher/teacher_xx.jsp").forward(request, response);
	}
	//查询成绩
	protected void queryScore(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		TeacherBeen ter = (TeacherBeen)session.getAttribute("ter");
		request.getRequestDispatcher("/teacher/teacher_xx.jsp").forward(request, response);
	}
	//修改密码
	StudentService ss = new StudentServiceImpl();
	protected void updateStuPass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String oldpass=request.getParameter("oldpass");
			String newpass=request.getParameter("newpass");
			String rnewpass=request.getParameter("rnewpass");
			System.out.println(oldpass+newpass);
			HttpSession session = request.getSession();
			UserBeen user = (UserBeen)session.getAttribute("user");
			TeacherBeen ter = (TeacherBeen)session.getAttribute("ter");
			System.out.println(ter.getTeacherpass());
			if(ter.getTeacherpass().equals(oldpass) && newpass.equals(rnewpass)) {
				int num =td.updatePass(ter);
				if(num==1) {
					request.setAttribute("msg", "修改成功！");
					request.getRequestDispatcher("success.jsp").forward(request, response);
				}else {
					response.sendRedirect("404.jsp");
				}
			}else {
				request.setAttribute("msg", "修改失败，请重新修改！");
				request.getRequestDispatcher("/student/student_xgmm.jsp").forward(request, response);
			}
	}
	//修改信息
	protected void updateInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		TeacherBeen ter = (TeacherBeen)session.getAttribute("ter");
		
		request.getRequestDispatcher("/teacher/teacher_xx.jsp").forward(request, response);
	}
	//删除信息
	protected void dropInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		TeacherBeen ter = (TeacherBeen)session.getAttribute("ter");
		int temp=Integer.parseInt(request.getParameter("temp"));
		System.out.println(temp);
		if(temp==1) {
			
		}else if(temp==2) {
			
		}
		
		request.getRequestDispatcher("/teacher/teacher_xx.jsp").forward(request, response);
	}

}
