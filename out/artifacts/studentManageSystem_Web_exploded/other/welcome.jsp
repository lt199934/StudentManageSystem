<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div title="欢迎使用" style="padding:20px;overflow:hidden; color:red; " >
	<p style="font-size: 50px; line-height: 60px; height: 60px;">成都信息工程大学</p>
	<p style="font-size: 25px; line-height: 30px; height: 30px;">欢迎使用学生管理系统</p>
  	<hr />
  	<p style="font-size: 18px;">最新通知：</p>
  	<c:forEach items="${note }" var="note">
  	<p style="width: 700px;font-size: 18px;">${note.content }<span style="float: right;">发布时间：${note.ntime}</span></p>
  	</c:forEach>
</div>
</body>
</html>