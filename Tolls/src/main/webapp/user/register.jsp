<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
	<title>用户注册 </title>
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
	<link href="../css/style.css" rel='stylesheet' type='text/css' media="all">
	<!--//style sheet end here-->
	<!-- Calendar -->
	<link rel="stylesheet" href="../css/jquery-ui.css" />
	<!-- //Calendar -->
	<link href="../css/wickedpicker.css" rel="stylesheet" type='text/css' media="all" />
	<!-- Time-script-CSS -->

	<link href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
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
	<div class="appointment-w3">
		<form action="#" method="post">
			<div class="personal">
				<h2>User Register</h2>
				
				<div class="main">
					<div class="form-left-w3l">

						<input type="text" id="username" class="top-up" name="username" placeholder="用户名 userName" required="">
						
					</div>
					<div class="form-right-w3ls">

						<input type="password" id="password" class="top-up" name="password" placeholder="密码 password" required="">
						<div class="clearfix"></div>
					</div>
				</div>
				
				<div class="main">
					<div class="form-left-w3l" id="sex">
                        &nbsp;&nbsp;&nbsp;性别&nbsp;:
						<input type="radio" name="gender" placeholder="性别 gender" required="" value="男">男
						<input type="radio" name="gender" placeholder="性别 gender" required="" value="女">女
					</div>
					<div class="form-right-w3ls ">

						<input class="text" id="address" type="text" name="address" placeholder="住址 address" required="">
						<div class="clearfix"></div>
					</div>
				</div>
				
			
			
				<div class="main">
					<div class="form-left-w3l">
						<%--<input id="birthday" name="Text" type="text" placeholder="出生日期 birthday" required="">--%>
						<input id="birthday" name="Text" type="text" placeholder="出生日期 birthday " required="">

						
						
						<div class="clear"></div>
					</div>
					<div class="form-right-w3ls ">

						<input type="text" id="tel-phone" class="top-up" name="tel" placeholder="电话 tel" required="">
						<div class="clearfix"></div>
					</div>
				</div>
				
				<div class="main">

					<div class="form-left-w3l">

						<input type="text" id="idNumber" class="top-up" name="idNumber" placeholder="身份证号 idNumber" required="">
					</div>
					<div class="form-right-w3ls ">

						<input type="text" id="dlNumber" class="top-up" name="dlNumber" placeholder="驾照编号 dlNumber" required="">
						<div class="clearfix"></div>
					</div>
				</div>
				
			
			
			<div class="btnn">
				<input type="button" onclick="register()" value="注册">
			</div>
			</div>
		</form>
	</div>
	<div class="copy">
		<p>&copy;高速公路绿通车收费站预约通行系统</p>
	</div>
	<!-- js -->
	<script type='text/javascript' src='../js/jquery-2.2.3.min.js'></script>
    <script type='text/javascript' src='../js/register.js'></script>
	<!-- //js -->
	<!-- Calendar -->
	<script src="../js/jquery-ui.js"></script>
	<script>
		$(function () {
			$("#birthday").datepicker({dateFormat: "yy-mm-dd"});
		});
	</script>
	<!-- //Calendar -->
	

</body>
</html>
