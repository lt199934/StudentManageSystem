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
	width:360px;
	}
        table tr{
        	height: 50px;
        }
         table td{
         	width:320px,auto;
        	height: 50px;
        	font-family: 楷体;
        	line-height: 50px;
        }
        input{
        	border:1px solid #ccc;
        }
    </style>
</head>
<body>
<h1 style="text-align:center;">修改个人信息页面</h1>
	<br>
	<hr>
    当前位置：系统管理><a href="" title="">修改个人信息</a>
<br><br>
   <form action="" method="post" id="updateForm">
	   <table>
	        <tr>
	            <td>姓&nbsp;&nbsp;&nbsp;&nbsp;名：<input type="text" name="user" id="user" readonly value="${userinfo.studentname }"></td>
	        </tr>
	        <tr>
	            <td>性&nbsp;&nbsp;&nbsp;&nbsp;别：<select name="sex" disabled id="sex">
	            <option value="${userinfo.sex }" selected="selected">${userinfo.sex }</option>
	   				<c:if test="${userinfo.sex=='女' }">
	   					<option value="男">男</option>
	   				</c:if>
	            	<c:if test="${userinfo.sex=='男' }">
	   					<option value="女">女</option>
	   				</c:if>
	            	
	            </select></td>
	        </tr>
	        <tr>
	            <td>学生电话：<input type="text" readonly id="stuphone" name="stuphone" value="${userinfo.sttell }"></td>
	        </tr>
	        <tr>
	        	<td>身份证号：<input type="text" readonly id="stuIdCard" name="stuIdCard"  value="${userinfo.identityId }"></td>
	        </tr>
	        <tr>
	        	<td>学籍状态：<input type="text" readonly id="xj" name="xj" value="${userinfo.sstatus }"></td>
	        </tr>
	        <tr>
	        	<td>家长电话：<input type="text" readonly id="parentphone" name="parentphone" value="${userinfo.parenttell }"></td>
	        </tr>
	        <tr>
	        	<td>家庭住址：<input type="text" readonly id="address" name="address" value="${userinfo.address }"></td>
	        </tr>
	        <tr>
	        	<td>学生状态：<input type="text" readonly id="zt" name="zt" value="${userinfo.styState }"><div id="xg" style="color:red;display:none;">请修改</div></td>
	        </tr>
	    </table> 
	    <input type="button" id="update" onclick="Update()" value="修改"> 
   </form>
</body>
<script type="text/javascript">
	function $(n){
		return document.getElementById(n);
	}
	function Update(){
		if($("update").value=="确定"){
			$("update").value="修改";
			$("xg").style.display="none";
			$("stuIdCard").style.border="1px solid #ccc";
			$("zt").style.border="1px solid #ccc"
			$("updateForm").action="StudentServlet?num=4";
			$("updateForm").submit();
			$("sex").disabled=true;
			$("user").readOnly=true;
			$("stuphone").readOnly=true;
			$("xj").readOnly=true;
			$("parentphone").readOnly=true;
			$("address").readOnly=true;
			$("zt").readOnly=true;
			
		}else{
			$("update").value="确定";
			$("xg").style.display="block";
			$("user").readOnly=false;
			$("sex").disabled=false;
			$("stuphone").readOnly=false;
			$("xj").readOnly=false;
			$("parentphone").readOnly=false;
			$("address").readOnly=false;
			$("zt").readOnly=false;
			$("stuIdCard").style.border="1px solid red";
			$("zt").style.border="1px solid red";
		}
	}
</script>
</html>