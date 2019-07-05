<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String username = (String)request.getParameter("username");
	request.setAttribute("username", username);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />-->
<title>首页</title>
<link rel="stylesheet" type="text/css" href="../../css/reset.css" />
<link rel="stylesheet" type="text/css" href="../../css/style.css" />
<style type="text/css">
	frame{border: none;}
</style>
</head>
 <frameset noresize="noresize" frameborder="no">
    <frameset cols="240,*" style="border: 0;" framespacing="0" frameborder="no">
<%--         <frame src="left.jsp?username=<%=username %>" noresize="noresize" frameborder="0"> --%>
<frame src="stuLeftPage?username=<%=username %>" noresize="noresize" frameborder="0">
<%--         <frame name="right" frameborder="0" src="index1.jsp?username=<%=username %>"> --%>
<frame name="right" frameborder="0" src="stuRightPage?username=<%=username %>">
    </frameset>
 </frameset>
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/jquery.nicescroll.min.js"></script>
<script type="text/javascript" src="../../js/index.js"></script>
</html>