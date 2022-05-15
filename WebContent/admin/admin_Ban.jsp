<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>班级表</title>
	<link rel="stylesheet" href=""><style>
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
<body>
<h1 style="text-align:center;">查询班级页面</h1>
    <br>
    <hr>
当前位置：班级管理><a href="" title="">查询班级</a>
<h1>${msg }</h1>
    <br>
    <hr>
	<form action="Adminservlet?num=20" method="post" id="addStuForm">
	<br>
	<br>
	<br>
	<br>
		班级id：<input type="text" name="cid" id="cid" readonly placeholder="请输入班级id">
	<br><br>
		   专业：<input type="text" name="major" id="major" placeholder="请输入专业名称">
	<br><br>
		  班级：<input type="text" name="classname" id="classname" placeholder="请输入班级名称">
	<br><br>
		  年级：<input type="text" name="grade" id="grade" placeholder="请输入年级名称">
	<br><br>
		班主任：<input type="text" name="teachername" id="teachername" placeholder="请输入班主任姓名">
	<br><br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="修改" onclick="block()" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
<br> <br> <br>
    <br> <br>

	<table>
		<tr>
			<th>班级id</th>
			<th>专业</th>
			<th>年级</th>
			<th>班级名称</th>
			<th>班辅导员</th>
			<th>操作</th>
		</tr>
        <c:forEach items="${ban}" var="ban">
			<tr>
				<td>${ban.cid}</td>
				<td>${ban.major}</td>
				<td>${ban.grade}</td>
				<td>${ban.bj}</td>
				<td>${ban.instructor}</td>
				<td><a href="JavaScript:show('${ban.cid}','${ban.major}','${ban.grade}','${ban.bj}','${ban.instructor}')">修改</a> | <a href="Adminservlet?num=11&bid=${ban.cid}">删除</a></td>
			</tr>
		</c:forEach>
    </table>
</body>

<script type="text/javascript">
	function $(n){
	 		return document.getElementById(n);
	 	}
	function show(cid,major,grade,bj,instructor){
		$("cid").value=cid;
		$("classname").value=bj;
		$("teachername").value=instructor;
		$("grade").value=grade;
		$("major").value=major;
		$("addStuForm").style.display="block";
	}
 </script>
</html>