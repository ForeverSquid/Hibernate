<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'top.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<%@ include file="Page/top.jsp"%>

	<h2>&nbsp;&nbsp;人员登录：</h2>
	<img src="image/biankuang.png" height="40" />
	<h3>住户登录:</h3>
	<form name="form1" id="form1" action="send!houstLogin" method="post">
		<input type="text" name="huzhu_name" id="huzhu_name" /> <br/>
		<input type="password" name="password" id="password" /><br/> 
		<input type="submit" value="登录" />
	</form>
	<img src="image/biankuang.png" height="40" />
	
	<h3>物业管理人员登录:</h3>
	<form name="form1" id="form1" action="send!vipLogin" method="post">
		<input type="text" name="guanli_name" id="guanli_name" /> <br/>
		<input type="password" name="guanli_password" id="guanli_password" /><br/> 
		<input type="submit" value="登录" />
	</form>
	<img src="image/biankuang.png" height="40" />

	<!-- 	<a href="user1!add">dianji</a> -->

</body>
</html>
