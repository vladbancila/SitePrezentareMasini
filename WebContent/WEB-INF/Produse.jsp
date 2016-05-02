<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<link rel="stylesheet" href="/2016-03-09Masini/css/style.css"
	type="text/css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Magazinul nostru</title>
</head>

<body>
	<div class="header">
		<ul class="nav nav-tabs">
			<!-- nav nav-pills -->
			<li><a href="home"><span class="glyphicon glyphicon-home"></span>
					Home</a></li>
			<li class="active"><a href="#"><span
					class="glyphicon glyphicon-road"></span> Produse</a></li>
		</ul>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-9">
				<h1>Lista Completa de Produse</h1>
			</div>
		</div>
		<div class="row">
		<!--<div class="col-sm-9">-->
			<c:forEach items="${produse}" var="articol">
				 <div class="col-sm-4"> 

					<!--<div class="col-xs-6 col-sm-4 col-md-3 col-lg-2">-->
					<div class="thumbnail">
						<img class="imagine" src="${produs.calePoza}" alt="${articol.descriere}">
						<div class="caption">
							<h3>${articol.denumire}</h3>
							<p>${articol.descriere}</p>
							<p>
								<a href="#" class="btn btn-primary" role="button">LIKE</a> <a
									href="#" class="btn btn-success" role="button">SHARE</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
				
		</div>
	</div>

	<!--  
<script>
unde id=meniu;
$document.ready{function(){
	${meniu}.show();
}};
</script>
-->
</body>
</html>