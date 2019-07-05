<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改教师密码</title>
<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
<% String teaId = (String) request.getAttribute("teaId"); %>
<%=teaId %>
<br />
<br />
<br />
<br />
<br />
<br />
<form action="updateStuPwd?teaId=<%=teaId %>" method="post">
						<div class="buttOper blacklist clearfix">
						<div class="buttProject selectW">
							<input type="text" name="accountPwd" id="" value="" placeholder="请输入新的密码"/>
						</div>
						
						<div class="prolistSearchW">
							<input type="submit" class="searchBtn" name="" id="" value="" />
							</div>  

</body>
</html>