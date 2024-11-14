<%@page import="Modelo.Empresa"%>
<%boolean v = (boolean)request.getAttribute("v");
Empresa g = (Empresa) request.getAttribute("empresa");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <link href="css/styles_1.css" rel="stylesheet" type="text/css"/>
        <link href="css/styles_2.css" rel="stylesheet" type="text/css"/>
     </head>
    <body>
      <div class="container">

        <header class="header">Encabezado</header>
            <header class="header">

<div> 
<img src="https://github.com/AntoRosaless/WorkMarket/blob/master/web/ima/logo.jpg?raw=true" />
<div>
 
<button class="btn primary"><i class="fas fa-exclamation-circle"></i> Inicio</button>
<button class="btn primary"><i class="fas fa-exclamation-circle"></i> Mapa del sitio</button>
<button class="btn primary"><i class="fas fa-check-circle"></i> Empresas</button>
<button class="btn primary"><i class="fas fa-exclamation-triangle"></i> Profesionales</button>
<button class="btn primary"><i class="fas fa-times-circle"></i>Notificaciones</button>

</header>
        
        <aside class="sidebar-left">
                <nav class="navbar">
                <ul>
                    <li><a href="registrarProfesional.jsp">Registrar Profesional</a></li>
                    <li><a href="registrarEmpresa.jsp">Registrar Empresa</a></li>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="publicaciones.html">Publicaciones Laborales</a></li>
                    <li><a href="empresas.html">Listado de Empresas</a></li>
                    <li><a href="profesionales.html">Listados de Profesionales</a></li>
                    <li><a href="preguntas.html">Preguntas Frecuentes</a></li>
                    <li><a href="quienessomos.html">Quienes Somos</a></li>
                    <li><a href="mapa.html">Mapa del Sitio</a></li>
                </ul>
            </nav>
        </aside>
        
        <main class="main-content"> 
      <%
      if (v) { 
      %>
        <div style="text-align: center;">
            El registro se realizó de forma exitosa.<br>
            Bienvenido a WorkMarket <%= " " + g.getRazonSocial() %>            
            <div>
                <a href="LoginEmpresa.jsp" class="btn-red">Ir al Login</a>
            </div>
        </div>
      <%  
      } else { 
      %>
        <h2 style="color:red; text-align: center;">Se generó un error. Inténtelo nuevamente.</h2>
        <div style="text-align: center;">
            <a href="Formulario.html">Formulario de registro</a>  
        </div>
      <% 
      } 
      %>

        </main>
        <aside class="sidebar-right">Espacio publicitario</aside>
        <footer class="footer">Pie de Página</footer>
           <footer class="footer">
      <div class="contenedorf">
      <div class="f1">
          Seguinos en todas las Redes Sociales
      </div>
      <div class="f2">
        <a href=""><img src="Imagen/facebook.jpeg" alt=""style="width: 40px; height: 40px;"/></a>
          <a href=""><img src="Imagen/intsgram.jpeg " alt=""style="width: 40px; height: 40px;"/></a>
          <a href=""><img src="Imagen/linkeding.jpg " alt=""style="width: 40px; height: 40px;"/></a>
          <a href=""><img src=" Imagen/twitter.jpg" alt=""style="width: 40px; height: 40px;"/></a>
      </div></footer>
    </div>
    </body>
</html>
