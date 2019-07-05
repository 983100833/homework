<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
   <%@ page import="com.hm_ms.bean.HomeWork"%>
<!DOCTYPE html>
<html>
	<head>
	<% List<HomeWork> homelist=(List<HomeWork>)request.getAttribute("homelist");%>
	<%
		String teaId = (String)request.getAttribute("teaId");
		String teaName = (String)request.getAttribute("teaName");
	%>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>作业管理</title>
		<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
	<%=teaId %>
	<%=teaName %>
		<!--Top Start!-->
		<div id="top">
			<div class="topBar">
				<div class="inner clearfix">
					<!-- <h4>作业管理</h4>
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
					<ul class="buttHead clearfix">
						<li class="active"><a href="AddHomeWork?teaName=<%=teaName %>" target="_self"><i class="buttIcon1"></i>发布作业</a></li>
						<li><a href="getthomwork.jsp" target="_self"><i class="buttIcon2"></i>接收作业</a></li>
						<!-- <li><a href="http://www.qkhtml.com/Case/kyptyh/10butt_auto.html" target="_self"><i class="buttIcon3"></i>批改作业</a></li> -->
						<!-- <li><a href="" target="_self"><i class="buttIcon4"></i>使用说明</a></li> -->
					</ul>
					
					<!-- <div class="buttOper clearfix">
						<div class="buttProject selectW">
							<input type="text" name="" id="" value="" placeholder="项目ID" readonly="readonly" unselectable="on" onFocus="this.blur()"/>
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
						
						<div class="buttSearch">
							<input type="text" name="" id="" value="" placeholder="搜索"/>
							<input class="searchBtn" type="submit" name="" id="" value=""/>
						</div>
						
						<div class="buttChoose clearfix">
							<span class="buttChooseL active">加入已选对接</span>
							<span class="buttChooseR">取消已选对接</span>
						</div>
					</div> -->
					
					<div class="prolist buttW">
						<table border="1" cellspacing="0" cellpadding="0" border-collapse="collapse" width="100%">
							<tr><th style="width: 7%">多选</th><th  style="width: 11%">题目号
							</th><th style="width: 11%">题目名</th><th style="width: 11%">作业开始时间</th>
							<th style="width: 11%">作业结束时间</th><th style="width: 49%">题目大概内容</th></tr>
							<%for(int i=0;i<homelist.size();i++)
								{
								%>
							<tr>
							<td><a href="querystu?hmid=<%=homelist.get(i).getHomeWorkId()%>&teaname=<%=teaName%>">查看详情</a></td>
							<td><%=homelist.get(i).getHomeWorkId()%></td>
							<td><%=homelist.get(i).getHomeWorkTitle()%></td>
							<td><%=homelist.get(i).getStartTime()%></td>
							<td><%=homelist.get(i).getEndTime()%></td>
							<td><%=homelist.get(i).getHomeWorkContent()%></td>
							</tr>
							<% }%>	
							</table>				
						<input class="personSure" type="submit" name="" id="" value="确认"/>
						
						<input class="personSure" type="submit" name="" id="" value="返回"/>
						
						<!-- <div class="page">
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
							
							<input type="text" name="" id="" value="" />
							<input class="searchBtn" type="submit" name="" id="" value="跳转" />
						</div> -->
					</div>
					
				</div>
				
				<div id="footer">
					<!-- <p>Copyright ©2012 - 2017 17sucai.com All Rights <a href="http://www.17sucai.com/" title="17sucai">Reserved</a>. 苏ICP备17077179号</p> -->
				</div>
				
			</div>
		</div>
		<!--Main End!-->
	</body>
</html>
