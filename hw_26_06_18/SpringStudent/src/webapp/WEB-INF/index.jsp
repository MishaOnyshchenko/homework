<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>

<h3>${message}</h3>

<div>
    <table border="1" cellspacing="0" cellpadding="7">
        <caption>Full list of students</caption>
        <tr align="center">
            <th>name</th>
            <th>surname</th>
            <th>gender</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr align="center">
                <td>${student.name}</td>
                <td>${student.surname}</td>
                <td>${student.gender}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<div>
    <p>
        <a href="/go"><big>Edit list of students</big></a>
    </p>
</div>

</body>
</html>
