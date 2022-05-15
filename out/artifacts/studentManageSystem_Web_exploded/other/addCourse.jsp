<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>添加学生</title>
	<link rel="stylesheet" href="">
	<style>
		#addStuForm{
			width: 90%;
			margin: auto; 
		}
	</style>
</head>
<body>
	<h1 style="text-align:center;">添加课程信息</h1>
	<br>
	<hr>
	当前位置：课程管理><a href="" title="">添加课程</a>
	<form action="" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
	班级编号：<input type="text" name="tid" placeholder="请输入课程代码编号">
	<br>
	<br>
	课程名称：<input type="text" name="username" placeholder="请输入课程名称">
	<br><br>
	<p style="float: left;"><input type="submit" value="添加" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>