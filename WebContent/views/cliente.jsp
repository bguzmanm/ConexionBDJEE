<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle Cliente</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	´
	 rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h1>Detalle de Cliente</h1>
		<h2><c:out value="${cliente.getNombre()}"></c:out></h2>
		<p><c:out value="${cliente.getDireccion()}"></c:out></p>
		<p><a href="${cliente.getWebsite()}" target="_blank"><c:out value="${cliente.getWebsite()}"></c:out></a></p>
		<p>Límite de crédito: US$<c:out value="${cliente.getCredito()}"></c:out></p>
		
		<p><a href="${pageContext.servletContext.contextPath}/">Volver</a></p>
	</div>

</body>
</html>