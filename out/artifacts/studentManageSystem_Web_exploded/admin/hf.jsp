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
		*{
			margin:0;
			padding:0;
		}
		#addStuForm{
			width: 90%;
			margin: auto;
		}
		a{
		color:red;
		text-decoration: none;
		}
		a:hover{
			text-decoration: underline;
		}
		ul{
		margin:0px;
		}
		li{
			margin-top: 5px;
		}
	</style>
</head>
<body>
	<h1 style="text-align:center;">回复学生信息页面</h1>
	<br>
	<br><br>
	<hr>
	当前位置：教师管理><a href="" title="">查看信息</a>
	<br><br>
	<ul>
	<c:forEach items="${msglist }" var="msg">
		<li style="width:100%;height:50px;background-color: #426374;color:red;font-size: 28px;list-style: none;">发信人：<a href="Adminservlet?num=18&fxr=${msg.fxr }" >${msg.fxr }</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span><c:if test="${msg.state==0 }">未读</c:if><c:if test="${msg.state==1 }">已读</c:if></span>  <span style="float: right;color:#fff;">时间：${msg.mtime }</span></li>
	</c:forEach>
	</ul>
	
	
</body>
</html>