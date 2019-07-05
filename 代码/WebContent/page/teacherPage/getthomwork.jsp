
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@page import="com.hm_ms.bean.*"%>

<!DOCTYPE html>
<html>
	<head>
	<% ArrayList<Student> stulist=(ArrayList<Student>)request.getAttribute("stulist");
	    HomeWork hoWork=(HomeWork)request.getAttribute("hoWork");
	    %>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>接收作业</title>
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
					<!-- <h4>专属对接</h4>
					<div class="contact topItem">
						<h3><a href="#">联系我们<i></i></a></h3>
						<div class="dropdown">
							<a href="#">联系我们</a>
							<a href="#">联系我们</a>
							<a href="#">联系我们</a>
						</div>
					</div> -->
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
					<!-- <div class="indexBanner"><img src="images/banner1.jpg"/></div> -->
					<div class="buttMyH clearfix">
						<div class="buttMyHL">
							<ul class="buttHead clearfix">
								<li><a href="homework.html" target="_self"><i class="buttIcon1"></i>发布作业</a></li>
								<li class="active"><a href="gethomework.html" target="_self"><i class="buttIcon2"></i>接收作业</a></li>
								<!-- <li><a href="10butt_auto.html" target="_self"><i class="buttIcon3"></i>批改作业</a></li> -->
								<!-- <li><a href="" target="_self"><i class="buttIcon4"></i>使用说明</a></li> -->
							</ul>
						</div>
						<!-- <div class="buttMyHR clearfix">
							<div class="buttMyProj selectW">
								<input type="text" name="" id="" value="" placeholder="卡商ID" readonly="readonly" unselectable="on" onfocus="this.blur()"/>
								<span class="selBtn"></span>
								<div class="selectDown">
									<ul>
										<li>项目1</li>
										<li>项目2</li>
										<li>项目3</li>
										<li>项目4</li>
									</ul>
								</div>
							</div>
							<div class="buttMySearch">
								<input type="text" name="" id="" value="" placeholder="搜索"/>
								<input class="searchBtn" type="submit" name="" id="" value="" />
							</div>
						</div>
					</div> -->
					
					<!-- <div class="buttMy clearfix">
						<div class="buttMyL">
							<input class="buttMyLSear" type="text" name="" id="" value="" placeholder="需要输入对接的对接码"/>
							<a class="buttMyLBtn" href="">加入专属对接</a>
							<input class="buttMyLChoose" type="checkbox" name="" id="" value="" />当对接无号时，取平台号！
						</div>
						
						<div class="buttMyR">
							<ul>
								<li><a href="">暂停已选对接</a></li>
								<li><a href="">恢复已选对接</a></li>
								<li><a href="">删除已选对接</a></li>
								<li><a href="9butt_my_data.html" target="_self">对接统计</a></li>
								<li><a href="">创建对接</a></li>
							</ul>
						</div>
					</div> -->
					
					<div class="prolist buttW">
						<table border="1" cellspacing="0" cellpadding="0" border-collapse="collapse" width="100%">
							<tbody><tr><th style="width: 10%">操作</th><th style="width: 20%">学生姓名
							</th><th style="width: 30%">学生学号</th><th style="width: 20%">题目名</th><th style="width: 20%">题目号</th></tr>
							<tr>
							<%for(int i=0;i<stulist.size();i++) 
							{%>
							<td><form action="updatehomework?howid=<%=hoWork.getHomeWorkId()%>&stuid=<%=stulist.get(i).getStudentId()%> " method="post">
							<input class="searchBtn" type="submit" name="" id="" value="批改">
							</form></td>
							<td><%=stulist.get(i).getStudentName()%></td><td><%=stulist.get(i).getStudentId()%></td><td> <%=hoWork.getHomeWorkTitle()%></td>
							<td><%=hoWork.getHomeWorkId()%></td><!-- <td>0.1240</td><td>在线98/已用0</td><td>2018/03/20  10:20:52</td><td>1204</td><td>1204</td><td>发短信一毛一条</td><td>未对接</td> --></tr>
<!-- 							<tr><td><i class="active"></i></td><td>136</td><td>124</td><td>支付宝</td><td>142-965427</td> -->
							<%}%><!-- <td>0.2000</td> --><!-- <td>在线98/已用0</td><td>2018/03/20  10:20:52</td><td>97</td><td>97</td><td>发短信一毛一条</td><td>未对接</td> --></tr>
						
						</tbody></table>
						
						<div class="page">
							<em>首页</em>
							<i>上一页</i>
							<a class="active" href="javascript:">1</a>
							<a href="javascript:">2</a>
							<a href="javascript:">3</a>
							<a href="javascript:">4</a>
							<a href="javascript:">5</a>
							<a href="javascript:">6</a>
							<i>下一页</i>
							<em>尾页</em>
							<p>第<span>1</span>页/共<span>20</span>页</p>
							
							<input type="text" name="" id="" value="">
							<input class="searchBtn" type="submit" name="" id="" value="跳转">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</div>

					</div>
					
				</div>
				
				<div id="footer">
					<p>Copyright ©2012 - 2017 ky319.com All Rights Reserved. 沪ICP备14006183号</p>
				</div>
				
			</div>
		</div>
		<!--Main End!-->
		
		
	

</div><div id="ascrail2000" class="nicescroll-rails nicescroll-rails-vr" style="width: 6px; z-index: auto; cursor: default; position: absolute; top: 85px; left: 1914px; height: 781px; display: none; opacity: 0.608999;"><div class="nicescroll-cursors" style="position: relative; top: 0px; float: right; width: 4px; height: 0px; background-color: rgb(17, 174, 232); border: 1px solid rgb(255, 255, 255); background-clip: padding-box; border-radius: 2px;"></div></div><div id="ascrail2000-hr" class="nicescroll-rails nicescroll-rails-hr" style="height: 6px; z-index: auto; top: 860px; left: 0px; position: absolute; cursor: default; display: none; opacity: 0.608999;"><div class="nicescroll-cursors" style="position: absolute; top: 0px; height: 4px; width: 0px; background-color: rgb(17, 174, 232); border: 1px solid rgb(255, 255, 255); background-clip: padding-box; border-radius: 2px; left: 0px;"></div></div></body></html>