<%-- 
    Document   : add
    Created on : Jul 29, 2015, 8:10:58 AM
    Author     : sshakya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/contact/add">
            <input type="text" name="name" placeholder="Enter your Name"/>
            <input type="submit" value="send" name="submit"/>
            
        </form>
    </body>
</html>
