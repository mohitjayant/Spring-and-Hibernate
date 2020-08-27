<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration-form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>
		Country: 
		<form:select path="country">
		
			<form:options items="${student.countryOptions}"/>
			
		</form:select>
		<br><br>
		<%-- Favourite Language:
		
		Java <form:radiobutton path="favouriteLanguage" value="Java"/>
		C# <form:radiobutton path="favouriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
		Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
		Python <form:radiobutton path="favouriteLanguage" value="Python"/> --%>
		
		Favourite Language: <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}" />
		
		<br><br>
		
		<input type="submit" value="Submit"/>
	
	</form:form>
</body>
</html>