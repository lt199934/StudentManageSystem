package StuManage.service;

import StuManage.been.UserBeen;
import StuManage.dao.LoginDao;
import StuManage.dao.impl.LoginDaoImpl;

public class LoginServiceImpl implements LoginDao {
	LoginDao ld = new LoginDaoImpl();
	@Override
	public UserBeen login(UserBeen user) {
		// TODO Auto-generated method stub
		UserBeen userBeen =ld.login(user);
		return userBeen;
	}

}
