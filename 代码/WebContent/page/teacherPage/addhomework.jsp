
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>4学生列表-添加学生</title>
		<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
	<%String teaName = (String)request.getAttribute("teaName"); 
		String classesName = (String)request.getAttribute("classesName"); %>
	<%=teaName %>
	<%=classesName %>
		<!--Top Start!-->
		<div id="top">
			<div class="topBar">
				<div class="inner clearfix">
					<h4>班级列表</h4>
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
						<h3><a href="#">快云平台<i></i></a></h3>
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
					<div class="prolistHead clearfix">
						<a class="prolist1" href="queryhomework?teaname=tea" target="_self">作业列表</a>
						<a class="prolist2 active" href="addclass" target="_self">布置作业</a>
					</div>
				<!-- 	<div class="prolistApplyH clearfix">
						<ul>
							<li class="active"><a href="4project_apply.html" target="_self"><i class="proAppIcon1"></i>接收短信</a></li>
							<li><a href="5project_apply_send.html" target="_self"><i class="proAppIcon2"></i>发送短信</a></li>
							<li><a href="6project_apply_sendandreceive.html" target="_self"><i class="proAppIcon3"></i>发送/接收短信</a></li>
						</ul>
					</div> -->
					<div class="prolistApplyW">
						<div class="prolistApplyInner clearfix">
						<form action="addhomework?groupName=<%=classesName %>&teaname=<%=teaName %>" method="post">
							<h2>作业号</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmid" id="" value="" placeholder="" />
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>作业名称</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmTitle" id="" value="" placeholder=""/>
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>作业开始时间</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmStart" id="" value="" placeholder="yy-mm-dd"/>
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>作业结束时间</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmEnd" id="" value="" placeholder="yy-mm-dd"/>
							</div>
							<div class="prolistApplyInner clearfix">
							<h2>作业大概内容</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmContent" id="" value="" placeholder=""/>
							</div>
						</div>
						<!-- <div class="prolistApplyInner clearfix">
							<h2>专业</h2>
							<div class="prolistApplyCont">
								<div class="buttProject selectW">
							<input type="text" name="" id="" value="" placeholder="专业名称" readonly="readonly" unselectable="on" onFocus="this.blur()"/>
							<span class="selBtn"></span>
							<div class="selectDown">
								<ul>
									<li>专业1</li>
									<li>专业2</li>
									<li>专业3</li>
									<li>专业4</li>
								</ul>
							</div>
						</div>
							</div>
						</div> -->
						<!-- <div class="prolistApplyInner clearfix">
						<h2>专业</h2>

				<div class="buttProject selectW">
							<input type="text" name="" id="" value="" placeholder="       专业名称" readonly="readonly" unselectable="on" onFocus="this.blur()"/>
							<span class="selBtn"></span>
							<div class="selectDown">
								<ul>
									<li>专业1</li>
									<li>专业2</li>
									<li>专业3</li>
									<li>专业4</li>
								</ul>
							</div>
						</div>
						</div> -->
						<!-- 	<div class="prolistApplyInner clearfix">
					
<div class="prolistApplyInner clearfix">
						<h2>性别</h2>
				<div class="buttProject selectW">
							<input type="text" name="" id="" value="" placeholder="       性别" readonly="readonly" unselectable="on" onFocus="this.blur()"/>
							<span class="selBtn"></span>
							<div class="selectDown">
								<ul>
									<li>男</li>
									<li>女</li>
								
								</ul>
							</div>
						</div>
						</div></div> -->
			
						
						<div class="prolistApplytxt">
							
						
							<input type="submit" name="prolistApplySure" id="prolistApplySure" value="确认" />
							</form>
						</div>
					</div>
					
				</div>
				
			<div id="footer">
					<p>Copyright ©2012 - 2017 ky319.com All Rights Reserved. 沪ICP备14006183号</p>
				</div>
				
			</div>
		</div>
		<!--Main End!-->
		
	</body>
</html>
