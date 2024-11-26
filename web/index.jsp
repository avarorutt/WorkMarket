<%-- 
    Document   : index
    Created on : 12/11/2024, 14:53:32
    Author     : Us
--%>

<%@page import="Modelo.PublicacionProfesional"%>
<%@page import="Modelo.GestionPublicacionp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.PublicacionE"%>
<%@page import="Modelo.GestionarPublicacionE"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modelo Adaptativo</title>
    <link href="css/style2.css" rel="stylesheet" type="text/css"/>
    <link href="css/styles.css" rel="stylesheet" type="text/css"/>
	
</head>
<body>
    <div class="container">
        <header class="header">
            <div> 
                <img src="https://github.com/AntoRosaless/WorkMarket/blob/master/web/ima/logo.jpg?raw=true" />
                <div>
                    <!-- Botones de navegación - GRUPO 4 -->
                    <button class="btn primary"><i class="fas fa-exclamation-circle"></i> Inicio</button>
                    <button class="btn primary"><i class="fas fa-exclamation-circle"></i> Mapa del sitio</button>
                    <button class="btn primary"><i class="fas fa-check-circle"></i> Empresas</button>
                    <button class="btn primary"><i class="fas fa-exclamation-triangle"></i> Profesionales</button>
                    <button class="btn primary"><i class="fas fa-times-circle"></i> Notificaciones</button>
                    <!-- Fin de botones de navegación - GRUPO 4 -->
                </div>
            </div>
        </header>

        <aside class="sidebar-left">
            <nav class="navbar">
                <ul>
                    <li><a href="registrarProfesional.jsp">Registrar Profesional</a></li>
                    <li><a href="registrarEmpresa.jsp">Registrar Empresa</a></li>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="publicacioneslab.html">Publicaciones Laborales</a></li>
                    <li><a href="empresas.html">Listado de Empresas</a></li>
                    <li><a href="profesionales.html">Listados de Profesionales</a></li>
                    <li><a href="preguntas.html">Preguntas Frecuentes</a></li>
                    <li><a href="quienessomos.html">Quienes Somos</a></li>
                    <li><a href="mapa.html">Mapa del Sitio</a></li>
                </ul>
            </nav>
        </aside>
        
<! Toda la configuracion de barra lateral izquierda - GRUPO 4-->
        <main class="main-content">
       <!-- Contenido principal -->
    <div class="content">
        <div class="tabs">
            <div class="tab active" onclick="showTab('empresa')">Empresas</div>
            <div class="tab" onclick="showTab('profesional')">Profesionales</div>
        </div>

        <div id="empresa" class="content-section">
            <h2>Publicaciones de Empresas</h2>
            <%
            GestionarPublicacionE gp = new GestionarPublicacionE ();
            
            ArrayList <PublicacionE> pe = new ArrayList <> ();
             
                pe = gp.buscarPublicacionesE() ;
                
              
            %>
      
                <%

                for (int i=0; i<pe.size() ; i++ ){%>
               <div class="publication">
                <h3><%=pe.get(i).getTitulo()%></h3>
                <p> <%=pe.get(i).getDescripcion()%></p>
                <p> <%=pe.get(i).getRequisitos()%></p>
                <p> <%=pe.get(i).getDescripcion()%></p>
               </div>
                <%  }

                %>
                
                
              
                    
            </div>

        </div>

        <div id="profesional" class="content-section" style="display:none;">
            <h2>Publicaciones de Profesionales</h2>
         <%
            GestionPublicacionp gpp = new GestionPublicacionp ();
            
            ArrayList <PublicacionProfesional> pp = new ArrayList <> ();
             
                pp = gpp.buscarPublicacionesP() ;
                
              
            %>
      
                <%

                for (int i=0; i<pp.size() ; i++ ){%>
               <div class="publication">
                <h3><%=pp.get(i).getRubro()%></h3>
                <p> <%=pp.get(i).getTitulo()%></p>
                <p> <%=pp.get(i).getDescripcion()%></p>
                <p> <%=pp.get(i).getIdProf()%></p>
               </div>
                <%  }

                %>
        </div>
    </div>

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
    <!--</div>-->
<!Aca termina - GRUPO 4-->
<script>
    function showTab(tab) {
        document.getElementById('empresa').style.display = tab === 'empresa' ? 'block' : 'none';
        document.getElementById('profesional').style.display = tab === 'profesional' ? 'block' : 'none';

        const tabs = document.querySelectorAll('.tab');
        tabs.forEach(t => t.classList.remove('active'));

        const activeTab = Array.from(tabs).find(t => t.textContent.toLowerCase() === tab);
        if (activeTab) {
            activeTab.classList.add('active');
        }
    }

    function viewMore(button) {
        const moreInfo = button.nextElementSibling;
        if (moreInfo.style.display === 'none' || !moreInfo.style.display) {
            moreInfo.style.display = 'block';
            button.textContent = 'Ver menos';
        } else {
            moreInfo.style.display = 'none';
            button.textContent = 'Ver más';
        }
    }
</script>
</body>

</html>
