<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Spring MVC Form</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h2>Registered User List Information(User)</h2>
   	<table>
   	<tr>
        <td>User.ID </td>
        <td>User.Name </td>
        <td>User.Password </td>
        <td>User.Age </td>
    </tr>
   	<c:forEach items="${userList}" var="user">
	   	<c:if test="${user.name == 'yinliqing' && user.age == 28}">
		<tr>
	        <td>${user.id}<c:out value="${user.id}"/></td>
	        <td>${user.name}</td>
	        <td>${user.password}</td>
          <td>${user.age}</td>
	    </tr>
	    </c:if>
	</c:forEach>

</table>


</body>
</html>