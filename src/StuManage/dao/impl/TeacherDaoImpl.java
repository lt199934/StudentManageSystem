package StuManage.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import java.sql.PreparedStatement;

import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.TeacherBeen;
import StuManage.been.CourseBeen;
import StuManage.dao.BaseDao;
import StuManage.dao.TeacherDao;

public class TeacherDaoImpl implements TeacherDao {

	@Override
	public TeacherBeen queryByname(TeacherBeen ter) {
		// TODO Auto-generated method stub
		TeacherBeen newter = new TeacherBeen();
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		try {
			con =BaseDao.getcon();
			String sql="select * from teacher where teachername='"+ter.getTeachername()+"'";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				newter.setStaffid(r.getInt("staffid"));
				newter.setTeachername(r.getString("teachername"));
				newter.setTell(r.getString("tell"));
				newter.setBirthday(r.getString("birthday"));
				newter.setTeacherpass(r.getString("teacherpass"));
				newter.setTeacherclass(r.getString("teacherclass"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return newter;
	}

	private int parseInt(long long1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<StudentBeen> queryByclass(TeacherBeen ter) {
		// TODO Auto-generated method stub
		List<StudentBeen> stuList = new ArrayList<StudentBeen>();
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		try {
			con =BaseDao.getcon();
			sql="SELECT * from student where cid="+ter.getCid();
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
				stuList.add(stuBeen);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return stuList;
	}

	@Override
	public int inster(StudentBeen stu) {
		// TODO Auto-generated method stub
		String sql="insert into student(dorm,studentname,sex,identityId,sstatus,sttell,parenttell,address,school,cid)values('2-430',?,?,?,?,?,?,?,?,?);";
		Object[] pram={stu.getStudentname(),stu.getSex(),stu.getIdentityId(),stu.getSstatus(),stu.getSttell(),stu.getParenttell(),stu.getAddress(),stu.getSchool(),stu.getCid()};
		int num= BaseDao.excute(sql,pram);
		return num;
	}

	@Override
	public List<CourseBeen> querycur(TeacherBeen ter) {
		// TODO Auto-generated method stub
		List<CourseBeen> stuList = new ArrayList<CourseBeen>();
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		try {
			con =BaseDao.getcon();
			String sql="SELECT name,sex,identityId,status FROM USERS";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			while(r.next()){
				CourseBeen stu = new CourseBeen();
				stuList.add(stu);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return stuList;
	}

	@Override
	public List<ScoreBeen> queryAch(TeacherBeen ter, CourseBeen cur) {
		// TODO Auto-generated method stub
		List<ScoreBeen> achList = new ArrayList<ScoreBeen>();
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		try {
			con =BaseDao.getcon();
			String sql="SELECT name,sex,identityId,status FROM USERS";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			while(r.next()){
				ScoreBeen ach = new ScoreBeen();
				ach.setSubjects(r.getString("subjects"));
				ach.setAchievement(r.getString("achievement"));
				ach.setState(r.getInt("state"));
				achList.add(ach);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return achList;
	}

	@Override
	public int insterAch(TeacherBeen ter, CourseBeen cur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePass(TeacherBeen ter) {
		// TODO Auto-generated method stub
		String sql="update teacher set teacherpass=? where staffid=?";
		Object[] obj= {ter.getTeacherpass(),ter.getStaffid()};
		System.out.println(sql);
		int num =BaseDao.excute(sql, obj);
		
		return num;
	}

}
