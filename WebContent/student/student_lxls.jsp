<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<style>
*{margin: 0px;padding: 0px;}
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
		<div id="message">
				<c:forEach items="${msglist2 }" var="msg">
				<!-- Left --> 
					  	<div class="sender"> 
					  		<div> 
					  			<img src="img/teacher.jpg"/>
					  		</div> 
					  		<div> 
					  			<div class="left_triangle"></div>
					  			<p>${msg.fxr}管理员：${msg.masage }</p> 
					  			<span>时间：${msg.mtime }</span>
					  		</div> 
					  	</div>
				</c:forEach>
					
				<!-- Right --> 
				<c:forEach items="${msglist1 }" var="msg">
  							<div class="receiver"> 
	  							<div> <img src="img/student.jpg"/>
	  								
	  							</div> 
	  							<div> 
	  								<div class="right_triangle"></div> 
	  								<p>${msg.fxr}同学：${msg.masage }</p> 
						  			<span>时间：${msg.mtime } </span>
	  							</div> 
  							</div>
 				</c:forEach>
				</div>


	<!-- Left --> 
	<!--<div class="sender"> 
		<div> 
			<img src=".jpg"/>
		</div> 
		<div> 
			<div class="left_triangle"></div>
			<p><p>时间</p></p>  
		</div> 
	</div>--> 	
  	<!-- Right --> 
  	<!--<div class="receiver"> 
  		<div> 
  			<img src="img/.jpg"/>
  		</div> 
  		<div> 
  			<div class="right_triangle"></div> 
  			<p><p>时间：</p></p> 
  		</div> 
  	</div>-->
  	<a name="mybottom"></a>
</body>
<script type="text/javascript">
 function $(n){
 	return document.getElementById(n);
 }
 var a=setInterval("messageInit()",1000);
 function messageInit(){
 	location.reload();
	//location.href="#mybottom";
 }
 $("message").onmouseover=function(){
 	clearInterval(a);
 }
 $("message").onmouseout=function(){
 	var a=setInterval("messageInit()",1000);
 }
</script>
</html>