
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

    <head>
        <title>Hit</title>
    </head>

    <body>
        <h1>Hello peoples</h1>

        <p>Time: <%=new java.util.Date()%></p>

        <p>String to uppercase: <%= new String ("gerarahere").toUpperCase()%></p>

        <p>25 multiplyed to 4 = <%=25*4%></p>

        <p>Is 75 less than 69? <%=75<69%> </p>

        <h3>Hello world of java</h3>
        <%
            for(int i = 1; i < 6; i++){
                out.println("<br/>I really luv2code: " + i);
            }
        %>
        <br/>
        <br/>

    <%!
        String toLowerCase (String data){
            return data.toLowerCase();
        }
    %>
    To lover case "GERARAHERE": <%= toLowerCase(" GERARAHERE.")%>






    </body>

</html>
