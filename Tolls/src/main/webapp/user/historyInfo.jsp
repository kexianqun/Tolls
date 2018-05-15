<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
	<title>历史信息 </title>
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
	<link href="../css/style3.css" rel='stylesheet' type='text/css' media="all">
	<!--//style sheet end here-->
	<!-- Calendar -->
	<link rel="stylesheet" href="../css/jquery-ui.css" />
	<!-- //Calendar -->
	<link href="../css/wickedpicker.css" rel="stylesheet" type='text/css' media="all" />
	<!-- Time-script-CSS -->

	<link href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
</head>
<style>
  table {border:1px;}
</style>
<body>
	<h1 class="header-w3ls" color="#fff">
	高速公路绿通车收费站预约通行系统</h1>
      <table1 class="top" align="right">
       <tr>
         <td><a href="../index.jsp">首页</a>|</td>
         <td><a href="../user/login.jsp">用户登录</a>|</td>
		 <td><a href="../user/register.jsp">注册</a>|</td>
         <td><a href="../manager/login.jsp">管理员登录</a></td>
		 <td><a href="../user/order.jsp">预约</a>|</td>
       </tr>
      </table>
      <div id="blank"></div>
      <br>
      <hr width="1500">
      <br>
	<div class="appointment-w3">
		<form action="#" method="post">
			<div class="personal">
				<h2 align="center">History Infomation</h2>
				<br><br>
				<div class="main">
					<table border="1px solid black" cellspacing="0" cellpadding="3" align="center" height="80" width="580" bordercolor="pink">
		<dl>
		<tr><td>用&nbsp;户&nbsp;名</td>
		    <td>车&nbsp;牌&nbsp;号</td>
		    <td>入口收费站</td>
		    <td>出口收费站</td>
		    <td>预约时间</td>
	<td>通过时间</td>
	<td>电&nbsp;&nbsp;&nbsp;&nbsp;话</td>
	<td>信&nbsp;用&nbsp;分</td>
	<td>审&nbsp;&nbsp;&nbsp;&nbsp;核</td>
	<td>状&nbsp;&nbsp;&nbsp;&nbsp;态</td>
	<td>货&nbsp;物&nbsp;描&nbsp;述</td>
		</tr>
		 <dd>								
				<tr>
					    <td>&nbsp;&nbsp;</td>
					    <td>&nbsp;&nbsp;</td>
					    <td>&nbsp;&nbsp;</td>
					    <td>&nbsp;&nbsp;</td>
					     <td>&nbsp;&nbsp;</td>
					      <td>&nbsp;&nbsp;</td>
					       <td>&nbsp;&nbsp;</td>
					        <td>&nbsp;&nbsp;</td>
					         <td>&nbsp;&nbsp;</td>
					          <td>&nbsp;&nbsp;</td>
					          <td>&nbsp;&nbsp;</td>
					</tr>
				  	
	 </dd> 
	  
		</dl>
		</table>
				</div>
			</div>
		</form>
	</div>
	<div class="copy">
		<p>&copy;高速公路绿通车收费站预约通行系统</p>
	</div>
	<!-- js -->
	<script type='text/javascript' src='../js/jquery-2.2.3.min.js'></script>
	<!-- //js -->
	<!-- Calendar -->
	<script src="../js/jquery-ui.js"></script>
	<script>
		$(function () {
			$("#datepicker,#datepicker1,#datepicker2,#datepicker3").datepicker();
		});
	</script>
	<!-- //Calendar -->
	

</body>
</html>
