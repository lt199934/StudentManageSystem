<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../session.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>教师index页面</title>
	<link rel="stylesheet" href="../css/login.css">
	<style>
		.top h1{
			width: 100%;
			height: 10%;
			line-height: 80px;
			/*margin-top: 20px;*/
		}
	</style>
</head>
<body>
	<div class="login">
		<div class="top"><h1><a href="/studentManageSystem/teacher/index.jsp"><img src="../img/logo.png"></a></h1><h2>校园管理系统</h2> <br><br><span style="float:right; padding-right:20px;" class="head"><span style="color:red; font-weight:bold;">教师：${sessionScope.user.userName }&nbsp;</span>您好&nbsp;&nbsp;&nbsp;<a href="../LoginServlet?temp=logout" id="loginOut">安全退出</a></span>
</div>
		<div class="center">
		<!--导航菜单 -->
			<div class="menu">
				 <ul>
				 	<li><span class="parent">学生管理</span>
				 		<ul class="child">
				 			<li><a href="../other/addStudent.jsp" target="student_menu">添加学生</a></li>
				 			<li><a href="teacher_chaxun.jsp" target="student_menu">查询所有学生</a></li>
				 		</ul>
				 	</li>

				 	<li><span class="parent">教师管理</span>
						<ul class="child">
				 			<li><a href="../other/addTeacher.jsp" target="student_menu">添加教师</a></li>
				 			<li><a href="teacher_teacherList.jsp" target="student_menu">查询教师</a></li>
				 		</ul>
				 	</li>
				 	<li><span class="parent">班级管理</span>
						<ul class="child">
				 			<li><a href="../other/addCourse.jsp" target="student_menu">添加班级课程</a></li>
				 			<li><a href="teacher_course.jsp" target="student_menu">班级课程表</a></li>
				 		</ul>
				 	</li>

				 	<li><span class="parent">成绩管理</span>
						<ul class="child">
				 			<li><a href="teacher_djcj.jsp" target="student_menu">成绩登记</a></li>
				 			<li><a href="teacher_cxcj.jsp" target="student_menu">查询成绩</a></li>
				 		</ul>
				 	</li>
				 	<li><span class="parent">系统管理</span>
						<ul class="child">
				 			<li><a href="teacher_xx.jsp" target="student_menu">个人信息</a></li>
				 			<li><a href="teacher_xgmm.jsp" target="student_menu">修改密码</a></li>
				 			<li><a href="../LoginServlet?temp=logout" >退出系统</a></li>
				 		</ul>
				 	</li>
				 </ul>
			</div>

			<div class="student_menu">
				<iframe src="../other/welcome.jsp"  name="student_menu" frameborder="1" width="100%" height="100%"></iframe>
			</div>
		</div>
		<div class="foot">
			Copyright &copy; System By 刘涛&amp;杨开
		</div>
	</div>
</body>
<script src="../lib/jquery-3.4.1.min.js"></script>
<script>
	$(function(){
		$(".menu ul li").mouseenter(function(){
				$(this).find(".child li").stop(true).slideDown(1000);
		});

		$(".menu ul li").mouseleave(function(){
				$(this).find(".child li").stop(true).slideUp(1000);

			
		});
	});
</script>
</html>