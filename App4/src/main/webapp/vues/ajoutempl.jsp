<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<spring:url value="/resources/files/bootstrap" var="bt" /> 
<link rel="stylesheet" href="${bt}/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="form-group row">
<form:form    method="POST" action="saveEmploye" modelAttribute="e">

<p> Nom : <form:input path="nomempl"/></p>

<p> <form:select path="dept.numdep" items="${depts}" itemLabel="nomdep" itemValue="numdep"></form:select></p>

<p> <form:select path="proj.numprojet" items="${prs}" itemLabel="titre" itemValue="numprojet"></form:select></p>
<input class="btn btn-primary" type="submit" value="enregistrer">

</form:form>

</div>
</div>
</body>
</html>