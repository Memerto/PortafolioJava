<%-- 
    Document   : IngresoExitoso
    Created on : 09-04-2017, 3:49:43
    Author     : JoseMiguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="per" scope="session" class="Modelo.Persona" />
<jsp:useBean id="persona" class="Controlador.NegocioPersona" />
<jsp:setProperty name="per" property="*" />
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <link href="/../../LibrosImpresos/css/style.css" rel="stylesheet" type="text/css" media="screen"/>
    <title>Ingreso Exitoso</title>
</head>
<body>
    <div>
        <center>
            <ul>
                <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/InicioAdministrador.jsp';"  style="cursor:pointer;">Inicio</li>
                <li>Servicios
                    <ul>
                        <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/DefinirServicios.jsp';"  style="cursor:pointer;">Definir Servicios</li>
                    </ul>
                </li>
                <li>Usuarios
                    <ul>
                        <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/GenerarPerfilesUsuario.jsp';"  style="cursor:pointer;">Generar Perfiles de Usuario</li>
                    </ul>
                </li>
                <li>Vales
                  <ul>
                    <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/DefinirValesTipoUsuario.jsp';"  style="cursor:pointer;">Definir Vales/Tipo Usuario</li>
                    <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/GenerarValesAdicionales.jsp';"  style="cursor:pointer;">Generar Vales Adicionales</li>
                    <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/GenerarInformesAuditoria.jsp';"  style="cursor:pointer;">Generar Informe Auditoría Vales</li>
                  </ul>
                </li>
                <li onclick="location.href='/../../LibrosImpresos/LogOutServlet';"  style="cursor:pointer;">Cerrar Sesión</li>
            </ul>   
        </center>    
    </div>
    <div>
        <p id="b">Bienvenido(a)&nbsp;&nbsp;<a>${per.getNombre()} ${per.getApellido()}</a><span>&nbsp;&nbsp;&nbsp; Cargo: &nbsp;<a>${per.getCargo()}</a></span></p>
    </div>
    <div class="logo">
        <img src="/../../LibrosImpresos/img/Logo3.png"/>
    </div>
    <br>
    <br>
    <div id="b">
        <img src="/../../LibrosImpresos/img/Registrp_exitoso.png"/>
        <h1>Registro Exitoso!</h1>
    </div> 
    <div>
        <center>
            <p><a class="textPage" href="/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/InicioAdministrador.jsp" onMouseover="this.style.color='White'" onMouseout="this.style.color='aqua'">Volver</a></p>
        </center>                               
    </div>
    <footer id="footer">
        <p>© 2017 Todos los derechos reservados, creado por estudiantes de <a href="http://www.duoc.cl" rel="nofollow" onMouseover="this.style.color='red'" onMouseout="this.style.color='aqua'">DUOC</a>.</p>
    </footer>
</body>
</html>
