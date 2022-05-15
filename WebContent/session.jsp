<%@ page contentType="text/html; charset=UTF-8" import="StuManage.been.*"%>
<%
UserBeen user=(UserBeen)session.getAttribute("user");
if(user==null) {
	session.removeAttribute("user");
	session.setAttribute("msg", "登录超时！");
	response.sendRedirect("../login.jsp");
}else{
	session.setAttribute("msg", " ");
}
%>