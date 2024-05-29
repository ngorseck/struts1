<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>employees</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</head>
	<body>
		<table classe="table">
            <tr>
                <td>Full name</td>
                <td>Email</td>
                <td>Mot de passe</td>
                <td>Editer</td>
                <td>Supprimer</td>
            </tr>
            <s:iterator value="%{employeesList}" var="employees">
	            <tr>
	                <td><s:property value="#employees.fullName"/></td>
	                <td><s:property value="#employees.email"/></td>
	                <td><s:property value="#employees.password"/></td>
	                <td>
	                    <s:url var="edit" action="employeesAction" method="edit">
	                        <s:param name="emailEdit">
	                            <s:property value="#employees.email"/>
	                        </s:param>
	                    </s:url>
	                    <s:a href="%{#edit}">Lien edit</s:a>
	                </td>
	                <td>
	                    <s:url var="delete" action="employeesAction" method="delete">
	                        <s:param name="emailDelete">
	                            <s:property value="#employees.email"/>
	                        </s:param>
	                    </s:url>
	                    <s:a href="%{#delete}">Lien Supprimer</s:a>
	                </td>
	            </tr>
            </s:iterator>
        </table>
	</body>
</html>