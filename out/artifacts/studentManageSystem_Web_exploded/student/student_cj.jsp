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
        a{
            text-decoration: none;
        }
        table th{
             background-color: aqua;
        }
	</style>
</head>
<body>
<h1 style="text-align:center;">查看个人成绩信息页面</h1>
	<br>
	<hr>
    当前位置：成绩管理><a href="" title="">查看成绩</a>
<br><br><br>
		<table>
			<tr>
				<th>科目</th>
				<th>分数</th>
				<th>缺考补充</th>
 			</tr>
		<c:forEach items="${scoreList }" var="score">
			<tr>
				<td>${score.subjects }</td>
				<td>${score.achievement }</td>
				<td>${score.state }</td>
			</tr>
		</c:forEach>
		</table>
		<span style="color:red;text-align: center;">${msg }</span>
</body>
</html>