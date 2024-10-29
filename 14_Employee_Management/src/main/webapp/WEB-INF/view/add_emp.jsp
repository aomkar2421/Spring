<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Employee Management</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<nav
		class="navbar navbar-expand-lg bg-primary text-light" style="color: white;">
		<div class="container-fluid">
			<a class="navbar-brand  text-light" href="#">Emp Management System</a>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0  text-light">
					<li class="nav-item"><a class="nav-link active  text-light"
						aria-current="page" href="home">Home</a></li>
					<li class="nav-item"><a class="nav-link  text-light" href="addEmp">Add Emp</a></li>
				</ul>

			</div>
		</div>
	</nav>
	
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center">
						<h1>Add Employee</h1>
					</div>
					<div class="card-body">
						<form action="createEmp" method="post">
							<div class="mb-3">
								<label>Enter Name</label>
								<input type="text" name="fullName" class="form-control">
							</div>
							<div class="mb-3">
								<label>Enter Address</label>
								<input type="text" name="address" class="form-control">
							</div>							
							<div class="mb-3">
								<label>Enter Email</label>
								<input type="text" name="email" class="form-control">
							</div>
							<div class="mb-3">
								<label>Enter Password</label>
								<input type="text" name="password" class="form-control">
							</div>
							<div class="mb-3">
								<label>Enter Designation</label>
								<input type="text" name="designation" class="form-control">
							</div>
							<div class="mb-3">
								<label>Enter Salary</label>
								<input type="text" name="salary" class="form-control">
							</div>
							<button class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>