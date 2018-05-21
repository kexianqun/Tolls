<%@ page language="java" import="com.wh.tolls.entity.user" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
user user = (com.wh.tolls.entity.user) session.getAttribute("user");
int uid;
String userid = "";
if(user!=null){
    uid = user.getUserId();
    userid = String .valueOf(uid);
}else{
	response.sendRedirect(basePath+"/index.jsp");
}
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
<input type="hidden" name="" id="userid" value="<%=userid%>">
	<h1 class="header-w3ls" color="#fff">
	高速公路绿通车收费站预约通行系统</h1>
      <table class="top" align="right">
		  <tr>
			  <td><a href="../index.jsp">首页</a>|</td>
			  <td><a href="../user/order.jsp">预约</a>|</td>
			  <td><a href="../user/historyInfo.jsp">预约记录</a>|</td>
			  <td><a href="../user/modifyInfo.jsp">用户信息</a>|</td>
			  <td><a href="../user/logout.jsp">退出</a></td>
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
					<table border="1px solid black" cellspacing="0" cellpadding="3" align="center" height="80" width="580" bordercolor="pink" id="order_tab">
		<tr><td>用&nbsp;户&nbsp;名</td>
		    <td>车&nbsp;牌&nbsp;号</td>
		    <td>入口收费站</td>
		    <td>出口收费站</td>
		    <td>预约时间</td>
	<td>通过时间</td>
	<td>电&nbsp;&nbsp;&nbsp;&nbsp;话</td>
	<td>审&nbsp;&nbsp;&nbsp;&nbsp;核</td>
	<td>状&nbsp;&nbsp;&nbsp;&nbsp;态</td>
	<td>货&nbsp;物&nbsp;描&nbsp;述</td>
		</tr>
		</table>
				</div>
			</div>
			<div class="pagging">
				<div class="left">
					<span id="mNum_span"></span>
					<span>当前第</span>
					<span id="curpage_span"></span>
					<span>页，</span>
					<span>共</span>
					<span id="pages_span"></span>
					<span>页</span>
				</div>
				<div class="right">
					<a href="javascript:void(0)" onclick="previous()">Previous</a>
					<a href="javascript:void(0)" onclick="firstPage()">1</a>
					<a href="javascript:void(0)" onclick="secondPage()">2</a>
					<span>...</span>
					<a href="javascript:void(0)" onclick="nextPage()">Next</a>
					<span><label>转到</label>
                                <input type="text" style="width:50px;" id="turnpage"/>
                                    <label>页</label></span>
					<a href="javascript:void(0)" onclick="turnPage()">转</a>
				</div>
			</div>
		</form>
	</div>
	<div class="copy">
		<p>&copy;高速公路绿通车收费站预约通行系统</p>
	</div>
	<!-- js -->
	<script type='text/javascript' src='../js/jquery-2.2.3.min.js'></script>
	<script type='text/javascript' src='../js/historyInfo.js'></script>
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
