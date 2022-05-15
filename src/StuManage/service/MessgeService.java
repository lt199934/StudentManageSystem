package StuManage.service;

import java.util.List;

import StuManage.been.MessgeBeen;
import StuManage.been.UserBeen;

public interface MessgeService {
	//添加
	public int message(MessgeBeen msg);
	//查询
	public List<MessgeBeen> querymessage(MessgeBeen msg,int num);
	//查询未读信息
	public List<MessgeBeen> queryAllByself(UserBeen user);
	public List<MessgeBeen> querymessage();
}
