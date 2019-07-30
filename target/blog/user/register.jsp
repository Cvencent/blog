<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户注册界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/body.css"/>
</head>
<body>
<div class="container">
	<section id="content">
		<form action="${pageContext.request.contextPath}/user/register.action" method="post">
			<h1>用户注册</h1>
			<div>
				<input type="text" placeholder="邮箱" required="" id="email" name="email"/>
			</div>
			<div>
				<input type="password" placeholder="密码" required="" id="password" name="password" />
			</div>
			 <div class="">
				<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>			</div> 
			<div>
				<!-- <input type="submit" value="Log in" /> -->
				<input type="submit" value="注册" class="btn btn-primary" id="js-btn-login"/>

				<!-- <a href="#">Register</a> -->
			</div>
		</form><!-- form -->
		 <div class="button">
			<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>

		</div> <!-- button -->
	</section><!-- content -->
</div>
<!-- container -->


<br><br><br><br>

</body>
</html>
