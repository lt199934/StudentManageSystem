package StuManage.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import StuManage.been.MessgeBeen;
import StuManage.been.ScoreBeen;
import StuManage.been.UserBeen;
import StuManage.dao.BaseDao;
import StuManage.dao.MessgeDao;

public class MessgeDaoImpl implements MessgeDao {

	@Override
	public int message(MessgeBeen msg) {
		// TODO Auto-generated method stub
		String sql="insert into masage(masage,fsr,sxr,mtime,state) values(?,?,?,?,?)";
		Object[] obj= {msg.getMasage(),msg.getFxr(),msg.getSxr(),msg.getMtime(),msg.getState()};
		int num =BaseDao.excute(sql, obj);
		return num;
	}

	@Override
	public List<MessgeBeen> querymessage(MessgeBeen msg,int num) {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<MessgeBeen> msgList = new ArrayList<MessgeBeen>();
		try {
			con =BaseDao.getcon();
			if(num==1) {
				sql="select * from masage where fsr='"+msg.getFxr()+"'and sxr='"+msg.getSxr()+"'";
			}else {
				sql="select * from masage where fsr='"+msg.getSxr()+"'and sxr='"+msg.getFxr()+"'";
			}
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				MessgeBeen msgBeen = new MessgeBeen();
				msgBeen.setMasage(r.getString("masage"));
				msgBeen.setFxr(r.getString("fsr"));
				msgBeen.setSxr(r.getString("sxr"));
				msgBeen.setMtime(r.getString("mtime"));
				msgBeen.setState(r.getInt("state"));
				msgList.add(msgBeen);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return msgList;
	}

	@Override
	public List<MessgeBeen> queryAllByself(UserBeen user) {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<MessgeBeen> msgList = new ArrayList<MessgeBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from masage  where sxr='"+user.getUserName()+"' group by fsr";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				MessgeBeen msgBeen = new MessgeBeen();
				msgBeen.setMasage(r.getString("masage"));
				msgBeen.setFxr(r.getString("fsr"));
				msgBeen.setSxr(r.getString("sxr"));
				msgBeen.setMtime(r.getString("mtime"));
				msgBeen.setState(r.getInt("state"));
				msgList.add(msgBeen);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return msgList;
	}

	@Override
	public List<MessgeBeen> querymessage() {
		// TODO Auto-generated method stub
		String sql=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet r=null;
		List<MessgeBeen> msgList = new ArrayList<MessgeBeen>();
		try {
			con =BaseDao.getcon();
			sql="select * from masage ";
			ps =con.prepareStatement(sql);
			r=ps.executeQuery();
			System.out.println(sql);
			while(r.next()){
				MessgeBeen msgBeen = new MessgeBeen();
				msgBeen.setMasage(r.getString("masage"));
				msgBeen.setFxr(r.getString("fsr"));
				msgBeen.setSxr(r.getString("sxr"));
				msgBeen.setMtime(r.getString("mtime"));
				msgBeen.setState(r.getInt("state"));
				msgList.add(msgBeen);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(con, ps, r);
		}
		return msgList;
	}

}
