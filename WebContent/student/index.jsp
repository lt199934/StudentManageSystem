<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../session.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>学生index页面</title>
	<link rel="stylesheet" href="../css/login.css">
	<style>
		.top h1{
			width: 100%;
			height: 10%;
			line-height: 80px;
		}
	</style>
</head>
<body>
	<div class="login">
		<div class="top"><h1><a href="/studentManageSystem/student/index.jsp"><img src="../img/logo.png"></a></h1><h2>校园管理系统</h2> <br><br><span style="float:right; padding-right:20px;" class="head"><span style="color:red; font-weight:bold;">学生：${user.userName }&nbsp;</span>您好&nbsp;&nbsp;&nbsp;<a href="../LoginServlet?temp=logout">安全退出</a></span>
</div>
		<div class="center">
		<!--导航菜单 -->
			<div class="menu">
				 <ul>
				 	<li><span class="parent">学生管理</span>
				 		<ul class="child">
				 			<li><a href="../StudentServlet?studentname=${sessionScope.user.userName }&num=0" target="student_menu">查看个人信息</a></li>
				 			<li><a href="../StudentServlet?num=7&sxr=赵铁柱" target="student_menu">联系管理员</a></li>
				 		</ul>
				 	</li>
				 	<li><span class="parent">成绩管理</span>
						<ul class="child">
							<li><a href="../StudentServlet?num=1" target="student_menu">查询成绩</a></li>
				 		</ul>
				 	</li>
				 	<li><span class="parent">系统管理</span>
						<ul class="child">
							<li><a href="../StudentServlet?num=3" target="student_menu">修改个人信息</a></li>
							<li><a href="student_xgmm.jsp" target="student_menu">修改密码</a></li>
							<li><a href="../LoginServlet?temp=logout">退出系统</a></li>
				 		</ul>
				 	</li>
				 </ul>
			</div>
			<!--iframe引用-->
			<div class="student_menu">
				<iframe src="../other/welcome.jsp"  name="student_menu" frameborder="1" width="100%" height="100%"></iframe>
			</div>
		</div>
		<div class="foot">
			Copyright &copy; System By 刘涛
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