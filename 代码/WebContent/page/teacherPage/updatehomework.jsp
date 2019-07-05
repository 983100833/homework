
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@page import="com.hm_ms.bean.*"%>
<!DOCTYPE html>
<html>
	<head>
	<%Student stu=(Student)request.getAttribute("stu");
    HomeWork hoWork=(HomeWork)request.getAttribute("hoWork"); 
    String text=(String)request.getAttribute("text");%>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>批改作业</title>
		<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
		<!--Top Start!-->
		<div id="top">
			<div class="topBar">
				<div class="inner clearfix">
					<!-- <h4>批改作业</h4>
					<div class="contact topItem">
						<h3><a href="#">联系我们<i></i></a></h3>
						<div class="dropdown">
							<a href="#">联系我们</a>
							<a href="#">联系我们</a>
							<a href="#">联系我们</a>
						</div> -->
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
					<!-- <div class="indexBanner"><img src="images/banner1.jpg"/></div> -->
					<!-- <div class="interbox">
						<div class="inte_tit">
							积分说明
						</div>
						<ul>
							<li>1、1元 = 1积分；</li>
							<li>2、积分是客户所充值的金额累加；</li>
							<li>3、积分越高，可同时获取号码越多，折扣越低。</li>
						</ul>
					</div> -->
					<div class="inte_list">
						<ul>
							<li class="clearfix">
								<div style="width: 33.3% ">学生姓名</div><div style="width: 33.4%">学生学号</div><div style="width: 33.3%">学生班级</div>
							</li>
							<li class="clearfix"><div style="width: 33.3%"><%=stu.getStudentName() %></div><div style="width: 33.3%"><%=stu.getStudentId() %>
							</div><div style="width: 33.4%"><%=stu.getClassesName()%></div></li>
					
							<ul class="inte_list">
						<li style="background-color: #7AC5CD">
							<center><h2 style="color: black">题目</h2></center>
						</li>
<textarea style="width:100%;height:100px;border:2px double black;"  disabled><%=hoWork.getHomeWorkTitle()%></textarea><br/><br/><br/>
<ul class="inte_list">
						<li style="background-color: #7AC5CD">
							<center><h2 style="color: black">学生答案</h2></center>
						</li>
<textarea style="width:100%;height:200px;border:2px double black;"  disabled><%=text%></textarea><br/><br/><br/>
							<ul class="inte_list">
						<li style="background-color: #7AC5CD">
							<center><h2 style="color: black">成绩</h2></center>
						</li>
<form action="Correct?howid=<%=hoWork.getHomeWorkId()%>&stuid=<%=stu.getStudentId()%>&teaname="tea"" method="post">						
<textarea name="grade" style="width:100%;height:100px;border:2px double black;" ></textarea>
<input type="submit" name="prolistApplySure" id="prolistApplySure" value="确认" />
<input type="submit" name="prolistApplySure" id="prolistApplySure" value="取消" />
</form>

							<!-- <div class="balanBottom"><a class="" href=""></a></div>
						</li> -->
						<!-- <li>
							<h2>提现余额（元）</h2>
							<p>0.00</p>
							<div class="balanBottom balanBottomR clearfix"><a class="" href="">提现</a><a class="" href="">转换</a></div>
						</li> -->
					</ul></div></div>
							<!-- <li class="clearfix"><div>VIP1</div><div>100</div><div>9.9</div></li>
							<li class="clearfix"><div>VIP2</div><div>1000</div><div>9.5</div></li>
							<li class="clearfix"><div>VIP3</div><div>3000</div><div>8.7</div></li>
							<li class="clearfix"><div>VIP4</div><div>5000</div><div>9.1</div></li>
							<li class="clearfix"><div>VIP5</div><div>10000</div><div>9.5</div></li>
							<li class="clearfix"><div>VIP6</div><div>20000</div><div>4.5</div></li> -->
						</ul>
					</div>
					
				</div>
				
				<!-- <div id="footer">
					<p>Copyright ©2012 - 2017 17sucai.com All Rights <a href="http://www.17sucai.com/" title="17sucai">Reserved</a>. 苏ICP备17077179号</p>
				</div> -->
			
		
		
	</body>
</html>
