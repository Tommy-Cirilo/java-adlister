<%-- This is a page directive, that will apply to the entire page --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<%--Use request of implicit object check using the request.GETparameter("username")--%>
<head>
    <%--<jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="LogIn" />
    </jsp:include>--%>
</head>
<body>
<c: choose>

</c:>
<form action="POST">
    <label for="firstName">Username</label><br>
    <input type="text" id="firstName" name="firstName"><br>
    <label for="password">Password</label>
    <input type="text" id="password" name="password"><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
