<%-- 
    Document   : Formulario
    Created on : 17/09/2021, 08:18:25 PM
    Author     : Lino Heredia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de contacto</h1>
        <form action="Miservlet" method="get">
            <label for="nombre">Nombre: </label>
            <input name="nombre" for="nombre" type="text"placeholder="Nombre completo" required="true" > 
            <label for="correo">Correo: </label>
            <input name="correo" for="correo" type="email" placeholder="nombre@gmail.com" required="true" > 
            <label for="mensaje">Mensaje: </label>
            <textarea name="mensaje" for="mensaje" placeholder="Mensaje" required="true" > </textarea>
            <input name="enviar" type="submit" value="enviar">
        </form>
    </body>
</html>
