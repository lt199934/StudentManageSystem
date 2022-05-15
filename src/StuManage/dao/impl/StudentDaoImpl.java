package StuManage.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.UserBeen;
import StuManage.dao.BaseDao;
import StuManage.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
	//查询学生个人信息
	@Override
	public StudentBeen queryBySelf(UserBeen user) {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		StudentBeen stuBeen = new StudentBeen();
		try {
			con =BaseDao.getcon();
			sql="select a.*,b.* from student a,class b where b.cid=a.cid and  a.studentname ='"+user.getUserName()+"'";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
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
				stuBeen.setStuClass(r.getString("grade"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return stuBeen;
	}

	@Override
	public String queryTname(UserBeen user) {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		String name=null;
		try {
			con =BaseDao.getcon();
			sql="select a.*,b.* from student a,class b where b.cid=a.cid and  a.studentname ='"+user.getUserName()+"'";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				name=r.getString("instructor");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return name;
	}
	//修改个人信息
	@Override
	public int updateInfoByself(StudentBeen stuBeen) {
		// TODO Auto-generated method stub
		String sql="update student set studentname=?,sex=?,sstatus=?,sttell=?,parenttell=?,address=? where stnumber=?";
		Object[] obj= {stuBeen.getStudentname(),stuBeen.getSex(),stuBeen.getSstatus(),stuBeen.getSttell(),stuBeen.getParenttell(),stuBeen.getAddress(),stuBeen.getStnumber()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public int updatePassByself(StudentBeen stuBeen) {
		// TODO Auto-generated method stub
		String sql="update student set studentpass=? where stnumber=?";
		Object[] obj= {stuBeen.getStudentpass(),stuBeen.getStnumber()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}
	//查询个人分数
	@Override
	public List<ScoreBeen> queryScoreBySelf(StudentBeen stu) {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<ScoreBeen> scoreList = new ArrayList<ScoreBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from achievement where stnumber ='"+stu.getStnumber()+"'";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				ScoreBeen scoreBeen = new ScoreBeen();
				scoreBeen.setSubjects(r.getString("subjects"));
				scoreBeen.setAchievement(r.getString("achievement"));
				scoreBeen.setState(r.getInt("state"));
				scoreList.add(scoreBeen);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return scoreList;
	}

}
