<%@ page language="java" import="com.wh.tolls.entity.user" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
user user = (com.wh.tolls.entity.user) session.getAttribute("user");
int uid;
String userid ="";
if(user!=null){
    uid = user.getUserId();
    userid = String.valueOf(uid);
}else{
    response.sendRedirect(basePath+"/index.jsp");
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
	<title>用户信息修改 </title>
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
<input type="hidden" value="<%=userid%>" id="userid">
	<h1 class="header-w3ls" color="#fff">
	高速公路绿通车收费站预约通行系统</h1>
      <table align="right">
		  <tr>
			  <td><a href="../index.jsp">首页</a>|</td>
			  <td><a href="../user/order.jsp">预约</a>|</td>
			  <td><a href="../user/historyInfo.jsp">预约记录</a>|</td>
			  <td><a href="../user/modifyInfo.jsp">用户信息</a>|</td>
			  <td><a href="../user/logout.jsp">退出</a></td>
		  </tr>
      </table>
      <br>
      <hr>
	<div class="appointment-w3">
		<form action="#" method="post">
			<div class="personal">
				<h2>User Info</h2>
				
				<div class="main">
					<div class="form-left-w3l">

						用户名：<input type="text" class="top-up" name="username" placeholder="用户名 userName" required="" id="username">
						
					</div>
					<div class="form-right-w3ls">

						密码：<input type="text" class="top-up" name="password"  required="" id="password">
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="main">
					<div class="form-left-w3l" id="sex">
						性&nbsp;&nbsp;&nbsp;&nbsp;别&nbsp;&nbsp;:
						<input type="radio" name="gender" placeholder="性别 gender" required="" value="男">男
						<input type="radio" name="gender" placeholder="性别 gender" required="" value="女">女
					</div>
					<div class="form-right-w3ls ">

						住址：<input class="text" type="text" name="address" placeholder="住址 address" required="" id="address">
						<div class="clearfix"></div>
					</div>
				</div>
				
			
			
				<div class="main">
					<div class="form-left-w3l">
						生&nbsp;&nbsp;&nbsp;&nbsp;日：<input id="birthday" name="Text" type="text" placeholder="出生日期" required="" id="birthday">
						<div class="clear"></div>
					</div>
					<div class="form-right-w3ls ">
						电话：<input type="text" class="text" name="tel" placeholder="电话 tel" required="" id="telphone">
						<div class="clearfix"></div>
					</div>
				</div>
				
				<div class="main">

					<div class="form-left-w3l">

						身份证：<input type="text" class="text" name="idNumber" placeholder="身份证号 idNumber" required="" id="idno">
					</div>
					<div class="form-right-w3ls ">
						驾照：<input type="text" class="text" name="dlNumber" placeholder="驾照编号 dlNumber" required="" id="dlNumber">
						<div class="clearfix"></div>
					</div>
				</div>
				
			<div class="main">
					<div class="form-left-w3l">
						信用分：<input type="text" class="text" name="credit" placeholder="信用分" required="" readonly="readonly" id="credit">
						
					</div>
					
				</div>
			
			<div class="btnn">
				<input type="button" value="保存" onclick="save()">
			</div>
			</div>
		</form>
	</div>
	<div class="copy">
		<p>&copy;高速公路绿通车收费站预约通行系统</p>
	</div>
	<!-- js -->
	<script type='text/javascript' src='../js/jquery-2.2.3.min.js'></script>
    <script type='text/javascript' src='../js/modifyInfo.js'></script>
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
