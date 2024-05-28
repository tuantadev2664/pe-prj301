<%-- 
    Document   : list.jsp
    Created on : May 28, 2024, 10:05:56 AM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div >
            <table border="1px" width="50%" >
                <tr>
                    <td>MajorID</td>
                    <td>MajorName</td>
                    <td>LeaderName</td>
                </tr>
                <c:forEach items = "${requestScope.data}" var="c">
                    <c:set var="id" value="${c.majorId}"/>
                    <tr>
                        <td>${id}</td>
                        <td>${c.majorName}</td>
                        <td>${c.leaderName}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
