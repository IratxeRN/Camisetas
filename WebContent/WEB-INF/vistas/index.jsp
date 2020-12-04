<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>
<!--  
<div class="row row-cols-1 row-cols-md-4 ">
		<c:forEach items="${camisetas}" var="camiseta">
		<div class="card" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-5">
      <img src="${camiseta.imgDiseno}" class="card-img" alt="...">
    </div>
    <div class="col-md-6">
      <div class="card-body">
        <h5 class="card-title"><small class="text-muted">${camiseta.id}</small>- ${camiseta.diseno}</h5>
        <p class="card-text">${camiseta.modelo}. </p>
        <p class="card-text"><small class="text-muted">Color:${camiseta.color}</small>
        <small class="text-muted">Talla: ${camiseta.talla}</small>
        <small class="text-muted">${camiseta.cantidad} unid.</small>
        </p>
        <p class="card-text">${camiseta.precio} </p>
        <p class="card-text">${camiseta.descuento} </p>
      </div>
    </div>
  </div>
</div>
	</c:forEach>
</div>
//-->
<div class="row row-cols-1 row-cols-md-4 mx-0 pt-2">
		<c:forEach items="${camisetas}" var="camiseta">
<div class="col mb-4">
    <div class="card ">
      <img src="${camiseta.imgDiseno}" class="card-img-top img-thumbnail" alt="...">
      <div class="card-body">
        <h5 class="card-title"><small class="text-muted">${camiseta.id}</small>- ${camiseta.diseno}</h5>
        <p class="card-text">${camiseta.modelo}. </p>
        <p class="card-text"><small class="text-muted">Color:${camiseta.color}</small>
        <small class="text-muted">Talla: ${camiseta.talla}</small>
        <small class="text-muted">${camiseta.cantidad} unid.</small>
        </p>
        <p class="card-text">${camiseta.precio} </p>
        <p class="card-text">${camiseta.descuento} </p>
      </div>
    </div>
  </div>
	</c:forEach>
</div>




<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>