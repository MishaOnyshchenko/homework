
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>radio</title>
</head>
<body>

<%= request.getParameter("name")%> <%= request.getParameter("surname")%>

<p>Second way</p>

${param.values()}
<br/>

${param.name} ${param.surname} ${param.language}

</body>
</html>
