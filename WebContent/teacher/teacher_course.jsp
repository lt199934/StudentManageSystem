<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>课程表</title>
	<link rel="stylesheet" href="">
	<style>
        table{
            width: 100%;
            border-width: 1px;
            border-style: solid;
            text-align: center;
            border-collapse: collapse;
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
<h1 style="text-align:center;">查询班级课程页面</h1>
    <br>
    <hr>
当前位置：教师管理><a href="" title="">查询班级课程</a>
<br> <br> <br> <form action="">按条件查询：<input  type="text" name="teacherSerach" placeholder="请输入查询的内容"><input type="submit" value="查找"></form><br>
    <form action="">选择需要查找的班级：<select name="ban" id="">
        <option checked="checked" value="软件1班">软件1班</option>
        <option value="软件2班">软件2班</option>
        <option value="电商1班">电商1班</option>
        <option value="电商2班">电商2班</option>
    </select>
    <input type="submit" value="查找"></form>
    <br> <br>

	<table>
		<div>软件1班课程表</div>
        <tr>
            <th>时间</th>
            <th>星期一</th>
            <th>星期二</th>
            <th>星期三</th>
            <th>星期四</th>
            <th>星期五</th>
            <th>操作</th>
        </tr>
         <tr>
            <td>上午 第一节（8.30-10.10）</td>
            <td>无</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
         <tr>
            <td>上午 第二节（10.40-12.00）</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>无</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
         <tr>
            <td>下午 第一节（14.00-15.40）</td>
            <td>无</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
        <tr>
            <td>下午 第二节（15.50-17.30）</td>
            <td>无</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
        <tr>
            <td>晚 （18.30-21.40）</td>
            <td>无</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td>《语文》刘鸡脖 c102</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
    </table>
</body>
</html>