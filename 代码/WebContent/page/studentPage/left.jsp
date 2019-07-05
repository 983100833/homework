<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%   String username = (String)request.getParameter("username");
	 request.setAttribute("username", username); %>
	<head>
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>

	<body  style="margin:0px;padding:0px">
		<div id="menu">
			<a href="index.html" class="topLogo">
				<img src="images/logo.png">
			</a>
			<ul>
				
<%-- 				<li class="on"><a href="index1.jsp?username=<%=username %>" target="right"><i class="ico1"></i>用户首页</a></li> --%>
				<li class="on"><a href="stuRightPage?username=<%=username %>" target="right"><i class="ico1"></i>用户首页</a></li>
<!-- 				<li><a href="2information.html" target="right"><i class="ico2"></i>作业查询</a></li> -->
				<li><a href="stuPerHomeWork?username=<%=username %>" target="right"><i class="ico3"></i>作业管理</a></li>
<%-- 				<li><a href="3project_list.jsp?username=<%=username %>" target="right"><i class="ico3"></i>作业管理</a></li> --%>
				<li><a href="personPage?username=<%=username %>" target="right"><i class="ico8"></i>个人中心</a></li>
<%-- 				<li><i class="ico8"></i><%=username %></li> --%>
			</ul>
			
		</div>
		<!--Menu End!-->
	</body>

</html>