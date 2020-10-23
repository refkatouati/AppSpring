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
<h1>Liste des Departements</h1>
<table  class="table table-hover">
<thead> 
<tr><th>numero departement</th> <th>nom departement</th></tr></thead>
<tbody>
<c:forEach  items="${liste}" var="liste">
<tr><td>${liste.numdep}</td>

<td>${liste.nomdep}</td>
<td><a href= "projets/${liste.numdep}" class="btn btn-info"> liste des projets</a></td>
<td><a href= "employes/${liste.numdep}" class="btn btn-info"> liste des employes</a></td></tr>
</c:forEach>
</tbody>
</table>
<a href="addProj" class="btn btn-danger">Ajouter Projet</a></br>
<a href="addEmploye" class="btn btn-danger">Ajouter Employe</a>
</div>
</body>
</html>