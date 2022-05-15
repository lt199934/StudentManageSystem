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
            width: 100%;
            border-width: 1px;
            border-style: solid;
            border-collapse: collapse;/*合并单元格*/
        }
        table td{
            border-width: 1px;
            border-style: solid;
            text-align: center;
        }
         table th{
             background-color: aqua;
        }
    </style>
</head>
<body>
<h1 style="text-align:center;">查询教师信息页面</h1>
    <br>
    <hr>
当前位置：教师管理><a href="" title="">查询教师</a>
<br> <br> <br> <form action="">按条件查询：<input  type="text" name="teacherSerach" placeholder="请输入查询的内容"><input type="submit" value="查找"></form><br>
    <form action="">查找所在班级的老师：<select name="ban" id="">
        <option checked="checked" value="软件1班">软件1班</option>
        <option value="软件2班">软件2班</option>
        <option value="电商1班">电商1班</option>
        <option value="电商2班">电商2班</option>
    </select>
    <input type="submit" value="查找"></form>
    <br> <br>

    <table>
        <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>所管班级</th>
            <th>教师电话</th>
             <th>操作</th>
 
        </tr>
         <tr>
            <td>郭宇</td>
            <td>男</td>
            <td>高一12班</td>
            <td>110</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
             <tr>
            <td>郭宇</td>
            <td>男</td>
            <td>高一12班</td>
            <td>110</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
         <tr>
            <td>郭宇</td>
            <td>男</td>
            <td>高一12班</td>
            <td>110</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
         <tr>
            <td>郭宇</td>
            <td>男</td>
            <td>高一12班</td>
            <td>110</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
         <tr>
            <td>郭宇</td>
            <td>男</td>
            <td>高一12班</td>
            <td>110</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
        </tr>
    </table>
</body>
</html>