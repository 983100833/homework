<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<!--<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />-->
<title>首页</title>
<link rel="stylesheet" type="text/css" href="css/reset.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<style type="text/css">
	frame{border: none;}
</style>
</head>
<%
	String username = (String)request.getParameter("username");
	request.setAttribute("username", username);
%>
 <frameset noresize="noresize" frameborder="no">
    <frameset cols="240,*" style="border: 0;" framespacing="0" frameborder="no">
        <frame src="TeacherLeftPage?username=<%=username %>" noresize="noresize" frameborder="0">
        <frame name="right" frameborder="0" src="TeacherRightPage?username=<%=username %>">
    </frameset>
 </frameset>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</html>