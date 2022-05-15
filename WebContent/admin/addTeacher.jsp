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
	<h1 style="text-align:center;">添加教师信息</h1>
	<br>
	<hr>
	当前位置：教师管理><a href="" title="">添加教师</a>
	<form action="../Adminservlet?num=4" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓名：<input type="text" name="username" placeholder="请输入教师姓名">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生日：<input type="text" name="birthday" placeholder="请输入教师生日">
	<br>
	<br>
	所管班级：<select name="ban" id="">
        <option checked="checked" value="软件1班">软件1班</option>
        <option value="软件2班">软件2班</option>
        <option value="电商1班">电商1班</option>
        <option value="电商2班">电商2班</option>
    </select>
    <br><br>
    电话号码：<input type="text" name="tell" placeholder="请输入教师电话号码">
	<br><br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="添加" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>