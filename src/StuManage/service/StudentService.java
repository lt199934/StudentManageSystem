package StuManage.service;

import java.util.List;

import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.UserBeen;

public interface StudentService {
	//查看个人信息
	public StudentBeen queryBySelf(UserBeen user);
	//修改个人信息
	public int updateInfoByself(StudentBeen stuBeen);
	//修改密码
	public int updatePassByself(StudentBeen stuBeen);
	//查询个人分数
	public List<ScoreBeen> queryScoreBySelf(StudentBeen stu);
	//联系老师
	public String queryTname(UserBeen user);
}
