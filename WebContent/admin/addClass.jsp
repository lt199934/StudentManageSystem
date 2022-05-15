<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>添加班级</title>
	<link rel="stylesheet" href="">
	<style>
		#addStuForm{
			width: 90%;
			margin: auto; 
		}
	</style>
</head>
<body>
	<h1 style="text-align:center;">添加班级信息页面</h1>
	<br>
	<hr>
	当前位置：班级管理><a href="" title="">添加班级</a>
	<form action="../Adminservlet?num=5" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
		  专业：<input type="text" name="major" placeholder="请输入班级专业"><br><br>
		  年级：<input type="text" name="grade" placeholder="请输入年级"><br><br>
	      班级：<input type="text" name="banname" placeholder="请输入班级名称"><br><br>
        班主任：<input type="text" name="banteachername" placeholder="请输入班主任姓名">
	<br><br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="添加" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>