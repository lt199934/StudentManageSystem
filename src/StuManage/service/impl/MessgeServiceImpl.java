package StuManage.service.impl;

import java.util.List;

import StuManage.been.MessgeBeen;
import StuManage.been.UserBeen;
import StuManage.dao.MessgeDao;
import StuManage.dao.impl.MessgeDaoImpl;
import StuManage.service.MessgeService;

public class MessgeServiceImpl implements MessgeService {
	MessgeDao md = new MessgeDaoImpl();
	@Override
	public int message(MessgeBeen msg) {
		// TODO Auto-generated method stub
		int num =md.message(msg);
		return num;
	}
	@Override
	public List<MessgeBeen> querymessage(MessgeBeen msg,int num) {
		// TODO Auto-generated method stub
		List<MessgeBeen> list =md.querymessage(msg,num);
		return list;
	}
	@Override
	public List<MessgeBeen> queryAllByself(UserBeen user) {
		// TODO Auto-generated method stub
		List<MessgeBeen> list =md.queryAllByself(user);
		return list;
	}
	@Override
	public List<MessgeBeen> querymessage() {
		// TODO Auto-generated method stub
		List<MessgeBeen> list =md.querymessage();
		return list;
	}

}
