<%--
  Created by IntelliJ IDEA.
  User: Михаил
  Date: 18.06.2018
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Response</title>
</head>
<body>

<%= request.getParameter("name")%> <%= request.getParameter("surname")%>

<p>Second way: </p>
<br/>
The student is confirmed: ${param.values()}
<br/>
The student is confirmed: ${param.name} ${param.surname}
<br/>

<%
    String[] langs = request.getParameterValues("favoriteLanguageC");
    for (String s: langs) {
        out.println("new: " + s + ", ");
    }
%>


</body>
</html>
