<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>login页面</title>
	<link rel="stylesheet" href="css/login.css">
</head>
<body>
	<div class="login">
		<div class="top"><h1 class="bt">学生管理系统</h1>
	</div>
		<div class="center">
		<h1 style="text-align: ceneter;margin:auto;">${msg }</h1>
			<div class="loginForm">
				<div class="img"></div>

				<div class="form">
					<form action="LoginServlet" method="post">
					<br>
					<h2 style="color:#fff;">welcom back</h2>
					<br>
					<hr>
					
						<div class="loginform">

							<table>
							<tr>
								<th><h1>LOGIN</h1></th>
							</tr>
								<tr>
									<td>账号：</td>
								</tr>
								<tr>
									<td><input type="text" name="username" placeholder="请输入用户名"></td>
								</tr>
								<br>
								<tr>
									<td>密码：</td>
								</tr>
								<tr>
									<td><input type="password" name="userpass" id="pass" placeholder="请输入密码"></td>
								</tr>
								<tr>
									<td><a href="javascript:void(0);" onclick="show()" id="show">显示密码</a></td>
								</tr>
								<tr>
									<td>登录类型：</td>
								</tr>
								<tr>
									<td><select name="userType" id="">
										<option value="1">管理员</option>
										<option value="2">教师</option>
										<option value="3">学生</option>
									</select>	
									</td>
								</tr>
							</table>
						</div>
						<br>
						<br>
						<hr>
						<br>
						<br>
						&nbsp;&nbsp;<input class="loginInput" type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" class="loginInput">
					</form>
				</div>
			</div>
		</div>
		<div class="foot">
			Copyright &copy; System By 刘涛
		</div>
	</div>
</body>
<script>
	function $(n){
		return document.getElementById(n);
	}
	function show(){
		if($("pass").type=="password"){
			$("pass").type="text";
			$("show").innerHTML="隐藏密码";
		}else{
			$("pass").type="password";
			$("show").innerHTML="显示密码"
		}
		
	}
</script>
</html>