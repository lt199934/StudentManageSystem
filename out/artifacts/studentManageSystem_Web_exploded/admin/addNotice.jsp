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
	<h1 style="text-align:center;">发布公告页面</h1>
	<br>
	<hr>
	当前位置：班级管理><a href="" title="">发布公告</a>
	<form action="../Adminservlet?num=15" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;公告内容：
	<textarea cols="120" rows="14" name="note"></textarea>
	<br>
	<br>
	<br><br>
	<p style="margin:auto;text-align: center;"><input type="submit" style="width:130px;height: 40px;background-color: #426374;color:white"  value="发布" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:130px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>