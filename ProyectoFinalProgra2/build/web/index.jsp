<%-- 
    Document   : index
    Created on : 27-jun-2015, 15:34:26
    Author     : andre_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estadio Seguro</title>
    </head>
    <body>
        <h1>Logeate</h1>
        
        <form action="Session">
        <fieldset><legend>Usuario</legend>
		<label for="Hin">Hincha</label>
		<input type="radio" value="Hincha" name="grpUsuario" checked="checked" id="Hin"/>
		<label for="Adm">Administrador</label>
		<input type="radio" value="Administrador" name="grpUsuario" id="Adm"/>
        </fieldset>           
            <label>Usuario</label><br />
            <input type="text" name="txtUsuario" required=""/><br />
            <label>Passwor</label><br />
            <input type="password" naem="txtPassword" required=""/><br />
            <input type="submit" name="Login" />
        </form>
        
        
    </body>
</html>
