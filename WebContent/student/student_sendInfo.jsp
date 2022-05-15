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
	<form action="../StudentServlet?num=6&sxr="" method="post">
		<!-- <textarea name="message" id="mess" cols="120" rows="14"></textarea> -->
		<textarea name="message" cols="62" rows="10" id="mess"></textarea>
		<input type="submit" id="submit"  value="发送">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
	</form>
</body>