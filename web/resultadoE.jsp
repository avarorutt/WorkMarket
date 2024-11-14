<%@page import="Modelo.Empresa"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Empresa> lista = (ArrayList<Empresa>)request.getAttribute("lista"); %>
<!DOCTYPE html>
<html lang="es">
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modelo Adaptativo</title>
    <link href="css.css" rel="stylesheet" type="text/css"/>
   
</head>
<body>

    <div class="container">
        <header class="header">

<div>
<img src="https://github.com/AntoRosaless/WorkMarket/blob/master/web/ima/logo.jpg?raw=true" />
<div>
<!Aca agregamos los botones - GRUPO 4-->
<button class="btn primary"><i class="fas fa-exclamation-circle"></i> Inicio</button>
<button class="btn primary"><i class="fas fa-exclamation-circle"></i> Mapa del sitio</button>
<button class="btn primary"><i class="fas fa-check-circle"></i> Empresas</button>
<button class="btn primary"><i class="fas fa-exclamation-triangle"></i> Profesionales</button>
<button class="btn primary"><i class="fas fa-times-circle"></i>Notificaciones</button>
<!Aca terminan los botones - GRUPO 4-->

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
  </nav></aside>
<!Toda la configuracion de barra lateral izquierda - GRUPO 4-->
        <main class="main-content">
           
            <h1>Resultados de la Búsqueda</h1>
        <% if (lista != null && !lista.isEmpty()) { %>
            <table>
                <thead>
                    <tr>
                        <th>Razón social</th>
                        <th>Localidad</th>
                        <th>Provincia</th>
                        <th>Rubro</th>
                        <th>E-mail</th>
                        <th>Teléfono</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Empresa Empresa : lista) { %>
                        <tr>
                            <td><%= Empresa.getRazonSocial() %></td>
                            <td><%= Empresa.getLocalidad() %></td>
                            <td><%= Empresa.getProvincia() %></td>
                            <td><%= Empresa.getRubro() %></td>
                            <td><%= Empresa.getEmail() %></td>
                            <td><%= Empresa.getTelefono() %></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } else { %>
            <p class="no-results">No se encontraron resultados para la búsqueda.</p>
        <% } %>
        <a href="index_1.html" class="button">Inicio</a>
           
        </main>
        <aside class="sidebar-right">Barra Lateral Derecha</aside>
        <footer class="footer">
  <footer class="footer">
      <div class="contenedorf">
      <div class="f1">
          Seguinos en todas las Redes Sociales
      </div>
      <div class="f2">
          <a href=""><img src="ima/icono1.jpg" alt=""/></a>
          <a href=""><img src="ima/icono2.jpg" alt=""/></a>
          <a href=""><img src="ima/icono3.jpg" alt=""/></a>
          <a href=""><img src="ima/icono4.jpg" alt=""/></a>
      </div></footer>
    </div>
<!Aca termina - GRUPO 4-->
</body>
</html>
