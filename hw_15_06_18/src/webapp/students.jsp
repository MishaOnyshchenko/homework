<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.studentsList.model.Student" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Studlist</title>
    </head>

    <body>
        <%
            List<Student> studlist = com.studentsList.AccessStudents.createList();
            application.setAttribute("studlist", studlist);
        %>

        <%--<h1>Hi, ${name}</h1>--%>
        <%--<header>--%>
            <%--<form action="com.studentsList.servlets.MyServlet" method="get">--%>
                <%--name: <input type="text" name="name" placeholder="name">--%>
                <%--surname <input type="text" name="surname" placeholder="surname">--%>
                <%--<input type="submit" name="submit">--%>
            <%--</form>--%>
        <%--</header>--%>

        <main>
            <div>
                <table border="1" cellspacing="0" cellpadding="7">
                    <caption>All students</caption>
                    <tr align="center">
                        <th>id</th>
                        <th>name</th>
                        <th>surname</th>
                        <th>gender</th>
                        <th>phone</th>
                    </tr>
                    <c:forEach var = "student" items="${studlist}">
                        <tr align="center">
                            <td>${student.id}</td>
                            <td>${student.name}</td>
                            <td>${student.surname}</td>
                            <td>${student.gender}</td>
                            <td>${student.phone}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <br/>

            <nav>
                <h1>Show students by gender</h1>
                <form action="com.studentsList.servlets.MyServlet" method="get">
                    m <input type="radio" name = "gender" value="m" checked>
                    w <input type="radio" name="gender" value="w">
                    <input type="submit" name="send">
                </form>
            </nav>

            <div>
                <table border="1" cellspacing="0" cellpadding="7">
                    <tr align="center">
                        <th>id</th>
                        <th>name</th>
                        <th>surname</th>
                        <th>gender</th>
                        <th>phone</th>
                    </tr>

                    <c:forEach var = "student" items="${studlist}">
                        <c:if test = "${param.gender.equals(student.gender)}">
                            <tr align="center">
                                <td>${student.id}</td>
                                <td>${student.name}</td>
                                <td>${student.surname}</td>
                                <td>${student.gender}</td>
                                <td>${student.phone}</td>
                            </tr>
                        </c:if>
                    </c:forEach>
                </table>
            </div>
        </main>

    </body>

</html>
