<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>修改账户</title>
		<link rel="stylesheet" type="text/css" href="css/reset.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
		<%
		   String accountId = (String)request.getAttribute("accountId");
		String accountPwd = (String)request.getAttribute("accountPwd");
		String accountType = (String)request.getAttribute("accountType");
		%>
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
					<form action="updateAccount" method="post">
					<div class="prolistApplyW">
						<div class="prolistApplyInner clearfix">
							<h2>帐号</h2>
							<div class="prolistApplyCont">
								<input type="text" name="accountId" id="" value="<%=accountId%>" placeholder="" readonly="readonly""/>
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>密码</h2>
							<div class="prolistApplyCont">
								<input type="text" name="accountPwd" id="" value="<%=accountPwd%>" placeholder=""/>
							</div>
						</div>
						<div class="prolistApplyInner clearfix">
							<h2>类别</h2>
							<div class="prolistApplyCont">
								<input type="text" name="accountType" id="" value="<%=accountType%>" placeholder=""/>
							</div>
						</div>
						<div class="prolistApplytxt">
							
						
							<input type="submit" name="prolistApplySure" id="prolistApplySure" value="确认" />
						</div>
</form>
						</div>
						</div>

		
	</body>
</html>
