<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<title>管理员登录 </title>
	<!-- Meta tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Flight Booking Form Responsive Widget, Audio and Video players, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design"
	/>
	<script type="application/x-javascript">
		addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }
	</script>
	<!-- Meta tags -->
	<!--stylesheets-->
	<link href="../css/style2.css" rel='stylesheet' type='text/css' media="all">
	<!--//style sheet end here-->
	

	<link href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
	<style>
        
	</style>
</head>

<body>
    
	<h1 class="header-w3ls" color="#fff">
	高速公路绿通车收费站预约通行系统</h1>
      <table align="right">
       <tr>
         <td><a href="../index.jsp">首页</a>|</td>
         <td><a href="../user/login.jsp">用户登录</a>|</td>
         <td><a href="../manager/login.jsp">管理员登录</a></td>
       </tr>
      </table>
      <br>
      <hr>
	
	<div class="appointment-w3" align="center">
		<form action="#" method="post">
			<div class="personal">
				<h2>Manager Login</h2>
				<div class="main">
					<div class="formNew">
                        <table>
                        <tr>
                         <td>用户名：</td>
                         <td><input type="text" class="top-up" name="username" placeholder="username" required=""></td>
                        </tr>
                        <tr>
                         <td>密码：</td>
                         <td widtth="230"><input type="text" class="top-up" name="password" placeholder="password" required=""></td>
                        </tr>
						
					    </table>
					</div>
				</div>
			<div class="btnn">
				<input type="submit" value="登陆">
			</div>
			</div>
		</form>
	</div>
	<div class="copy">
		<p>高速公路绿通车收费站预约通行系统</p>
	</div>
	<!-- js -->
	<script type='text/javascript' src='../js/jquery-2.2.3.min.js'></script>
	<!-- //js -->
	
</body>
</html>
