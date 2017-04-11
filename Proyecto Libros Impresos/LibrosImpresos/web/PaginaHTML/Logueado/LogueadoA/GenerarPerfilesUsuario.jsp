<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : GenerarPerfilesUsuario
    Created on : 09-04-2017, 3:52:07
    Author     : JoseMiguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ca" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="per" scope="session" class="Modelo.Persona" />
<jsp:useBean id="persona" class="Controlador.NegocioPersona" />
<jsp:setProperty name="per" property="*" />
<jsp:useBean id="car" scope="page" class="Modelo.Cargo" />
<jsp:useBean id="cargo" class="Controlador.CargoNegocio"/>
<jsp:setProperty name="car" property="*" />
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <link href="/../../LibrosImpresos/css/style.css" rel="stylesheet" type="text/css" media="screen"/>
    <title>Generar Perfiles de Usuario</title>
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
    <div id="registro">
        <form  name="frmRegistro" action="/../../LibrosImpresos/InsertarPerfilServlet" method="post">
            <input type="text" id="user" name="txtRut" placeholder="Ingrese Rut" required="required">
            <input type="password" name="txtClave" placeholder="Clave" required="required">
            <input type="text" id="user" name="txtNombre" placeholder="Ingrese Nombre" required="required">
            <input type="text" id="user" name="txtApellido" placeholder="Ingrese Apellido" required="required">
            <select name="cmbCargo" class="cmbVale" style="cursor: pointer">
                <ca:forEach items="${cargo.consultarCargo()}"  var="itemb">
                    <option class="text"  style="cursor: pointer">${itemb.getTipoCargo()}</option>
                </ca:forEach>
            </select>
            <input type="submit" value="Crear Perfil" style="cursor:pointer"/>
        </form>
            <div>
            <center>
                <p><a class="textPage" href="/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoA/InicioAdministrador.jsp" onMouseover="this.style.color='White'" onMouseout="this.style.color='aqua'">Volver</a></p>
            </center>                               
            </div>
    </div>   
    <footer id="footer">
        <p>© 2017 Todos los derechos reservados, creado por estudiantes de <a href="http://www.duoc.cl" rel="nofollow" onMouseover="this.style.color='red'" onMouseout="this.style.color='aqua'">DUOC</a>.</p>
    </footer>
</body>
</html>
