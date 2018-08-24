<%@ page import="com.studentsList.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Studlist</title>
</head>
<body>
<h1>Show all students</h1>
<%
    List<Student> studlist = com.studentsList.AccessStudents.createList();
    for (Student s: studlist) {
        out.println("<br/>" + s.getId() + ". " + s.getName() + " " + s.getSurname());
    }
%>
</body>
</html>
