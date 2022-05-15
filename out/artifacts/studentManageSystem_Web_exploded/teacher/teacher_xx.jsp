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
        table tr{
        	height: 50px;
        }
         table td{
        	height: 50px;
        	font-family: 楷体;
        	line-height: 50px;
        }
    </style>
</head>
<body>
<h1 style="text-align:center;">个人信息页面</h1>
	<br>
	<hr>
    当前位置：系统管理><a href="" title="">个人信息</a>
<br><br>
   <form action="" id="updateForm">
	   <table>
	        <tr>
	            <td>姓&nbsp;&nbsp;&nbsp;&nbsp;名：<input type="text" name="user" id="user" value="郭宇"></td>
	        </tr>
	        <tr>
	            <td>性&nbsp;&nbsp;&nbsp;&nbsp;别：<select name="" name="sex" id="sex" id="">
	            	<option value="1">男</option>
	            	<option value="1">女</option>
	            </select></td>
	        </tr>
	        <tr>
	            <td>教师电话：<input type="text" name="tPhone" id="tPhone" value="110"></td>
	        </tr>
	        <tr>
	        	<td>所管班级：<input type="text" name="class"  id="class" value="高一12班"></td>
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
			$("user").readOnly=true;
			$("sex").disabled=true;
			$("stuphone").readOnly=true;
			$("stuIdCard").readOnly=true;
		}else{
			$("user").readOnly=false;
			$("sex").disabled=false;
			$("stuphone").readOnly=false;
			$("stuIdCard").readOnly=false;
		}
		
	}
</script>
</html>