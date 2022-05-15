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
            text-align: center;
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
<body>
<h1 style="text-align:center;">统计成绩页面</h1>
    <br>
    <hr>
 当前位置：成绩管理><a href="" title="">统计成绩</a>
 <h1>${msg }</h1>
<form action="Adminservlet?num=22" method="post" id="addStuForm">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生学号：<input type="text" name="stnumber" id="stnumber">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生姓名：<input type="text" name="sname" id="sname">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;科目：<input type="text" name="subjects" id="subjects" placeholder="请输入科目">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;成绩：<input type="text" name="achievement" id="achievement" placeholder="请输入成绩">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考生状态：<input type="text" name="state" id="state" placeholder="请输入考生状态">
	<br>
	<br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="修改" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
<br> <br> <br>

	<table>
			<tr>
	            <th>学生姓名</th>
	            <th>科目</th>
	             <th>分数</th>
	            <th>缺考备注</th>
	            <th>操作</th>
       		 </tr>
     	 <c:forEach items="${score}" var="score">
			<tr>
				<td>${score.sname}</td>
				<td>${score.subjects}</td>
				<td>${score.achievement}</td>
				<td>${score.state}</td>
				<td><a href="JavaScript:show('${score.stnumber}','${score.sname}','${score.subjects}','${score.achievement}','${score.state}')">修改</a> | <a href="Adminservlet?num=14&stnumber=${score.stnumber}">删除</a></td>
			</tr>
		</c:forEach>
        
    </table>
</body>
<script type="text/javascript">
	function $(n){
	 		return document.getElementById(n);
	 	}
	function show(stnumber,sname,subjects,achievement,state){
		$("stnumber").value=stnumber;
		$("sname").value=sname;
		$("subjects").value=subjects;
		$("achievement").value=achievement;
		$("state").value=state;
		$("addStuForm").style.display="block";
	}
 </script>
</html>