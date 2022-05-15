<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>修改密码</title>
	<link rel="stylesheet" href="">
	<style>
		#addStuForm{
			width: 90%;
			margin: auto; 
		}
	</style>
</head>
<body>
	<h1 style="text-align:center;">修改密码</h1>
	<br>
	<hr>
	当前位置：系统管理><a href="" title="">修改密码 </a>
	<form action="../StudentServlet?num=5" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
	<h1>${msg }</h1>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	请输入旧密码：<input type="password" name="oldpass" placeholder="请输入旧密码">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	请输入新密码：<input type="password" name="newpass" placeholder="请输入新密码">
	<br>
	<br>
	请再次输入新密码：<input type="password" name="rnewpass" placeholder="请输入新密码">
	<br><br>
	<p style="float: left;"><input type="submit" value="确定" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>