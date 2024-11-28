<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Servlet CON ARGUMENTO </title>
</head>
<body>
<main style='text-align:center'>
<h1>INFORMACIÓN DEL POKEMON</h1>
<h2>Información del pokemon pikachu</h2>
<table style='margin: 0 auto' border='1'>
    <tr>
        <th>Imagen</th>
        <th>Nombre</th>
        <th>Id</th>
        <th>Altura</th>
    </tr>
    <tr>
        <th>${imagen}</th>
        <th>${nombre}</th>
        <th>${id}</th>
        <th>${altura}</th>
    </tr>
</table>
</main>
</body>
</html>