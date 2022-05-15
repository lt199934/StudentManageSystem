package StuManage.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import StuManage.been.AdminBeen;
import StuManage.been.BanBeen;
import StuManage.been.CourseBeen;
import StuManage.been.NoteBeen;
import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.TeacherBeen;
import StuManage.been.UserBeen;
import StuManage.dao.AdminDao;
import StuManage.dao.BaseDao;

public class AdminDaoImpl implements AdminDao {

	private static final Statement Basedao = null;

	@Override
	public List<StudentBeen> chastudent(){
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<StudentBeen> list=new ArrayList<StudentBeen>();
		try {
			con =BaseDao.getcon();
			sql="select a.*,b.* from student a,class b where b.cid=a.cid order by stnumber asc";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				StudentBeen stuBeen = new StudentBeen();
				stuBeen.setStnumber(r.getInt("stnumber"));
				stuBeen.setStudentname(r.getString("studentname"));
				stuBeen.setSex(r.getString("sex"));
				stuBeen.setIdentityId(r.getString("identityId") );
				stuBeen.setSstatus(r.getString("sstatus"));
				stuBeen.setSttell(r.getString("sttell"));
				stuBeen.setParenttell(r.getString("parenttell"));
				stuBeen.setAddress(r.getString("address"));
				stuBeen.setStyState(r.getInt("styState"));
				stuBeen.setPunishment(r.getString("punishment"));
				stuBeen.setDorm(r.getString("dorm"));
				stuBeen.setSchool(r.getString("school"));
				stuBeen.setStudentpass(r.getString("studentpass"));
				stuBeen.setCid(r.getInt("cid"));
				stuBeen.setStuClass(r.getString("class"));
				list.add(stuBeen);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return list;
	}

	@Override
	public List<BanBeen> cha() {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<BanBeen> list=new ArrayList<BanBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from class ";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				BanBeen ban = new BanBeen();
				ban.setGrade(r.getString("grade"));
				ban.setInstructor(r.getString("instructor"));
				ban.setBj(r.getString("class"));
				ban.setMajor(r.getString("major"));
				ban.setCid(r.getInt("cid"));
				list.add(ban);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return list;
	}

	@Override
	public List<TeacherBeen> chateacher() {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<TeacherBeen> list=new ArrayList<TeacherBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from teacher ";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				TeacherBeen teabeen = new TeacherBeen();
				teabeen.setStaffid(r.getInt("staffid"));
				teabeen.setTeachername(r.getString("teachername"));
				teabeen.setTell(r.getString("tell"));
				teabeen.setBirthday(r.getString("birthday"));
				teabeen.setTeacherpass(r.getString("teacherpass"));
				teabeen.setTeacherclass(r.getString("teacherclass"));
				list.add(teabeen);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return list;
	}

	@Override
	public List<CourseBeen> chacourse() {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<CourseBeen> list=new ArrayList<CourseBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from curriculum ";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				CourseBeen course = new CourseBeen();
				course.setClassname(r.getString("class"));
				course.setKc(r.getString("curriculum"));
				course.setTeacher(r.getString("teacher"));
				
				course.setCtime(r.getString("ctime"));
				list.add(course);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return list;
	}

	@Override
	public AdminBeen chamy(UserBeen user) {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		AdminBeen admin =new AdminBeen();
		try {
			con =BaseDao.getcon();
			sql="selcet * from title ";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				admin.setStaffid(r.getInt("staffid"));
				admin.setTitlename(r.getString("titlename"));
				admin.setTell(r.getString("tell"));
				admin.setBirthday(r.getString("birthday"));
				admin.setTitlepass(r.getString("titlepass"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return admin;
	}

	@Override
	public int jointeacher(TeacherBeen teacherbeen) {
		// TODO Auto-generated method stub
		String sql = "insert into teacher(teachername,tell,birthday,teacherpass,teacherclass)values(?,?,?,'654321',?)";
		System.out.println(sql);
		Object[] obj= {teacherbeen.getTeachername(),teacherbeen.getTell(),teacherbeen.getBirthday(),teacherbeen.getTeacherclass()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int joinClass(BanBeen banbeen) {
		// TODO Auto-generated method stub
		String sql = "insert into class(major,grade,,instructor,class)"+
		           "value(?,?,?,?)";
		System.out.println(sql);
		Object[] obj= {banbeen.getMajor(),banbeen.getGrade(),banbeen.getInstructor(),banbeen.getBj()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int joinkec(CourseBeen coursebeen) {
		// TODO Auto-generated method stub
		String sql = "insert into curriculum(class,curriculum,teacher,ctime)"+
		           "value(?,?,?,?)";
		System.out.println(sql);
		Object[] obj = {coursebeen.getClassname(),coursebeen.getKc(),coursebeen.getTeacher(),coursebeen.getCtime()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int updatePassByself(AdminBeen adminbeen) {
		// TODO Auto-generated method stub
		String sql="update title set titlepass=? where titlename =?";
		Object[] obj= {adminbeen.getTitlepass(),adminbeen.getTitlename()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public List<ScoreBeen> chaScoreAll() {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<ScoreBeen> list=new ArrayList<ScoreBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from achievement ";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				ScoreBeen Score =new ScoreBeen();
				Score.setStnumber(r.getInt("Stnumber"));
				Score.setSname(r.getString("sname"));
				Score.setSubjects(r.getString("subjects"));
				Score.setAchievement(r.getString("achievement"));
				Score.setState(r.getInt("state"));
				list.add(Score);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return list;
	}

	@Override
	public int deleteStu(StudentBeen stuBeen) {
		// TODO Auto-generated method stub
		String sql = "delete from student where stnumber=?";
		System.out.println(sql);
		Object[] obj= {stuBeen.getStnumber()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int deleteTea(TeacherBeen stuBeen) {
		// TODO Auto-generated method stub
		String sql = "delete from teacher where staffid=?";
		System.out.println(sql);
		Object[] obj= {stuBeen.getStaffid()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int deleteScore(ScoreBeen stuBeen) {
		// TODO Auto-generated method stub
		String sql = "delete from achievement where Stnumber=?";
		System.out.println(sql);
		Object[] obj= {stuBeen.getStnumber()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int deleteBan(BanBeen stuBeen) {
		// TODO Auto-generated method stub
		String sql = "delete from class where cid=?";
		System.out.println(sql);
		Object[] obj= {stuBeen.getCid()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int deleteCourse(CourseBeen courseBeen) {
		// TODO Auto-generated method stub
		String sql = "delete from curriculum where curriculum=?";
		System.out.println(sql);
		Object[] obj= {courseBeen.getKc()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int addNote(NoteBeen noteBeen) {
		// TODO Auto-generated method stub
		String sql = "insert into Notice(content,form,Ntime,state)values(?,?,?,1);";
		System.out.println(sql);
		Object[] obj = {noteBeen.getContent(),noteBeen.getForm(),noteBeen.getNtime()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public List<NoteBeen> Note() {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<NoteBeen> list=new ArrayList<NoteBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from Notice order by ntime desc ";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				NoteBeen n =new NoteBeen();
				n.setNid(r.getInt("nid"));
				n.setContent(r.getString("content"));
				n.setForm(r.getString("form"));
				n.setNtime(r.getString("ntime"));
				list.add(n);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return list;
	}

	@Override
	public int updatestudent(StudentBeen student) {
		// TODO Auto-generated method stub
		String sql="update student set studentname=?,sex=?,sstatus=?,sttell=?,parenttell=?,address=? where stnumber=?";
		Object[] obj= {student.getStudentname(),student.getSex(),student.getSstatus(),student.getSttell(),student.getParenttell(),student.getAddress(),student.getStnumber()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int updateclass(BanBeen ban) {
		// TODO Auto-generated method stub
		String sql="update class set major=?,grade=?,instructor=?,class=? where cid=?";
		Object[] obj= {ban.getMajor(),ban.getGrade(),ban.getInstructor(),ban.getBj(),ban.getCid()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int updateteacher(TeacherBeen tea) {
		// TODO Auto-generated method stub
		String sql="update teacher set teachername=?,tell=?,birthday=?,teacherpass=?,teacherclass=?,cid=? where staffid=?";
		Object[] obj= {tea.getTeachername(),tea.getTell(),tea.getBirthday(),tea.getTeacherpass(),tea.getTeacherclass(),tea.getCid()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int updatekec(CourseBeen course) {
		// TODO Auto-generated method stub
		String sql="update curriculum set class=?,curriculum=?,ctime=?  where teacher=?";
		Object[] obj= {course.getClassname(),course.getKc(),course.getCtime(),course.getTeacher()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int updatecji(ScoreBeen score) {
		// TODO Auto-generated method stub
		String sql="update achievement set achievement=?,state=?  where sname=? and subjects=?";
		Object[] obj= {score.getAchievement(),score.getState(),score.getSname(),score.getSubjects()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}
}
