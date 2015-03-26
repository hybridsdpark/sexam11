<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
<hr>
	<h1>Language <spring:message code="set"/></h1>
<hr>
	
<form action="locale" method="post">
<select name="lang">
	<option value="ko">한국어</option>
	<option value="ja" selected="selected">일본어</option>
	<option value="zh">중국어</option>

</select>
<input type="submit" value="언어설정"/>


</form>

</body>
</html>