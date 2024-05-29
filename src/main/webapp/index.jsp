<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="container">
		
			<s:form action="loginAction">
			  <div class="form-group">
			    <label for="exampleInputEmail1">Email address</label>
			    <s:textfield key="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"/>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Password</label>
			    <s:password key="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
			  </div>
			  <div class="form-group">
				<s:submit value="Login" class="btn btn-primary" />
			  </div>
			</s:form>
		  </div>
	</body>
</html>