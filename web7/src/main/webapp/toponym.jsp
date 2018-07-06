<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
    <%
        String[] cities = {"Mumbai","Singapore","Philadelphia"};
        pageContext.setAttribute("myCities", cities);
    %>
<c:forEach var = "tempCity" items ="${myCities}">
    ${tempCity}<br/>
</c:forEach>

</body>
</html>
