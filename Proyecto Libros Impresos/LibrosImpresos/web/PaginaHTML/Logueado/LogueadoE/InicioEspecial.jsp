<%-- 
    Document   : InicioEspecial
    Created on : 09-04-2017, 4:17:32
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
    <link rel="stylesheet" href="/../../LibrosImpresos/css/style.css">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <title>Inicio Especial</title>
</head>
<body>
    <div>
        <center>
            <ul>
                <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoE/InicioEspecial.jsp';">Inicio</li>
                <li>Vales
                  <ul>
                    <li onclick="location.href='/../../LibrosImpresos/PaginaHTML/Logueado/LogueadoE/GenerarValesAdicionales.jsp';">Generar Vales Adicionales</li>
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
    <!--<div class="alinearColumnas">        
            <center>
                <div id="dos_columnas" class="container">
		<div id="tbox1">
			<div class="box-style">
				<div class="content">
                                    <p id="b">Bienvenido(a)</p>
				</div>
			</div>
		</div>
		<div id="tbox2">
			<div class="box-style">
				<div class="content">
                                    <p id="b">Jose Miguel Muñoz</p>
				</div>
			</div>
		</div>		
                </div>
            </center>
    </div>-->    
    <footer id="footer">
        <p>© 2017 Todos los derechos reservados, creado por estudiantes de <a href="http://www.duoc.cl" rel="nofollow" onMouseover="this.style.color='red'" onMouseout="this.style.color='aqua'">DUOC</a>.</p>
    </footer>
</body>
</html>
