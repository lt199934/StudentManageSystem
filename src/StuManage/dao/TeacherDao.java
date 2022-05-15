package StuManage.dao;

//import java.awt.List;
import java.util.List;

import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.TeacherBeen;
import StuManage.been.CourseBeen;

public interface TeacherDao {
	public TeacherBeen  queryByname(TeacherBeen ter);//通过登录进入的用户名去查询自身的所有信息；
	public List<StudentBeen>  queryByclass(TeacherBeen ter);//通过老师所管理的班级查询学生信息，并返回一个学生信息的集合；
	public int inster(StudentBeen stu);//添加学生；
	public List<CourseBeen> querycur(TeacherBeen ter);//查询本班的课程；
	public List<ScoreBeen> queryAch(TeacherBeen ter,CourseBeen cur);//查询班级的成绩；
	public int insterAch(TeacherBeen ter,CourseBeen cur);//添加成绩；
	public int updatePass(TeacherBeen ter);//修改密码；
}
