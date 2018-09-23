<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Register</h1>

    <sf:form method="POST" commandName="spitter">
        <sf:errors path="*" cssClass="errors" element="div"/>
        <sf:label path="firstName" cssErrorClass="error">First Name: </sf:label>
            <sf:input path="firstName" /> <br/>
        <sf:label path="lastName" cssErrorClass="error">Last Name: </sf:label>
            <sf:input path="lastName" /> <br/>
        <sf:label path="email" cssErrorClass="error">Email: </sf:label>
            <sf:input path="email" type="email"/> <br/>
        <sf:label path="username" cssErrorClass="error">Username: </sf:label>
            <sf:input path="username" /> <br/>
        <sf:label path="password" cssErrorClass="error">Password: </sf:label>
            <sf:password path="password"/> <br/>
        <input type="submit" value="Register" />
    </sf:form>
  </body>
</html>
