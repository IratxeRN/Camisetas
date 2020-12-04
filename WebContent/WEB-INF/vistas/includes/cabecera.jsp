<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="es">
<head>
<base href="${pageContext.request.contextPath}/" />

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- FontAwesome -->
<link rel="stylesheet" href="css/all.min.css">
<!-- Hoja de estilos personalizada -->
<link rel="stylesheet" href="css/cami.css">

<title>Tienda de Camisetas LeShou Art</title>
</head>
<body>
	<header>
		<div class="card col-12 bg-dark px-0">
			<img src="img/header_lesh2.png" class="img-fluid mx-auto d-block"
				alt="Responsive image">
			<div class="card-img-overlay">
			<img src="img/logo_Lesh2_p.png" class="mx-5"
				alt="Responsive image">
			</div>
			
		</div>
		<div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="principal">LeShou Art</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="principal">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Productos</a>
					</li>
					
					<li class="nav-item"><a class="nav-link" href="contacto">Contacto</a>
					</li>
					
				</ul>
				<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">Cesta</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="login">Login</a>
					</li>
				</ul>
			</div>
		</nav>
	</div>
	</header>
	<main class=contained-fluid>