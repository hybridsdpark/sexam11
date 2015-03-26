<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/taglib.jspf"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>user.jsp</title>
</head>
<body>
<hr>
	<h1>register 등록</h1>
<hr>
<%-- <spring:message code="required"/> --%>
<form action="register" method="POST">

<label for="name"><spring:message code="label.user.name" text="xxx : "/> </label>
<input id="name" name="name" value="${user.name}" required="required" placeholder="이름은 꼭 입력하세요"/><br>

<label for="age"><spring:message code="label.user.age" text="xxx : "/> </label>
<input id="age" name="age" value="${user.age }" required="required" pattern="[0-9]{1,2}"/><br>


<label for="birthday"><spring:message code="label.user.birthday" text="xxx : "/> </label>
<input id="birthday" name="birthday" value="age" /><br>





<input type="submit" value="등록"/>

<input type ="reset" value="clear"/>

</form>
</body>
</html>