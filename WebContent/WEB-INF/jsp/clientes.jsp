<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
    <title>SPRING MVC Y HIBERNATE</title>
</head>


<body>
<h2><spring:message code="label.title"/> </h2>
<form:form method="post" action="addCliente.html"  commandName="cliente">
 <table class="bordered">
    <tr>
        <td>
        	<form:label path="nombres">
        		<spring:message code="label.nombre"/>
        	</form:label></td>
        <td><form:input path="nombres" /></td> 
    </tr>
    <tr>
        <td>
        	<form:label path="apellidos">
        		<spring:message code="label.apellidos"></spring:message> 
        	</form:label></td>
        <td><form:input path="apellidos" /></td>
    </tr>
    <tr>
        <td>
        	<form:label path="email">
        		<spring:message code="label.correo"/>
        	</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td>
        	<form:label path="telefono">
        		<spring:message code="label.telefono"/>   		
            </form:label></td>
        <td><form:input path="telefono" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value='<spring:message code="label.addcliente"/>'>
        </td>
    </tr>
</table>  
     
</form:form>

<h3>Contacts</h3>
<c:if  test="${!empty contactList}">
<table class="data">
<tr>
	<th>Nombre</th>
	<th>Correo</th>
	<th>Telefono</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${contactList}" var="contact">
	<tr>
		<td>${contact.apellidos}, ${contact.nombre} </td>
		<td>${contact.correo}</td>
		<td>${contact.telefono}</td>
		<td><a href="delete/${contact.id}">delete</a></td>
	</tr>
</c:forEach>
</table>
</c:if>


</body>
</html>