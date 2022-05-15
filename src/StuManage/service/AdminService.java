package StuManage.service;

import StuManage.been.AdminBeen;
import StuManage.been.CourseBeen;
import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.TeacherBeen;

public interface AdminService {
	//查询学生
	public StudentBeen chastudent();
	//查询班级
	public int cha(StudentBeen studnetbeen);
	//查询教师
	public TeacherBeen chateacher(TeacherBeen teacherbeen);
	//查询所有课程
	public CourseBeen chacourse(CourseBeen coursebeen);
	//查询个人信息
	public AdminBeen chamy(AdminBeen adminbeen);
	//添加教师
	public int jointeacher(TeacherBeen teacherbeen);
	//添加班级
	public int joinClass(TeacherBeen teacherbeen);
	//添加课程
	public int joinkec(CourseBeen coursebeen);
	//修改密码
	public int updatePassByself(AdminBeen adminbeen);
	//成绩统计
	public ScoreBeen chaScoreAll(ScoreBeen sorebeen);
	//删除学生
	public int deleteStu(StudentBeen stuBeen);
}
