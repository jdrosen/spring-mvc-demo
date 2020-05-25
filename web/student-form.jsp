<%--
  Created by IntelliJ IDEA.
  User: jdrosen
  Date: 5/25/2020
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student Entry Form</title>
</head>
<body>

<%--@elvariable id="student" type="net.jdrosen.springdemo.Student"--%>
<form:form action="processForm" modelAttribute="student">
    First Name: <form:input path="firstName" />

    <br><br>

    Last Name: <form:input path="lastName" />

    <br><br>

    <form:select path="country">
        <form:option value="Brazil" label="Brazil" />
        <form:option value="France" label="France" />
        <form:option value="Germany" label="Germany" />

    </form:select>

    <br><br>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>
