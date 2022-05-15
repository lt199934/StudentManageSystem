package StuManage.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import StuManage.been.UserBeen;
import StuManage.dao.BaseDao;
import StuManage.dao.LoginDao;

public class LoginDaoImpl implements LoginDao {

	@Override
	public UserBeen login(UserBeen user) {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		UserBeen newuser = new UserBeen();
		try {
			con =BaseDao.getcon();
			if(user.getType()==1) {//管理员
				sql="select * from title where tell='"+user.getUserName()+"' and titlepass ='"+user.getUserPass()+"'";
			}else if(user.getType()==2) {//教师
				sql="select * from teacher where tell='"+user.getUserName()+"' and teacherpass ='"+user.getUserPass()+"'";
			}else if(user.getType()==3) {//学生
				sql="select * from student where sttell ='"+user.getUserName()+"' and studentpass='"+user.getUserPass()+"'";
			}
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				if(user.getType()==1) {
					newuser.setUserName(r.getString("titlename"));
				}else if(user.getType()==2) {
					newuser.setUserName(r.getString("teachername"));
				}else if(user.getType()==3) {
					newuser.setUserName(r.getString("studentname"));
				}
				
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return newuser;
	}
}
