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
        form{
			display: none;
        }
	</style>
<body>
<h1 style="text-align:center;">查询学生信息页面</h1>
    <br>
    <hr>
    当前位置：学生管理><a href="" title="">查询学生</a>
     <h1>${msg }</h1>
    <form action="Adminservlet?num=23" method="post" id="addStuForm">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生学号：<input type="text" name="stnumber" id="stnumber">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生姓名：<input type="text" name="studentname" id="studentname">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：<input type="text" name="sex" id="sex" placeholder="请输入学生性别">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;身份证：<input type="text" name="identityId" id="identityId" placeholder="请输入学生身份证">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学籍：<input type="text" name="sstatus" id="sstatus" placeholder="请输入学生学籍">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生电话：<input type="text" name="sttell" id="sttell" placeholder="请输入学生电话">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;家长电话：<input type="text" name="parenttell" id="parenttell" placeholder="请输入家长电话">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生地址：<input type="text" name="address" id="address" placeholder="请输入学生地址">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生寝室号：<input type="text" name="dorm" id="dorm" placeholder="请输入学生寝室号">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生是否住校：<input type="text" name="school" id="school" placeholder="请输入学生所在学校">
	<br>
	<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生班级：<input type="text" name="cid" id="cid" placeholder="请输入学生班级">
	<br>
	<br>
	<p style="float: left;"><input type="submit" style="width:90px;height: 40px;background-color: #426374;color:white" value="修改" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" style="width:90px;height: 40px;background-color: #426374;color:white" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
    <br> <br> <br> 

	<table>
			<tr>
	            <th>学号</th>
	            <th>姓名</th>
	            <th>性别</th>
	            <th>身份证</th>
	            <th>学籍</th>
	            <th>学生电话</th>
	            <th>家长电话</th>
	             <th>地址</th>
	            <th>寝室</th>
	            <th>是否住校</th>
				<th>学生状态</th>
	            <th>班级</th>
	            <th>操作</th>
       		 </tr>
        <c:forEach items="${student }" var="stu">
			<tr>
				<td>${stu.stnumber }</td>
				<td>${stu.studentname }</td>
				<td>${stu.sex }</td>
				<td>${stu.identityId }</td>
				<td>${stu.sstatus }</td>
				<td>${stu.sttell }</td>
				<td>${stu.parenttell }</td>
				<td>${stu.address }</td>
				<td>${stu.dorm }</td>
				<td>${stu.school }</td>
				<td>
					<c:choose>
						<c:when test="${stu.styState ==1 }">
							正常
						</c:when>
						<c:otherwise>
							休学
						</c:otherwise>
					</c:choose>

				</td>
				<td>${stu.stuClass }</td>
				<td><a href="JavaScript:show('${stu.stnumber }','${stu.studentname }','${stu.sex }','${stu.identityId }','${stu.sstatus }','${stu.sttell }','${stu.parenttell }','${stu.address }','${stu.dorm }','${stu.school }','${stu.cid }')">修改</a> | <a href="Adminservlet?num=10&stnumber=${stu.stnumber }">删除</a></td>
			</tr>
		</c:forEach>
       
    </table>
</body>
<script type="text/javascript">
	function $(n){
	 		return document.getElementById(n);
	 	}
	function show(stnumber,studentname,sex,identityId,sstatus,sttell,parenttell,address,dorm,school,cid){
		$("stnumber").value=stnumber;
		$("studentname").value=studentname;
		$("sex").value=sex;
		$("identityId").value=identityId;
		$("sstatus").value=sstatus;
		$("sttell").value=sttell;
		$("parenttell").value=parenttell;
		$("address").value=address;
		$("dorm").value=dorm;
		$("school").value=school;
		$("cid").value=cid;
		$("addStuForm").style.display="block";
	}
 </script>
</html>