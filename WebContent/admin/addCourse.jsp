<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>添加课程</title>
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
	<form action="../Adminservlet?num=6" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	课程名称：<input type="text" name="courename" placeholder="请输入课程名称">
	<br>
	<br>
	上课班级：<input type="text" name="couretime" placeholder="请输入上课班级">
	<br>
	<br>
	任课老师：<input type="text" name="coureteach" placeholder="请输入任课老师">
	<br><br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="添加" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>