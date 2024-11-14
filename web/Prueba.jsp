<%@page import="Modelo.Empresa"%>
<%
    Empresa e = new Empresa();
    e= (Empresa )request.getAttribute("e");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=e.getRazonSocial()%></h1>
    </body>
</html>
