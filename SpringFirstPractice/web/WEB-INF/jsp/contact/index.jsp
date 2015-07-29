<%-- 
    Document   : index
    Created on : Jul 29, 2015, 7:47:34 AM
    Author     : sshakya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! from contact </h1>
        
        <c:forEach var="contact" items="${contacts}">
        <li>${contact.firstName} ${contact.lastName}</li>
        </c:forEach>
    </body>
</html>
