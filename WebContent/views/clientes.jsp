<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Clientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	´
	 rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Listado de Clientes</h1>
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Dirección</th>
					
					<th scope="col">Acción</th>
			</thead>
			<tbody>
				<c:forEach var="c" items="${clientes}">
					<tr>
						<td><a href="d/?id=${c.getId()}"><c:out value="${c.getId()}"></c:out></a></td>
						<td><c:out value="${c.getNombre()}"></c:out></td>
						<td><c:out value="${c.getDireccion()}"></c:out></td>
						<td>Editar | Borrar</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>