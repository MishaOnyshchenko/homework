<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>

<h3>Add or delete students</h3>

<ol>
    <c:forEach items="${students}" var="student">
        <li>${student.name} ${student.surname}, ${student.gender}</li>
    </c:forEach>
</ol>

<form action="/show/add" method="get" modelAttribute="student">
    <input type="text" name = "name" placeholder="name">
    <input type="text" name = "surname" placeholder="surname">
    <input type="text" name = "gender" placeholder="gender">
    <input type="submit" value="add">
</form>
<br/>

<a href="/show/delAll">Delete all students</a>
<br/><br/>

<form action="/show/del" method="get" modelAttribute="student">
    <input type="text" name = "surname" placeholder="surname">
    <input type="submit" value="del">
</form>
<br/>




</body>
</html>