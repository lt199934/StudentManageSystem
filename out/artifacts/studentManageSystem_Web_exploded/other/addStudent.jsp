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
	<h1 style="text-align:center;">添加学生</h1>
	<br>
	<hr>
	当前位置：课程管理><a href="" title="">添加课程</a>
	<form action="../TeacherServlet?num=0" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
		姓名：<input type="text" name="username" placeholder="请输入学生姓名">
		<br>
		<br>
		性别：<input type="radio" name="sex">男 <input type="radio" name="sex">女
		<br>
		<br>
		身份证：<input type="text" name="identityId" placeholder="请输入身份证">
		<br>
		<br>
		学籍：<input type="text" name="sstatus" placeholder="请输入教师姓名">
		<br>
		<br>
		电话：<input type="text" name="sttell" placeholder="请输入电话">
		<br>
		<br>
		家长电话：<input type="text" name="parenttell" placeholder="请输入父母电话">
		<br>
		<br>
		家庭地址：<input type="text" name="address" placeholder="请输入家庭地址">
		<br>
		<br>
		学生状态：<input type="text" name="styState" placeholder="0表示休学，1为正常">
		<br>
		<br>
		是否住校：<input type="text" name="school" placeholder="请输入宿舍门牌号">
		<br>
		<br>
		宿舍：<input type="text" name="dorm" placeholder="请输入宿舍门牌号">
		<br>
		<br>
		学生登录密码：<input type="text" name="studentpass" placeholder="请输入登录密码">
		<br>
		<br>
	<p style="float: left;"><input type="submit" value="添加" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>