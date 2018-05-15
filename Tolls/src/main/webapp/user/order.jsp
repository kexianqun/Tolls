<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
	<title>用户预约 </title>
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
		 <td><a href="../user/register.jsp">注册</a>|</td>
         <td><a href="../manager/login.jsp">管理员登录</a></td>
       </tr>
      </table>
      <br>
      <hr>
	<div class="appointment-w3">
		<form action="#" method="post">
			<div class="personal">
				<h2>User Order</h2>
				
				<div class="main">
					<div class="form-left-w3l">

						<input type="text" id="username" class="top-up" name="username" placeholder="用户名 " required="">
						
					</div>
					<div class="form-right-w3ls">

						<input type="text" id="plateNumber" class="top-up" name="plateNumber" placeholder="车牌号 " required="">
						<div class="clearfix"></div>
					</div>
				</div>
				
               <div class="main">

					<div class="form-left-w3l">
						<select class="form-control" id="intoll">
							<option value="">入口收费站</option>
							<option>清河北</option>
							<option>西三旗</option>
							<option>上清</option>
							<option>上清西</option>
							<option>上清东</option>
					    </select>
					</div>
					<div class="form-right-w3ls">
						<select class="form-control" id="outtoll">
							<option value="">出口收费站</option>
							<option>清河北</option>
							<option>西三旗</option>
							<option>上清</option>
							<option>上清西</option>
							<option>上清东</option>
					    </select>
					</div>
				</div>

				
			
				<div class="main">
					<div class="form-left-w3l">
                        <input type="text" id="description" class="top-up" name="description" placeholder="货物描述 " required="">

						<div class="clear"></div>
					</div>
					<div class="form-right-w3ls ">

						<input id="passtime" name="passtime" type="text" placeholder="通过时间" required="">
                        <div class="clear"></div>
					</div>
				</div>
				
				<div class="main">

					<div class="form-left-w3l">
                        <input name="addPicture" type="file" class="" />
					</div>
					<div class="form-right-w3ls ">

						<input type="text" id="tel" class="top-up" name="tel" placeholder="电话 " required="">
						<div class="clearfix"></div>
					</div>
				</div>
			
			<div class="btnn">
				<input type="button" value="预约" onclick="addorder()">
			</div>
			</div>
		</form>
	</div>
	<div class="copy">
		<p>&copy;高速公路绿通车收费站预约通行系统</p>
	</div>
	<!-- //js -->
	<script type='text/javascript' src='../js/jquery-2.2.3.min.js'></script>
    <script type='text/javascript' src='../js/order.js'></script>
	<!--// js -->
	<!-- Calendar -->
	<script src="../js/jquery-ui.js"></script>
	<script>
		$(function () {
			$("#passtime,#ordertime,#datepicker2,#datepicker3").datepicker({dateFormat: "yy-mm-dd"});
		});
	</script>
	<!-- Calendar -->
	

</body>
</html>
