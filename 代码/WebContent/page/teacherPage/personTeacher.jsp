<%@page import="java.util.List"%>
<%@page import="com.hm_ms.bean.Teacher"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>19个人中心</title>
		<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
	<% String teaId = (String )request.getAttribute("teaId");
	%>
	<%=teaId %>
		<!--Top Start!-->
		<div id="top">
			<div class="topBar">
				<div class="inner clearfix">
					<h4>个人中心</h4>
					<div class="contact topItem">
						<h3><a href="#">联系我们<i></i></a></h3>
						<div class="dropdown">
							<a href="#">联系我们</a>
							<a href="#">联系我们</a>
							<a href="#">联系我们</a>
						</div>
					</div>
					<div class="userBar topItem">
						<div class="portrait fl">
							<img src="images/portrait.jpg">
						</div>
						<h3><a href="#">验证码平台<i></i></a></h3>
						<div class="dropdown">
							<a href="#">用户名</a>
							<a href="#">退出</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--Top End!-->
	
		<!--Main Start!-->
		<div id="main">
			<div class="content">
				<div class="contBox bgf9">
					<div class="indexBanner"><img src="images/banner1.jpg"/></div>
					<div class="personBox">
						<div class="personTit">
							<a class="active" href="personPage" target="_self">基本信息</a>
							<a href="alterTeacherPwd?teaId=<%=teaId %>" target="_self">密码修改</a>
						</div>
						<div class="personHead clearfix">
							<div class="personHeadL">
								<div class="personPic">
									<img src="temp/person_img.jpg"/>
								</div>
								<div class="personPicChage">
									<input type="file" name="" id="file" value="" />
<!-- 									<input type="submit" name="" id="sub" value="修改头像" /> -->
								</div>
							</div>
						</div>
						<div class="personW">
						<%
						List <Teacher>list = (List)request.getAttribute("teacher");
						for(Teacher s : list){
					%>
						<p><span class="personWLeft personWLeft1">工号:</span><span class="personWCenter"><%=s.getTeacherId() %></span></p>
							<p><span class="personWLeft personWLeft1">姓名:</span><span class="personWCenter"><%=s.getTeacherName() %></span></p>
							<p><span class="personWLeft personWLeft1">学院:</span><span class="personWCenter"><%=s.getCollegeName() %></span></p>
							<p><span class="personWLeft personWLeft1">班级:</span><span class="personWCenter"><%=s.getClassesName() %></span></p>
						
						</div>
<!-- 						<input class="personSure" type="submit" name="" id="" value="保存" /> -->
						
					</div>
					<%} %>
				</div>
				
				<div id="footer">
					<p>Copyright ©2012 - 2017 All Rights <a href="http://www.17sucai.com/">Reserved</a>. 苏ICP备17077179号</p>
				</div>
				
			</div>
		</div>
		<!--Main End!-->
		
	</body>
</html>
