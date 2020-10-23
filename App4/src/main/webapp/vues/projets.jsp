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

</head>
<body>
<table border="1">
<thead><h1> Liste desProjets</h1></thead>
<h4>le departement :${d.nomdep}</h4>
<tr><th>numero projet</th> <th>titre</th><th>etat</th></tr>

<c:forEach  items="${liste}" var="liste">
<tr><td>${liste.numprojet}</td>
<td>${liste.titre}</td>
<td>${liste.etat}</td></tr>
</c:forEach>
</table>
<a href="addProj" class="btn btn-danger">Ajouter</a>
</body>
</html>