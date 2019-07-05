<%@page import="java.util.List"%>
<%@page import="com.hm_ms.bean.StudentHomeWork"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>3项目列表</title>
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
<!-- 					<h4>作业列表</h4> -->
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
						<h3><a href="#">学生姓名<i></i></a></h3>
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
		<!-- 			<div class="indexBanner"><img src="images/banner1.jpg"/></div> -->
					<div class="prolistHead clearfix">
						<a class="prolist1 active" href="3project_list.html" target="_self">作业列表</a>
					</div>
					<div class="prolistSearch clearfix">
						<div class="prolistSearchW">
<!-- 							<div class="selectW">
								<input type="text" name="" id="" value="" readonly="readonly" placeholder="题目" unselectable="on" onFocus="this.blur()"/>
								<span class="selBtn"></span>
								<div class="selectDown">
									<ul>
										<li>项目1</li>
										<li>项目2</li>
										<li>项目3</li>
										<li>项目4</li>
									</ul>
								</div>
							</div> -->
							
						</div>
						<div class="prolistSearchW">
						<form action="serchStuPerHomework" method="post">
							<input type="text" name="context" id="" value="" placeholder="搜索 题目名/题目内容/作业状态"/>
							<input type="submit" class="searchBtn" name="" id="" value="" />
							</form>
						</div>
					</div>
					<div class="prolist">
					<%String stuId = (String)request.getAttribute("stuId"); %>
<%
   List <StudentHomeWork>list = (List)request.getAttribute("student");
%>	
						<table border="1" cellspacing="0" cellpadding="0" border-collapse="collapse" width="100%">
							<tr>
							<th><i>ID</i></th>
							<th><i>题目名</i></th>
							<th>题目号</th>
							<th width="32%">题目内容</th>
							<th width="12.222%">作业状态</th>
							<th width="18.333%">操作</th>
							</tr>
							<%
							for(StudentHomeWork s : list){
							%>
							<tr>
							<td><%=s.getHmId() %></td>
							<td><%=s.getProblemTitle() %></td>
							<td><%=s.getProblemId() %></td>
							<td><%=s.getProblemContent() %></td>
							<td><%if(s.isSubmitState()==true){
								out.print("作业已提交");
								}
							     if(s.isSubmitState()==false){
							    	 out.print("作业未提交");
							     }
								%></td>
								<td><a class="prolist2" href="openHomeWork?stuId=<%=stuId%>&hmId=<%=s.getHmId()%>">查看详情</a></td>
							</tr>
 <%} %>
<!-- 							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>未提交</td><td><span>加入收藏</span></td></tr> -->
<!-- 							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>收码</td><td><span>加入收藏</span></td></tr>
							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>收码</td><td><span>加入收藏</span></td></tr>
							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>收码</td><td><span>加入收藏</span></td></tr>
							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>收码</td><td><span>加入收藏</span></td></tr>
							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>收码</td><td><span>加入收藏</span></td></tr>
							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>收码</td><td><span>加入收藏</span></td></tr>
							<tr><td>136</td><td>支付宝</td><td>0.400</td><td><p>www.taobao.com</p></td><td>收码</td><td><span>加入收藏</span></td></tr> -->
						</table>
						
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
							
							<input type="text" name="" id="" value="" />
							<input class="searchBtn" type="submit" name="" id="" value="跳转" />
						</div>
						
					</div>
					
						
				</div>
				
				<div id="footer">
					<p>Copyright ©2019 - 2019 广西民族大学软件工程 All Rights <a href="http://www.17sucai.com/" title="17sucai">Reserved</a><!-- . ICP备17077179号</p> -->
				</div>
				
			</div>
		</div>
		<!--Main End!-->
	</body>
</html>
