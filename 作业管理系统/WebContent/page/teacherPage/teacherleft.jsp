<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<a href="teacherleft.jsp" class="topLogo">
				<img src="images/logo.png">
			</a>
			<ul>
				<li><a href="teacherindex1.jsp" target="right"><i class="ico8"></i>首页</a></li>
				<li><a href="personTeacher?username=<%=username %>" target="right"><i class="ico8"></i>个人资料</a></li>
				<!-- <li class="on"><a href="index1.html" target="right"><i class="ico1"></i>用户首页</a></li>
				<li><a href="2information.html" target="right"><i class="ico2"></i>获取信息</a></li> -->
				<li><a href="problem.html" target="right"><i class="ico3"></i>题库管理</a></li>
				<li><a href="queryhomework?username=<%=username %>" target="right"><i class="ico4"></i>作业管理</a></li>
				<!-- <li><a href="11blacklist.html" target="right"><i class="ico5"></i>卡商黑名单</a></li>
				<li><a href="12detail.html" target="right"><i class="ico6"></i>明细统计</a></li>
				<li><a href="16money.html" target="right"><i class="ico7"></i>充值/提现</a></li> -->
				
				<!-- <li><a href="21integra.html" target="right"><i class="ico9"></i>积分说明</a></li>
				<li><a href="22API.html" target="right"><i class="ico10"></i>API开发文档</a></li>
				<li><a href="23help.html" target="right"><i class="ico11"></i>帮助中心</a></li>
				<li><a href="24client.html" target="right"><i class="ico12"></i>客户端下载</a></li> -->
			</ul>
		</div>
		<!--Menu End!-->
	</body>

</html>
