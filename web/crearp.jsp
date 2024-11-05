<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Publicación</title>
    <link rel="stylesheet" href="css/stylespcp.css">
</head>
<body>
    <div class="container">
        <header class="header">
            <img src="https://github.com/AntoRosaless/WorkMarket/blob/master/web/ima/logo.jpg?raw=true" />
            <div class="button-container">
                <button class="btn primary"><i class="fas fa-exclamation-circle"></i> Inicio</button>
                <button class="btn primary"><i class="fas fa-exclamation-circle"></i> Mapa del sitio</button>
                <button class="btn primary"><i class="fas fa-check-circle"></i> Empresas</button>
                <button class="btn primary"><i class="fas fa-exclamation-triangle"></i> Profesionales</button>
                <button class="btn primary"><i class="fas fa-times-circle"></i> Notificaciones</button>
            </div>
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
            <h1>Crear Nueva Publicación</h1>
            <form class="form-publicacion" action="ControladorPublicacionProfesional" method="post">
                <div>
                    <label for="rubro">Rubro:</label>
                    <input type="text" name="rubro" required>
                </div>
                <div>
                    <label for="titulo">Título:</label>
                    <input type="text" name="titulo" required>
                </div>
                <div>
                    <label for="descripcion">Descripción:</label>
                    <textarea name="descripcion" rows="4" cols="50"></textarea>
                </div>
                <div>
                    <label for="idprof">IDPROF:</label>
                    <input type="text" name="idprof" required>
                </div>
                <div class="form-buttons">
                    <input type="submit" value="Crear Publicación" name="crear" class="btn primary">
                    <button type="reset" class="btn primary">Limpiar Publicación</button>
                </div>
            </form>
        </main>

        <aside class="sidebar-right">
            Barra Lateral Derecha
        </aside>

        <footer class="footer">
            <div>Seguinos en todas las Redes Sociales</div>
            <div class="social-icons">
                <a href="#"><img src="ima/icono1.jpg" alt="icono1"></a>
                <a href="#"><img src="ima/icono2.jpg" alt="icono2"></a>
                <a href="#"><img src="ima/icono3.jpg" alt="icono3"></a>
                <a href="#"><img src="ima/icono4.jpg" alt="icono4"></a>
            </div>
        </footer>
    </div>
</body>
</html>
