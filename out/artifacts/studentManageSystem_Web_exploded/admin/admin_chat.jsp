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
				*{
					margin: 0px;
					padding: 0px;
				}
				.div1{
					width: 100%;
					height: 794px;
					/*background-color: red;*/
					margin: auto;
				}
				.div01{
					width: 100%;
					height: 75%;
					/*background-color: #ccc;*/
					margin: auto;
				}
				
				.div03{
					width: 100%;
					height: 25%;
					/*background-color: pink;*/
					margin: auto;
				}
				#message{
					width: 100%;
					height: 100%;
					overflow-x:hidden; 
				}
				.sender{clear:both;width: auto;height:auto;float: left;margin-bottom: 20px;} 
.sender div:nth-of-type(1){ float: left; } 
.sender div:nth-of-type(2){width:  280px;height:auto;background-color: aquamarine; float: left; margin: -30 20px 20px 65px; padding: 10px 10px 10px 0px; border-radius:7px;margin-left: 30px;} 
.receiver div:first-child img, .sender div:first-child img{ width:50px; height: 50px; } 
.receiver{ clear:both;width:auto;height:auto;float: right;margin-top: 70px;}
div{margin-bottom: 30px;} 
.receiver div:nth-child(1){ float: right; }
 .receiver div:nth-of-type(2){width: 280px;height:auto;float:right; background-color: gold; margin: -30 10px 70px 20px; padding: 10px 0px 10px 10px; border-radius:7px; margin-right: 20px;}
 .left_triangle{ height:0px; width:0px; border-width:8px; border-style:solid; border-color:transparent aquamarine transparent transparent; position: relative; left:-16px; top:3px;overflow-x: hidden; } 
.right_triangle{ height:0px; width:0px; border-width:8px; border-style:solid; border-color:transparent transparent transparent gold; position: relative; right:-16px; top:3px;overflow-x: hidden; }
			</style>
		</head>
		<body>
			<div class="div1">
				<div class="div01">
				<h1 style="text-align:center;" id="mc">${msgBeen.sxr }</h1>	
					<div id="message">
				<c:forEach items="${msglist2 }" var="msg">
				<!-- Left --> 
					  	<div class="sender"> 
					  		<div> 
					  			<img src="img/student.jpg"/>
					  		</div> 
					  		<div> 
					  			<div class="left_triangle"></div>
					  			<p>${msg.fxr}同学：${msg.masage }</p> 
					  			<span>时间：${msg.mtime }</span>
					  		</div> 
					  	</div>
				</c:forEach>
					
				<!-- Right --> 
				<c:forEach items="${msglist1 }" var="msg">
  							<div class="receiver"> 
	  							<div> <img src="img/teacher.jpg"/>
	  								
	  							</div> 
	  							<div> 
	  								<div class="right_triangle"></div> 
	  								<p>${msg.fxr}管理员：${msg.masage }</p> 
						  			<span>时间：${msg.mtime } </span>
	  							</div> 
  							</div>
 				</c:forEach>
				</div>

				</div>
				<div class="div03">
					<form action="Adminservlet?num=17&name=${msgBeen.sxr }" method="post" id="myform">
		<!-- <textarea name="message" id="mess" cols="120" rows="14"></textarea> -->
		<textarea name="message" cols="62" rows="10" id="mess"></textarea>
		<input type="submit"  style="width:90px;height: 40px;background-color: #426374;color:white"  value="发送">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset"  style="width:90px;height: 40px;background-color: #426374;color:white"value="重置">
	</form>
				</div>
			</div>
		</body>
		</html>	