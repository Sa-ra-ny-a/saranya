<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty studentList}">
<table>
<tr>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
</tr>

	<c:forEach items="${studentList}" var="studentBean">
	<tr>
	<td>${studentBean.id}</td>
	<td>${studentBean.name}</td>
	<td>${studentBean.address}</td>
	</tr>
	</c:forEach>
	</form>
</table>
</c:if>
</body>
</html>