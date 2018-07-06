<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Михаил
  Date: 19.06.2018
  Time: 0:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>base</title>

</head>
<body>

<%= request.getParameter("name")%>
<%= request.getParameter("surname")%>

<p>Second way</p>
<br/>
The student is confirmed ${param.values()}
The student is confirmed ${param.name} ${param.surname}

<table>
    <tr>
        <th>name</th>
        <th>surname</th>
        <th>sex</th>
    </tr>
    <c:forEach var = "student" items ="${studentList}">
        <tr>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <c:if test="${student.sex.equals(\"MAN\")}">
                <td>It's a MAN!</td>
            </c:if>
        </tr>
    </c:forEach>
</table>

</body>
</html>
