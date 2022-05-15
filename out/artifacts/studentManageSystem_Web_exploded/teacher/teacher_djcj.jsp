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
            text-align: center;
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
<body>
<h1 style="text-align:center;">登记学生成绩</h1>
    <br>
    <hr>
    当前位置：成绩管理><a href="" title="">登记成绩</a>
    <form action="" id="addStuForm">
    <br>
    <br>
    <br>
    <br>
    请选择班级：<select name="ban" id="">
        <option checked="checked" value="软件1班">软件1班</option>
        <option value="软件2班">软件2班</option>
        <option value="电商1班">电商1班</option>
        <option value="电商2班">电商2班</option>
    </select>
    <br>
    <br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生：<input type="text" name="username" placeholder="请输入学生姓名">
    <br>
    <br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;语文：<input type="text" name="chinese" placeholder="请输入语文成绩">
    <br>
    <br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数学：<input type="text" name="math" placeholder="请输入数学成绩">
    <br>
    <br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;英语：<input type="text" name="math" placeholder="请输入英语成绩">
    <br><br>
    <p style="float: left;"><input type="submit" value="添加" >&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </form>
</body>
</html>