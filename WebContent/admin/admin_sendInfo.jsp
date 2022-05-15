<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
		}
		#mess{
			font-size:13px;
			resize:none;
		}
			input{
			width: 60px;
			height: 40px;
		}
	</style>
</head>
<body>
	<form action="Adminservlet?num=17&name=${msgBeen.fxr }" method="post" id="myform">
		<!-- <textarea name="message" id="mess" cols="120" rows="14"></textarea> -->
		<textarea name="message" cols="62" rows="10" id="mess"></textarea>
		<input type="submit"  style="width:90px;height: 40px;background-color: #426374;color:white"  value="发送">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset"  style="width:90px;height: 40px;background-color: #426374;color:white"value="重置">
	</form>
</body>
<script type="text/javascript">
	function $(n){
		return document.getElementById(n);
	}
</script>
</html>