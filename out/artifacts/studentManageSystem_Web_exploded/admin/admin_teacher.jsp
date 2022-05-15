<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="">
	<style>
        table{
            width: 100%;
            border-width: 1px;
            border-style: solid;
            border-collapse: collapse;/*合并单元格*/
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
<h1 style="text-align:center;">查询教师信息页面</h1>
    <br>
    <hr>
当前位置：教师管理><a href="" title="">查询教师</a>
<h1>${msg }</h1>
    <form action="Adminservlet?num=21" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教工号：<input type="text" name="staffid" id="staffid">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教师姓名：<input type="text" name="teachername" id="teachername" placeholder="请输入教师姓名">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教师电话：<input type="text" name="tell" id="tell" placeholder="请输入教师电话">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生日：<input type="text" name="birthday" id="birthday" placeholder="请输入教师生日">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教师密码：<input type="text" name="teacherpass" id="teacherpass" placeholder="请输入教师密码">
    <br><br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;所管班级：<input type="text" name="teacherclass" id="teacherclass" placeholder="请输入所管班级">
    <br><br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="修改" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
<br> <br> <br> 
    <table>
    	<tr>
			<th>职工号</th>
			<th>教师姓名</th>
			<th>电话</th>
			<th>所管班级</th>
			<th>登录密码</th>
			<th>操作</th>
		</tr>
         <c:forEach items="${teachers}" var="teachers">
			<tr>
				<td>${teachers.staffid}</td>
				<td>${teachers.teachername}</td>
				<td>${teachers.tell}</td>
				<td>${teachers.teacherclass}</td>
				<td>${teachers.teacherpass}</td>
				<td><a href="JavaScript:show('${teachers.staffid}','${teachers.teachername}','${teachers.tell}','${teachers.birthday}','${teachers.teacherpass}','${teachers.teacherclass}')">修改</a> | <a href="Adminservlet?num=12&tid=${teachers.staffid}">删除</a></td>
			</tr>
		</c:forEach>
    </table>
</body>
<script type="text/javascript">
	function $(n){
	 		return document.getElementById(n);
	 	}
	function show(staffid,teachername,tell,birthday,teacherpass,teacherclass){
		$("staffid").value=staffid;
		$("teachername").value=teachername;
		$("tell").value=tell;
		$("birthday").value=birthday;
		$("teacherpass").value=teacherpass;
		$("teacherclass").value=teacherclass;
		$("addStuForm").style.display="block";
	}
 </script>
</html>