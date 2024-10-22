<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Bootstrap demo</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />" />
		<script type="text/javascript" src="<c:url value='/resources/js/script.js' />"></script>
	</head>
	<body>
	
		<div class="container mt-5">
			<div class="row card">
				<div class="col-md-8 mx-auto card-body text-center">
					<h1 class="card-header mb-5">File Uploading PAGE</h1>
					<div class="row">
						<div class="col-md-6 mx-auto">
							<form action="fileUpload" enctype="multipart/form-data" method="post">
								<input type="file" name="img" class="form-control">
								<button class="btn btn-primary mt-4">Upload File</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	
	</body>
</html>