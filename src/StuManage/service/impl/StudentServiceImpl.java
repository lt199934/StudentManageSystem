package StuManage.service.impl;

import java.util.List;

import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.UserBeen;
import StuManage.dao.StudentDao;
import StuManage.dao.impl.StudentDaoImpl;
import StuManage.service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDao sd = new StudentDaoImpl();
	@Override
	public StudentBeen queryBySelf(UserBeen user) {
		// TODO Auto-generated method stub
		StudentBeen stuBeen=sd.queryBySelf(user);
		return stuBeen;
	}
	@Override
	public int updateInfoByself(StudentBeen stuBeen) {
		// TODO Auto-generated method stub
		int num = sd.updateInfoByself(stuBeen);
		return num;
	}
	@Override
	public int updatePassByself(StudentBeen stuBeen) {
		// TODO Auto-generated method stub
		int num = sd.updatePassByself(stuBeen);
		return num;
	}
	@Override
	public List<ScoreBeen> queryScoreBySelf(StudentBeen stu) {
		// TODO Auto-generated method stub
		List<ScoreBeen> list =sd.queryScoreBySelf(stu);
		return list;
	}
	@Override
	public String queryTname(UserBeen user) {
		// TODO Auto-generated method stub
		String name=sd.queryTname(user);
		return name;
	}

}
