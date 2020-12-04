<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>
<div class="row pt-5 mx-2">
	<div class="col-sm-12 col-md-2 offset-md-1 col-lg-2 offset-lg-2 ">
		<h2>Acceso</h2>
		<p>Por favor, rellena el siguiente formulario con los datos
			correctos para acceder.</p>
	</div>
	<form action="login" method="post"
		class="col-sm-12 col-md-8 offset-ld-1 col-lg-5 offset-lg-1 needs-validation"
		novalidate>
		<div class="form-group">
			<label for="email">Email</label> 
			<input type="email" class="form-control" id="email" aria-describedby="emailHelp" name="email" required>
			<div class="invalid-feedback">Selecciona un formato de email correcto</div>
		</div>
		<div class="form-group">
			<label for="password">Password</label> 
			<input 	type="password" class="form-control" id="password" name="password" required>
		</div>
		<button type="submit" class="btn btn-primary">Aceptar</button>
	</form>

</div>


<script>
	// Example starter JavaScript for disabling form submissions if there are invalid fields
	(function() {
		'use strict';
		window.addEventListener('load', function() {
			// Fetch all the forms we want to apply custom Bootstrap validation styles to
			var forms = document.getElementsByClassName('needs-validation');
			// Loop over them and prevent submission
			var validation = Array.prototype.filter.call(forms, function(form) {
				form.addEventListener('submit', function(event) {
					if (form.checkValidity() === false) {
						event.preventDefault();
						event.stopPropagation();
					}
					form.classList.add('was-validated');
				}, false);
			});
		}, false);
	})();
</script>

<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>
