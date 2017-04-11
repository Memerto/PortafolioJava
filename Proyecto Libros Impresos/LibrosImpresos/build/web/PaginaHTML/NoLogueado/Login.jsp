<%-- 
    Document   : Login
    Created on : 09-04-2017, 4:24:17
    Author     : JoseMiguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <link href="/../../LibrosImpresos/css/style.css" rel="stylesheet" type="text/css" media="screen">
    <title>Login</title>
</head>
<body>
    <div class="logo2">
        <img src="/../../LibrosImpresos/img/Logo3.png"/>
    </div>
    <div id="login">
        <form name='form-login' action="/../../LibrosImpresos/LoginServlet" method="post">
            <span class="fontawesome-user"></span>
              <input type="text" id="user" placeholder="Rut" name="user" required="required">
            <span class="fontawesome-lock"></span>
              <input type="password" placeholder="Clave" name="pass" required="required">
              <input type="submit" value="Entrar">
        </form>
    </div>    
    <footer id="footer">
        <p>© 2017 Todos los derechos reservados, creado por estudiantes de <a href="http://www.duoc.cl" rel="nofollow" onMouseover="this.style.color='red'" onMouseout="this.style.color='aqua'">DUOC</a>.</p>
    </footer>
</body>
</html>
