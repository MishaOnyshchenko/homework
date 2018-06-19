
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= request.getParameter("name")%> <%= request.getParameter("surname")%>

<p>Second way</p>
<br/>

The student is confirmed: ${param.values()}
<br/>
The student is confirmed: ${param.name} ${param.surname} ${param.country}


</body>
</html>
