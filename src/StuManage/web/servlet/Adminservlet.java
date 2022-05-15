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

import StuManage.been.AdminBeen;
import StuManage.been.BanBeen;
import StuManage.been.CourseBeen;
import StuManage.been.MessgeBeen;
import StuManage.been.NoteBeen;
import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.TeacherBeen;
import StuManage.been.UserBeen;
import StuManage.dao.AdminDao;
import StuManage.dao.impl.AdminDaoImpl;
import StuManage.service.MessgeService;
import StuManage.service.StudentService;
import StuManage.service.impl.MessgeServiceImpl;
import StuManage.service.impl.StudentServiceImpl;

@WebServlet("/Adminservlet")
public class Adminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(request.getParameter("num"));
		HttpSession session = request.getSession();
		System.out.println(num);
		if(num==0) {
			chastudent(request, response);
		}else if(num==1){
			chateacher(request, response);
		}else if(num==2){
			chacourse(request, response);
		}else if(num==3){
			chamy(request, response);
		}else if(num==4){
			jointeacher(request, response);
		}else if(num==5){
			joinClass(request, response);
		}else if(num==6){
			joinkec(request, response);
		}else if(num==7){
			updatePassByself(request, response);
		}else if(num==8){
			chaScoreAll(request, response);
		}else if(num==9){
			chaban(request, response);
		}else if(num==10){
			deleteStu(request, response);
		}else if(num==11){
			deleteBan(request, response);
		}else if(num==12){
			deleteTea(request, response);
		}else if(num==13){
			deleteCourse(request, response);
		}else if(num==14){
			deleteScore(request, response);
		}else if(num==15){
			addNote(request, response);
		}else if(num==16){
			msglist(request, response);
		}else if(num==17){
			contactStu(request, response);
		}else if(num==18){
			msglist1(request, response);
		}else if(num==19){
			updetecourse(request, response);
		}else if(num==20){
			updeteban(request, response);
		}else if(num==21){
			updeteteacher(request, response);
		}else if(num==22){
			updetecj(request, response);
		}else if(num==23){
			updetestudent(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	//查询所有学生
	protected void chastudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		List<StudentBeen> student=admin.chastudent();
		session.setAttribute("student", student);
		request.getRequestDispatcher("admin/admin_xsxx.jsp").forward(request, response);
	}
	//查询所有老师
	protected void chateacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		List<TeacherBeen> teachers=admin.chateacher();
		request.setAttribute("teachers", teachers);
		request.getRequestDispatcher("/admin/admin_teacher.jsp").forward(request, response);
	}
	//查询所有课程
	protected void chacourse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		List<CourseBeen> course=admin.chacourse();
		request.setAttribute("course", course);
		request.getRequestDispatcher("/admin/admin_Class.jsp").forward(request, response);
	}
	//查询个人信息
	protected void chamy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AdminBeen admin =new AdminBeen();
		UserBeen user=new UserBeen();
		admin.setTell(user.getUserName());
		admin.setTitlepass(user.getUserPass());
		AdminDao adminim =new AdminDaoImpl();
		AdminBeen adminmy=(AdminBeen)adminim.chamy(user);
		session.setAttribute("adminmy", adminmy);
		request.getRequestDispatcher("/admin/admin_xx.jsp").forward(request, response);
	}
	//添加老师成员
	protected void jointeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		System.out.println(request.getParameter("username"));
		String username=request.getParameter("username");
		String usertell=request.getParameter("tell");
		String ban=request.getParameter("ban");
		System.out.println(ban);
		String userday=request.getParameter("birthday");
		TeacherBeen teacherbeen=new TeacherBeen();
		teacherbeen.setTeachername(username); 
		teacherbeen.setBirthday(userday);
		teacherbeen.setTell(usertell);
		teacherbeen.setTeacherclass(ban);
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.jointeacher(teacherbeen);
		if(mmm==1) {
			request.setAttribute("msg", "添加成功！");
			chateacher(request, response);
			request.getRequestDispatcher("admin/admin_teacher.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "添加失败，请重新添加！");
			request.getRequestDispatcher("admin/addTeacher.jsp").forward(request, response);
			
		}
	}
	//添加班级成员
	protected void joinClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String banname=request.getParameter("banname");
		String teachername=request.getParameter("banteachername");
		int cid=Integer.parseInt(request.getParameter("cid"));
		String grade=request.getParameter("grade");
		String major=request.getParameter("major");
		BanBeen ban=new BanBeen(grade,teachername,banname,major,cid);
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.joinClass(ban);
		if(mmm==1) {
			request.setAttribute("msg", "添加成功！");
			chaban(request, response);
			request.getRequestDispatcher("admin/admin_Ban.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/addClass.jsp").forward(request, response);
			
		}
	}
	//添加课程
	protected void joinkec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession();
		String courename=request.getParameter("courename");
		String couretime=request.getParameter("couretime");
		String coureteach=request.getParameter("coureteach");
		CourseBeen course=new CourseBeen(courename,coureteach,couretime,"2020-2-2");
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.joinkec(course);
		if(mmm==1) {
			request.setAttribute("msg", "修改成功！");
			chacourse(request, response);
			request.getRequestDispatcher("admin/admin_Class.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/addCourse.jsp").forward(request, response);
			
		}
	}
	//个人信息修改
	protected void updatePassByself(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String oldpass=request.getParameter("oldpass");
		String newpass=request.getParameter("newpass");
		String rnewpass=request.getParameter("rnewpass");
		System.out.println(oldpass+newpass);
		HttpSession session = request.getSession();
		AdminDao adminim =new AdminDaoImpl();
		UserBeen user = (UserBeen)session.getAttribute("user");
		AdminBeen users = (AdminBeen)adminim.chamy(user);
		
		if(users.getTitlepass().equals(oldpass) && newpass.equals(rnewpass)) {
			users.setTitlepass(newpass);
			int mmm= adminim.updatePassByself(users);
			if(mmm==1) {
				request.setAttribute("msg", "修改成功！");
				request.getRequestDispatcher("success.jsp").forward(request, response);
			}else {
				response.sendRedirect("404.jsp");
			}
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/admin_xgmm.jsp").forward(request, response);
		}
		
	}
	//统计成绩
	protected void chaScoreAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		List<ScoreBeen> score=admin.chaScoreAll();
		request.setAttribute("score", score);
		request.getRequestDispatcher("admin/admin_tjcj.jsp").forward(request, response);
	}
	//查询所有班级
	protected void chaban(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		List<BanBeen> ban=admin.cha();
		request.setAttribute("ban", ban);
		request.getRequestDispatcher("admin/admin_Ban.jsp").forward(request, response);
	}
	//删除选定学生
	protected void deleteStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		int stuid  =Integer.parseInt(request.getParameter("stnumber"));
		StudentBeen stu =new StudentBeen();
		stu.setStnumber(stuid);
		int num = admin.deleteStu(stu);
		if(num==1) {
			List<StudentBeen> student=admin.chastudent();
			session.setAttribute("student", student);
			request.getRequestDispatcher("admin/admin_xsxx.jsp").forward(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	//删除选定班级
	protected void deleteBan(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		int bid  =Integer.parseInt(request.getParameter("bid"));
		BanBeen stu =new BanBeen();
		stu.setCid(bid);
		int num = admin.deleteBan(stu);
		if(num==1) {
			chaban(request, response);
			request.getRequestDispatcher("admin/admin_teacher.jsp").forward(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	//删除选定老师
	protected void deleteTea(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		int tid  =Integer.parseInt(request.getParameter("tid"));
		TeacherBeen stu =new TeacherBeen();
		stu.setStaffid(tid);
		int num = admin.deleteTea(stu);
		if(num==1) {
			chateacher(request, response);
			request.getRequestDispatcher("admin/admin_teacher.jsp").forward(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	//删除选定学生分数
	protected void deleteScore(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		int stuid  =Integer.parseInt(request.getParameter("stnumber"));
		ScoreBeen stu =new ScoreBeen();
		stu.setStnumber(stuid);
		int num = admin.deleteScore(stu);
		if(num==1) {
			chaScoreAll(request, response);
			request.getRequestDispatcher("admin/admin_tjcj.jsp").forward(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	//删除选定课程
	protected void deleteCourse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		AdminDao admin =new AdminDaoImpl();
		String kc  =request.getParameter("kc");
		CourseBeen stu =new CourseBeen();
		stu.setKc(kc);
		int num = admin.deleteCourse(stu);
		if(num==1) {
			chacourse(request, response);
			request.getRequestDispatcher("admin/admin_Class.jsp").forward(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	//发布公告
	protected void addNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String content =request.getParameter("note");
		HttpSession session = request.getSession();
		UserBeen user=(UserBeen)session.getAttribute("user");
		ServletContext application=request.getServletContext();
		AdminDao admin =new AdminDaoImpl();
		NoteBeen stu =new NoteBeen();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String nowTime = sdf.format(Calendar.getInstance().getTime());
		stu.setContent(content);
		stu.setForm(user.getUserName());
		stu.setNtime(nowTime);
		int num = admin.addNote(stu);
		if(num==1) {
			List<NoteBeen> note =admin.Note(); 
			application.setAttribute("note", note);
			request.getRequestDispatcher("other/welcome.jsp").forward(request, response);
		}else {
			response.sendRedirect("404.jsp");
		}
	}
	protected void msglist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		MessgeService ms= new MessgeServiceImpl();
		List<MessgeBeen> list =ms.queryAllByself(user);
		request.setAttribute("msglist", list);
		request.getRequestDispatcher("admin/hf.jsp").forward(request, response);
	}
	
	protected void contactStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message=request.getParameter("message");
		String name=request.getParameter("name");
		System.out.println(name);
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		StudentService ss = new StudentServiceImpl();
		ServletContext application=request.getServletContext();
		MessgeBeen msgBeen = new MessgeBeen();
		msgBeen.setFxr(user.getUserName());
		msgBeen.setSxr(name);
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
			session.setAttribute("msgBeen", msgBeen);
		}
		request.getRequestDispatcher("admin/admin_chat.jsp").forward(request, response);
	}
	
	protected void msglist1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		UserBeen user = (UserBeen)session.getAttribute("user");
		String fxr = request.getParameter("fxr");
		MessgeService ms= new MessgeServiceImpl();
		MessgeBeen msgBeen = new MessgeBeen();
		msgBeen.setFxr(user.getUserName());
		msgBeen.setSxr(fxr);
		List<MessgeBeen> msgList1=null;
		List<MessgeBeen> msgList2=null;
			msgList1=new ArrayList<MessgeBeen>();
			msgList2=new ArrayList<MessgeBeen>();
			msgList1=ms.querymessage(msgBeen,1);
			msgList2=ms.querymessage(msgBeen,2);
			session.setAttribute("msglist1", msgList1);
			session.setAttribute("msglist2", msgList2);
			session.setAttribute("msgBeen", msgBeen);
		request.getRequestDispatcher("admin/admin_chat.jsp").forward(request, response);
	}
	
	protected void updetecourse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String classname=request.getParameter("classname");
		String kcname=request.getParameter("kcname");
		String teachername=request.getParameter("teachername");
		String kctime=request.getParameter("kctime");
		CourseBeen course=new CourseBeen(classname,teachername,kcname,kctime);
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.updatekec(course);
		if(mmm==1) {
			request.setAttribute("msg", "修改成功！");
			request.getRequestDispatcher("admin/admin_Ban.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/admin_Ban.jsp").forward(request, response);
			
		}
	}
	
	protected void updeteban(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cid=Integer.parseInt(request.getParameter("cid"));
		String grade=request.getParameter("grade");
		String classname=request.getParameter("classname");
		String teachername=request.getParameter("teachername");
		String major=request.getParameter("major");
		BanBeen ban=new BanBeen(grade,teachername,classname,major,cid);
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.updateclass(ban);
		if(mmm==1) {
			request.setAttribute("msg", "修改成功！");
			chaban(request, response);
			request.getRequestDispatcher("admin/admin_Ban.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/admin_Ban.jsp").forward(request, response);
			
		}
	}
	
	
	protected void updeteteacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("staffid"));
		int staffid=Integer.parseInt(request.getParameter("staffid"));
		String teachername=request.getParameter("teachername");
		String tell=request.getParameter("tell");
		String birthday=request.getParameter("birthday");
		String teacherpass=request.getParameter("teacherpass");
		String teacherclass=request.getParameter("teacherclass");
		TeacherBeen teacherbeen=new TeacherBeen(staffid,teachername,tell,birthday,teacherpass,teacherclass);
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.updateteacher(teacherbeen);
		if(mmm==1) {
			request.setAttribute("msg", "修改成功！");
			request.getRequestDispatcher("admin/admin_teacher.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/admin_teacher.jsp").forward(request, response);
			
		}
	}
	
	
	protected void updetecj(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stnumber=Integer.parseInt(request.getParameter("stnumber"));
		System.out.println(request.getParameter("sname"));
		String sname=request.getParameter("sname");
		String subjects=request.getParameter("subjects");
		String achievement=request.getParameter("achievement");
		int state=Integer.parseInt(request.getParameter("state"));
		ScoreBeen score=new ScoreBeen(stnumber,sname,subjects,achievement,state);
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.updatecji(score);
		if(mmm==1) {
			request.setAttribute("msg", "修改成功！");
			request.getRequestDispatcher("admin/admin_tjcj.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/admin_tjcj.jsp").forward(request, response);
			
		}
	}
	
	protected void updetestudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stnumber=Integer.parseInt(request.getParameter("stnumber"));
		String studentname=request.getParameter("studentname");
		String sex=request.getParameter("sex");
		String identityId=request.getParameter("identityId");
		String sstatus=request.getParameter("sstatus");
		String sttell=request.getParameter("sttell");
		String parenttell=request.getParameter("parenttell");
		String address=request.getParameter("address");
		String dorm=request.getParameter("dorm");
		String school=request.getParameter("school");
		int cid=Integer.parseInt(request.getParameter("cid"));
		StudentBeen student=new StudentBeen();
		student.setStnumber(stnumber);
		student.setStudentname(studentname);
		student.setSex(sex);
		student.setIdentityId(identityId);
		student.setSstatus(sstatus);
		student.setSttell(sttell);
		student.setParenttell(parenttell);
		student.setAddress(address);
		student.setDorm(dorm);
		student.setSchool(school);
		AdminDao adminim =new AdminDaoImpl();
		int mmm=adminim.updatestudent(student);
		if(mmm==1) {
			request.setAttribute("msg", "修改成功！");
			request.getRequestDispatcher("admin/admin_xsxx.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "修改失败，请重新修改！");
			request.getRequestDispatcher("admin/admin_xsxx.jsp").forward(request, response);
			
		}
	}
	
	
}
