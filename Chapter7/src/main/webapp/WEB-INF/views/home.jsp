<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css" />" >
</head>
<body>
    <h1><s:message code="spitter.welcome"/> </h1>
    <s:url value="/spitter/register" var="registerURL"/>
    <s:url value="/spittles" var="spittlesURL">
        <s:param name="max" value="5"/>
        <s:param name="count" value="2"/>
    </s:url>
    <s:url value="/spitter/{username}" var="spitterURL">
        <s:param name="username" value="jbauer"/>
    </s:url>
    <a href="/spittles">Spittles</a> |
    <a href="${registerURL}">Register</a>
    <br>
    <a href="${spittlesURL}">Max = 5 & Count = 2 ==> Spittles</a><br>
    <a href="${spitterURL}">Get Jack information</a>

</body>
</html>