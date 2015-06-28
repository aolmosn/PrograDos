<%-- 
    Document   : inicioAdministrador
    Created on : 27-jun-2015, 16:51:18
    Author     : andre_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CerrarSesion">
            <input type="submit" name="Cerrar Sesion" value="Cerra" />
        </form>

        <h1>HolaAdministrador</h1
        
        <form action="action">
            <option>
            <li><a href="Admministrador/IngresarSeleccion.jsp">Ingresar Seleccion</a></li>
            <li><a href="Admministrador/IngresarSeleccion.jsp">Ingresar Objetos</a></li>
            <li><a href="Admministrador/IngresarSeleccion.jsp">Solicitudes</a></li
            </option>
            <h2>Lista Solicitudes</h2>
            <form action="action">
                <input list="EstadoSolicitudes" />
			<datalist id="EstadoSolicitudes">
				<option value="Todas" />
				<option value="Pendientes" />
				<option value="Aprobadas" />
				<option value="Rechazadas" />
			</datalist>
                <input type="submit" value="Filtrar" />
            </form>
            <h2>Lista Hinchas</h2>
            <form action="action">
                <input list="Pais" />
			<datalist id="Pais">
				<% //For each con todos los paises para su filtro%>
                                <option value="Todas" />
				<option value="Pendientes" />
				<option value="Aprobadas" />
				<option value="Rechazadas" />
			</datalist>
                <input type="submit" value="Filtrar" />
            </form>
        </form>
    </body>
</html>
