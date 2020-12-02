<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<h1>Camisetas</h1>

<table>
	<thead>
		<tr>
			<th scope="col">Imagen</th>
			<th scope="col">Id</th>
			<th scope="col">Modelo</th>
			<th scope="col">Diseño</th>
			<th scope="col">Color</th>
			<th scope="col">Talla</th>
			<th scope="col">Precio</th>
			<th scope="col">Descuento</th>
			<th scope="col">Cantidad</th>
		</tr>
	</thead>
	<tbody>
		<%-- for(Camiseta camiseta: camisetas) --%>
		<c:forEach items="${camisetas}" var="camiseta">
			<tr>
				<%-- perro.getId() --%>
				<td>${camiseta.imgDiseno}</td>
				<th scope="row">${camiseta.id}</th>
				<td>${camiseta.modelo}</td>
				<td>${camiseta.diseno}</td>
				<td>${camiseta.color}</td>
				<td>${camiseta.talla}</td>
				<td>${camiseta.precio}</td>
				<td>${camiseta.descuento}</td>
				<td>${camiseta.cantidad}</td>
				
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>