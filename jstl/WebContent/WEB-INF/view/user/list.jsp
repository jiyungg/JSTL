<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
유저리스트
<br>
<c:forEach items="${userList}" var="user">
    유저번호 : ${user.uiNo}, 유저이름 : ${user.uiName}, 유저나이 : ${user.uiAge}<br>
</c:forEach>
</body>
</html>