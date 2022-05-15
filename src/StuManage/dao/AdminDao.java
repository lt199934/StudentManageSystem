package StuManage.dao;

import java.util.List;

import StuManage.been.AdminBeen;
import StuManage.been.BanBeen;
import StuManage.been.CourseBeen;
import StuManage.been.NoteBeen;
import StuManage.been.ScoreBeen;
import StuManage.been.StudentBeen;
import StuManage.been.TeacherBeen;
import StuManage.been.UserBeen;

public interface AdminDao {
		//查询学生
		public List<StudentBeen> chastudent();
		//查询班级
		public List<BanBeen> cha();
		//查询教师
		public List<TeacherBeen> chateacher();
		//查询所有课程
		public List<CourseBeen> chacourse();
		//查询个人信息
		public AdminBeen chamy(UserBeen user);
		//添加教师
		public int jointeacher(TeacherBeen teacherbeen);
		//添加班级
		public int joinClass(BanBeen banbeen);
		//添加课程
		public int joinkec(CourseBeen coursebeen);
		//修改密码
		public int updatePassByself(AdminBeen adminbeen);
		//成绩统计
		public List<ScoreBeen> chaScoreAll();
		//删除学生
		public int deleteStu(StudentBeen stuBeen);
		//删除老师
		public int deleteTea(TeacherBeen teachBeen);
		//删除分数
		public int deleteScore(ScoreBeen scoreBeen);
		//删除班级
		public int deleteBan(BanBeen banBeen);
		//删除课程
		public int deleteCourse(CourseBeen stu);
		//发布公告
		public int addNote(NoteBeen noteBeen);
		//查询公告
		public List<NoteBeen> Note();
		
		//修改学生
		public int updatestudent(StudentBeen student);
		//修改班级
		public int updateclass(BanBeen ban);
		//修改老师
		public int updateteacher(TeacherBeen tea);
		//修改课程
		public int updatekec(CourseBeen course);
		//修改成绩
		public int updatecji(ScoreBeen score);
}
