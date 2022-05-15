package StuManage.web.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import StuManage.been.MessgeBeen;
import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.UserBeen;
import StuManage.service.MessgeService;
import StuManage.service.StudentService;
import StuManage.service.impl.MessgeServiceImpl;
import StuManage.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
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
		if(num==0) {
			queryInfoByStudent(request, response);
		}else if(num==1){
			queryScoreByStudent(request, response);
		}else if(num==3){
			queryStuInfo(request, response);
		}else if(num==4){
			updateStuInfo(request, response);
		}else if(num==5){
			updateStuPass(request, response);
		}else if(num==6){
			contactTeacher(request, response);
		}else if(num==7){
			msglist1(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	StudentService ss = new StudentServiceImpl();
	//查询学生个人信息
		protected void queryInfoByStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String studentname =request.getParameter("studentname");
			UserBeen user = new UserBeen();
			user.setUserName(studentname);
			StudentBeen newstuBeen = ss.queryBySelf(user);
			if(user.getUserName().equals(newstuBeen.getStudentname())) {
				request.setAttribute("stuInfo", newstuBeen);
				request.getRequestDispatcher("/student/student_xx.jsp").forward(request, response);
			}
		}
	
	//查询学生成绩
		protected void queryScoreByStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session = request.getSession();
			UserBeen user = (UserBeen)session.getAttribute("user");
			StudentBeen newstuBeen = ss.queryBySelf(user);
			StudentBeen stu =new StudentBeen();
			stu.setStnumber(newstuBeen.getStnumber());
			List<ScoreBeen> list = ss.queryScoreBySelf(stu);
			if(list!=null && !list.isEmpty()) {
				request.setAttribute("scoreList", list);
				
			}else {
				list=new ArrayList<ScoreBeen>();
				request.setAttribute("msg", "未查询到您的考试信息");
			}
			request.getRequestDispatcher("/student/student_cj.jsp").forward(request, response);
		}
	
	//查询学生个人信息
		protected void queryStuInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session = request.getSession();
			UserBeen user = (UserBeen)session.getAttribute("user");
			StudentBeen newstuBeen = ss.queryBySelf(user);
			request.setAttribute("userinfo", newstuBeen);
			request.getRequestDispatcher("/student/student_stuxx.jsp").forward(request, response);
					
		}
	//修改学生个人信息
		protected void updateStuInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session = request.getSession();
			UserBeen user = (UserBeen)session.getAttribute("user");
			StudentBeen newstuBeen = ss.queryBySelf(user);
			StudentBeen stu =new StudentBeen();
			stu.setStnumber(newstuBeen.getStnumber());
			stu.setStudentname(request.getParameter("user"));
			stu.setSex(request.getParameter("sex"));
			System.out.println(stu.getSex());
			stu.setSstatus(request.getParameter("xj"));
			stu.setSttell(request.getParameter("stuphone"));
			stu.setParenttell(request.getParameter("parentphone"));
			stu.setAddress(request.getParameter("address"));
			int num =ss.updateInfoByself(stu);
			if(num!=1) {
				response.sendRedirect("404.jsp");
			}else {
				UserBeen u = new UserBeen();
				u.setUserName(request.getParameter("user"));
				StudentBeen stuBeen = ss.queryBySelf(u);
				session.setAttribute("user", u);
				request.setAttribute("userinfo", stuBeen);
				request.getRequestDispatcher("/student/student_stuxx.jsp").forward(request, response);
			}
			
							
		}
	//修改密码
		protected void updateStuPass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
				String oldpass=request.getParameter("oldpass");
				String newpass=request.getParameter("newpass");
				String rnewpass=request.getParameter("rnewpass");
				System.out.println(oldpass+newpass);
				HttpSession session = request.getSession();
				UserBeen user = (UserBeen)session.getAttribute("user");
				StudentBeen newstuBeen = ss.queryBySelf(user);
				StudentBeen stu =new StudentBeen();
				System.out.println(newstuBeen.getStudentpass());
				if(newstuBeen.getStudentpass().equals(oldpass) && newpass.equals(rnewpass)) {
					stu.setStnumber(newstuBeen.getStnumber());
					stu.setStudentpass(newpass);
					int num =ss.updatePassByself(stu);
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
	//联系老师
		protected void contactTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String message=request.getParameter("message");
			HttpSession session = request.getSession();
			UserBeen user = (UserBeen)session.getAttribute("user");
			String sxr =request.getParameter("sxr");
			System.out.println(sxr);
			MessgeBeen msgBeen = new MessgeBeen();
			msgBeen.setFxr(user.getUserName());
			msgBeen.setSxr(sxr);
			msgBeen.setMasage(message);
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			String nowTime = sdf.format(Calendar.getInstance().getTime());
			msgBeen.setMtime(nowTime);
			MessgeService ms= new MessgeServiceImpl();
			int num=ms.message(msgBeen);
			List<MessgeBeen> msgList1=null;
			List<MessgeBeen> msgList2=null;
			if(num!=1) {
				msgList1=new ArrayList<MessgeBeen>();
				msgList2=new ArrayList<MessgeBeen>();
			}else {
				msgList1=ms.querymessage(msgBeen,1);
				msgList2=ms.querymessage(msgBeen,2);
				session.setAttribute("msglist1", msgList1);
				session.setAttribute("msglist2", msgList2);
			}
			request.getRequestDispatcher("student/student_chat.jsp").forward(request, response);
				
		}
		
		protected void msglist1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session = request.getSession();
			UserBeen user = (UserBeen)session.getAttribute("user");
			String sxr = request.getParameter("sxr");
			MessgeService ms= new MessgeServiceImpl();
			MessgeBeen msgBeen = new MessgeBeen();
			msgBeen.setFxr(user.getUserName());
			msgBeen.setSxr(sxr);
			List<MessgeBeen> msgList1=null;
			List<MessgeBeen> msgList2=null;
				msgList1=new ArrayList<MessgeBeen>();
				msgList2=new ArrayList<MessgeBeen>();
				msgList1=ms.querymessage(msgBeen,1);
				msgList2=ms.querymessage(msgBeen,2);
				session.setAttribute("msglist1", msgList1);
				session.setAttribute("msglist2", msgList2);
				session.setAttribute("msgBeen", msgBeen);
			request.getRequestDispatcher("student/student_chat.jsp").forward(request, response);
		}
		
	
}
