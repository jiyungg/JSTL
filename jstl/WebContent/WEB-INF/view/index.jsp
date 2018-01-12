<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
</head>
<body>
<% 
List<String> strList = new ArrayList<String>();
strList.add("A");
strList.add("B");
strList.add("C");
strList.add("D");
strList.add("E");
request.setAttribute("strList", strList);
%>
<c:forEach items= "${strList}" var="s" varStatus="vs" step="2">
${vs.index},${vs.count} : ${s}<br>
</c:forEach> 
</body>
</html>