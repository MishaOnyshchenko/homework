<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi</title>
</head>
<body bgcolor="#bc8f8f">
<h1>Your students ${names}</h1>
<br/>

<form action="TestServlet" method="get">
    <input type = "text" name="addName" placeholder="add_name">
    <input type="submit" value="add" name="submit">
</form>
<ol>
    <c:forEach var="names" items="${names}">
        <li>${names}</li>
    </c:forEach>
</ol>
<br/>
<br/>

<h3>Delete him ${names}</h3>
<br/>
<form action="TestServlet" method="get">
    <input type = "text" name="delName" placeholder="delete_name">
    <input type="submit" value="delete" name="submit">
</form>

<ul>
    <C:forEach var = "name" items="${names}">
        <li>${name}</li>
    </C:forEach>
</ul>


<form action="TestServlet" method="get">
    <input type="text" name="print" placeholder="type_something">
    <input type = submit value="send" name="submit">
</form>


</body>
</html>
