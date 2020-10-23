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
<table class="table table-bordered">
<thead><h1> Liste des Employes</h1></thead>
<h4>le departement :${d.nomdep}</h4>
<tr><th>nom employe</th> <th>Titre projet</th><th>Nom Departement</th></tr>

<c:forEach  items="${liste}" var="liste">
<tr><td>${liste.nomempl}</td>
<td>${liste.proj.titre}</td>
</tr>
</c:forEach>
</table>


</body>
</html>