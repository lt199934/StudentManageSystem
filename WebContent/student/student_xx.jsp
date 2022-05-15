<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>查询学生</title>
    <style>
        table{
            width: 100%;
            border-width: 1px;
            border-style: solid;
            border-collapse: collapse;/*合并单元格*/
            font-size: 18px;
        }
        table tr{
            height: 60px;
            border-style: solid;
            text-align: center;
        }
        table td{
            border-width: 1px;
            border-style: solid;
            text-align: center;
        }
    </style>
</head>
<body>
<h1 style="text-align:center;">查看个人信息页面</h1>
  <br>
  <hr>
    当前位置：学生管理><a href="" title="">查看个人信息</a>
<br><br>
    <table>
    		<tr>
              <td>学号:</td>
              <td><input type="text" name="" id="" value="${stuInfo.stnumber }" readonly="readonly"></td>
        	</tr>
        	<tr>
              <td>姓名:</td>
              <td><input type="text" name="" id="" value="${stuInfo.studentname }" readonly="readonly"></td>
        	</tr>
        	 <tr>
              <td>班级:</td>
              <td><input type="text" name="" id="" value="${stuInfo.stuClass }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>性别:</td>
              <td><input type="text" name="" id="" value="${stuInfo.sex }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>身份证号:</td>
              <td><input type="text" name="" id="" value="${stuInfo.identityId}" readonly="readonly"></td>
          </tr>
          <tr>
              <td>学籍状态:</td>
              <td><input type="text" name="" id="" value="${stuInfo.sstatus }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>学生电话:</td>
              <td><input type="text" name="" id="" value="${stuInfo.sttell }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>家长电话:</td>
              <td><input type="text" name="" id="" value="${stuInfo.parenttell }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>家庭住址:</td>
              <td><input type="text" name="" id="" value="${stuInfo.address }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>学生状态:</td>
              <td><input type="text" name="" id="" value="${stuInfo.styState }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>处分情况:</td>
              <td><input type="text" name="" id="" value="${stuInfo.punishment }" readonly="readonly"></td>
          </tr>
          <tr>
              <td>寝室号:</td>
              <td><input type="text" name="" id="" value="${stuInfo.dorm }" readonly="readonly"></td>
          </tr>  
          <tr>
              <td>是否住校:</td>
              <td><input type="text" name="" id="" value="${stuInfo.school }" readonly="readonly"></td>
          </tr>      
    </table>
</body>
</html>