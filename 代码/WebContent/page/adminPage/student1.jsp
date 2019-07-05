<%@page import="java.util.List"%>
<%@page import="com.hm_ms.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<%
	   request.setCharacterEncoding("gb2312");
	%>
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
					<h4>项目列表</h4>
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
						<a class="prolist1 active" href="student.html" target="_self">学生列表</a>
						<a class="prolist2" href="AddStudentPage">添加学生</a>
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
<form action="findStudent" method="post">
						<div class="buttOper blacklist clearfix">
						<div class="buttProject selectW">
							<input type="text" name="stuId" id="" value="" placeholder="学生学号"/>
						</div>
						
						<div class="prolistSearchW">

							<input type="text" name="stuName" id="" value="" placeholder="学生姓名"/>
							<input type="submit" class="searchBtn" name="" id="" value="" />  
					
					
					</div>
							
						</div>
						</form>
						</div>
					</div>
				
						
								
						<div class="buttOper blacklist clearfix">
						<div class="buttChoose blacklistChoose clearfix">
<!-- 							<a href="javascript:">删除已选</a> -->
<%
   List <Student>list = (List)request.getAttribute("student");
%>				
					</div></div>
					<div class="prolist buttW">
						<table border="1" cellspacing="0" cellpadding="0" border-collapse="collapse" width="100%">
							<tr>
<!-- 							<th ></th> -->
							<th width="18%">学号</th>
							<th >姓名</th>
							<th width="20%"> 性别</th>
							<th>学院</th>
							<th width="12.222%">班级</th>
							<th>操作</th>
							</tr>
							<%
							for(Student s : list){
							%>
							<tr>
<!-- 							<td><i class="active"></i></td> -->
							<td><%=s.getStudentId() %></td>
							<td><%=s.getStudentName() %></td>
							<td><%=s.getStuSex() %></td>
							<td><%=s.getCollegeName() %></td>
							<td><%=s.getClassesName() %></td>
							<td>
							<a class="prolist2" href="openAlterStudent?stuId=<%=s.getStudentId()%>
							&stuName=<%=s.getStudentName() %>&stuSex=<%=s.getStuSex() %>&colName=<%=s.getCollegeName() %>
							&classesName=<%=s.getClassesName() %>">修改学生</a>
							<a class="prolist2" href="openDeleteStudent?stuId=<%=s.getStudentId()%>">删除学生</a></td>
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
