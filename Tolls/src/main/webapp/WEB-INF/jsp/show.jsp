<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1" cellpadding="0" cellspacing="0" width="50%">
		<tr align="center">
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${sessionScope.list }" var="f">
			<tr align="center">
				<td>${f.id }</td>
				<td>${f.name }</td>
				<td>${f.age }</td>
				<td><a href="del?id=${f.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>