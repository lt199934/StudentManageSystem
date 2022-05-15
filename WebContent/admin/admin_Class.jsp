<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>课程表</title>
	<link rel="stylesheet" href="">
	<style>
        table{
            width: 100%;
            border-width: 1px;
            border-style: solid;
            text-align: center;
            border-collapse: collapse;
        }
        table td{
            border-width: 1px;
            border-style: solid;
            text-align: center;
        }
         table th{
             background-color: aqua;
        }
         form{
			display: none;
        }
	</style>
</head>
<body>
<h1 style="text-align:center;">查询班级课程页面</h1>
    <br>
    <hr>
当前位置：教师管理><a href="" title="">查询班级课程</a>
<h1>${msg }</h1>
<form action="Adminservlet?num=19" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;班级：<input type="text" name="classname" id="classname" placeholder="请输入班级名称">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程名：<input type="text" name="kcname" id="kcname" placeholder="请输入课程名">
	<br>
	<br>
    &nbsp;&nbsp;班主任：<input type="text" name="teachername" id="teachername" placeholder="请输入班主任姓名">
	<br><br>
    &nbsp;&nbsp;上课时间：<input type="text" name="kctime" id="kctime" placeholder="请输入上课时间">
	<br><br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="修改" onclick="block()" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
<br> <br> <br>
    <br> <br>
	<table>
		<tr>
			<th>班级</th>
			<th>课程名</th>
			<th>任课老师</th>
			<th>时间</th>
			<th>操作</th>
		</tr>
        <c:forEach items="${course}" var="course">
			<tr>
				<td>${course.classname}</td>
				<td>${course.kc}</td>
				<td>${course.teacher}</td>
				<td>${course.ctime}</td>
				<td><a href="JavaScript:show('${course.classname}','${course.kc}','${course.teacher}','${course.ctime}')">修改</a> | <a href="Adminservlet?num=13&kc=${course.kc}">删除</a></td>
			</tr>
		</c:forEach>
    </table>
</body>
<script type="text/javascript">
	function $(n){
	 		return document.getElementById(n);
	 	}
	function show(classname,kc,teacher,ctime){
		$("classname").value=classname;
		$("kcname").value=kc;
		$("teachername").value=teacher;
		$("kctime").value=ctime;
		$("addStuForm").style.display="block";
	}
 </script>
</html>