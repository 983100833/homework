<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>添加作业</title>
		<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
		
		<!--Main Start!-->
		<div id="main">
			<div class="content">
				<div class="contBox bgf9">
					<div class="indexBanner"><img src="images/banner1.jpg"/></div>
					<div class="prolistHead clearfix">
						<a class="prolist1" href="HomeWorkPage" target="_self">作业信息</a>
						<a class="prolist2 active" href="AddHomeWorkPage" target="_self">添加作业</a>
				<!--Main Start!-->
		<div id="main">
			<div class="content">
				<div class="contBox bgf9">
					<div class="indexBanner"><img src="images/banner1.jpg"/></div>
					<div class="prolistHead clearfix">
					</div>
				<!-- 	<div class="prolistApplyH clearfix">
						<ul>
							<li class="active"><a href="4project_apply.html" target="_self"><i class="proAppIcon1"></i>接收短信</a></li>
							<li><a href="5project_apply_send.html" target="_self"><i class="proAppIcon2"></i>发送短信</a></li>
							<li><a href="6project_apply_sendandreceive.html" target="_self"><i class="proAppIcon3"></i>发送/接收短信</a></li>
						</ul>
					</div> -->
					<form action="addHomeWork" method="post">
					<div class="prolistApplyW">
						<div class="prolistApplyInner clearfix">
							<h2>作业号</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmId" id="" value="" placeholder="" />
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>发布日期</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmStart" id="" value="" placeholder="yyyy-mm-dd"/>
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>截止日期</h2>
							<div class="prolistApplyCont">
								<input type="text" name="hmEnd" id="" value="" placeholder="yyyy-mm-dd"/>
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>作业内容</h2>
							<div class="prolistApplyCont">
								<input type="text" name="problemContent" id="" value="" placeholder=""/>
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>作业标题</h2>
							<div class="prolistApplyCont">
								<input type="text" name="problemTitle" id="" value="" placeholder=""/>
							</div>
						</div>
						<div class="prolistApplytxt">
							
						
							<input type="submit" name="prolistApplySure" id="prolistApplySure" value="确认" />
						</div>
</form>
		
	</body>
</html>
