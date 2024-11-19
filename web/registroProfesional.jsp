<%@page import="Modelo.Profesional"%>
<%
   // Obtener atributos del request
   Boolean valor = (Boolean) request.getAttribute("valor");
   Profesional p1 = (Profesional) request.getAttribute("p1");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="css/styles.css" rel="stylesheet" type="text/css"/>
    <link href="css/styles2.css" rel="stylesheet" type="text/css"/>
    <link href="css/stylespcp.css" rel="stylesheet" type="text/css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <div class="container">
        <!-- Encabezado con botones y logotipo -->
        <header class="header">
            <img src="https://github.com/AntoRosaless/WorkMarket/blob/master/web/ima/logo.jpg?raw=true" alt="Logotipo" style="width: 80px; height: auto;" />
            <div class="header-buttons">
                <!-- Botones de navegación -->
                <button class="btn primary"><i class="fas fa-exclamation-circle"></i> Inicio</button>
                <button class="btn primary"><i class="fas fa-exclamation-circle"></i> Mapa del sitio</button>
                <button class="btn primary"><i class="fas fa-check-circle"></i> Empresas</button>
                <button class="btn primary"><i class="fas fa-exclamation-triangle"></i> Profesionales</button>
                <button class="btn primary"><i class="fas fa-times-circle"></i> Notificaciones</button>
            </div>
        </header>
        <!-- Barra lateral izquierda con enlaces -->
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
            <% if (valor != null && valor) { %> <!-- Corregido aquí -->
                <h2>Bienvenido a WorkMarket, su registro fue exitoso:</h2>
                <%= p1.getNombre() + " " + p1.getApellido() %>
                <div>
                    <a href="LoginProfesional.html" class="btn-red">Ir al Login</a>
                </div>
            <% } else { %>
                <h2 style="color:red;">Se generó un error en el registro.</h2>
                <p>Por favor, <a href="formularioProfesional.html">intente nuevamente</a>.</p>
            <% } %>
        </main>
        
        <aside class="sidebar-right">Espacio publicitario</aside>
        <!-- Pie de página con iconos de redes sociales -->
        <footer class="footer">
            <div class="contenedorf">
                <div class="f1">
                    Seguinos en todas las Redes Sociales
                </div>
                <div class="f2">
    <a href=""><img src="ima/facebook.png" alt="Facebook" style="width: 40px; height: 40px;"/></a>
    <a href=""><img src="ima/x.png" alt="Twitter" style="width: 60px; height: 60px;"/></a>
    <a href=""><img src="ima/insta.png" alt="Instagram" style="width: 50px; height: 40px;"/></a>
    <a href=""><img src="ima/link.png" alt="LinkedIn" style="width: 40px; height: 40px;"/></a>
</div>

                


            </div>
        </footer>
    </div>
</body>
</html>
