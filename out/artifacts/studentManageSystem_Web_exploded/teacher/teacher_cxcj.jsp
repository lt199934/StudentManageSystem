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
<h1 style="text-align:center;">查询成绩页面</h1>
    <br>
    <hr>
 当前位置：成绩管理><a href="" title="">查询成绩</a>
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
        <tr>
            <th>班级</th>
            <th>学生</th>
            <th>语文</th>
            <th>数学</th>
            <th>英语</th>
            <th>总分</th>
            <th>操作</th>
        </tr>
         <tr>
            <td>高一12班</td>
            <td>周乐智</td>
            <td>50</td>
            <td>60</td>
            <td>70</td>
            <td>180</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
        <tr>
            <td>高一12班</td>
            <td>士大夫 </td>
            <td>120</td>
            <td>90</td>
            <td>70</td>
            <td>270</td>
            <td><a href="" title="">修改</a> <a href="" title="">删除</a></td>
        </tr>
    </table>
</body>
</html>