<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="java.util.List"%>
<%@page import="com.hm_ms.bean.Teacher"%>
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
					<h4>教师列表</h4>
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
					<div class="prolistHead clearfix">
						<a class="prolist1 active" href="TeacherPage" target="_self">教师列表</a>
						<a class="prolist2" href="AddTeacherPage">添加教师</a>
					</div>
					<div class="prolistSearch clearfix">
						<!-- <div class="prolistSearchW">
							<div class="selectW">
								<input type="text" name="" id="" value="" readonly="readonly" placeholder="项目名称" unselectable="on" onFocus="this.blur()"/>
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
							
						</div> -->
						<form action="findTeacher" method="post">
						<div class="buttOper blacklist clearfix">
						<div class="buttProject selectW">
							<input type="text" name="teaId" id="" value="" placeholder="教师工号"/>
						</div>
						
						<div class="prolistSearchW">

							<input type="text" name="teaName" id="" value="" placeholder="教师姓名"/>
							<input type="submit" class="searchBtn" name="" id="" value="" />  
					
					
					</div>
							</form>
						</div>
						</div>
					</div>
				
						
								
						<div class="buttOper blacklist clearfix">
						<div class="buttChoose blacklistChoose clearfix">
<!-- 							<a href="javascript:">删除已选</a> -->
	<%
   List <Teacher>list = (List)request.getAttribute("teacher");
%>				
					</div></div>
					<div class="prolist buttW">
						<table border="1" cellspacing="0" cellpadding="0" border-collapse="collapse" width="100%">
							<tr>
							<th width="20%">工号</th>
							<th width="20%">教师姓名</th>
							<th width="20%">所属学院</th>
							<th width="20%">班级</th>
							<th>操作</th>
							</tr>
							<%
							for(Teacher tea : list){
							%>
							<tr>
							<td><%=tea.getTeacherId() %></td>
							<td><%=tea.getTeacherName() %> </td>
							<td><%=tea.getCollegeName() %> </td>
							<td><%=tea.getClassesName() %></td>
							<td>
							<a class="prolist2" href="openAlterTeacher?teaId=<%=tea.getTeacherId()%>&teaName=<%=tea.getTeacherName()%>
							&colName=<%=tea.getCollegeName()%>&classesName=<%=tea.getClassesName() %>">修改教师信息</a>
							<a class="prolist2" href="openDeleteTeacher?teaId=<%=tea.getTeacherId()%>">删除教师信息</a>
							</td>
							</tr>
							<%
							}
							%>
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
					<p>Copyright ©2012 - 2017 17sucai.com All Rights <a href="http://www.17sucai.com/" title="17sucai">Reserved</a>. 苏ICP备17077179号</p>
				</div>
				
			</div>
		</div>
		<!--Main End!-->
	</body>
</html>
