<%@ page import="ua.spalah.jdbc.Dog" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Test JSP</title>
</head>
<body>
This is the simplest JSP
<br>
<br>

<%-- this is jsp comment --%>
<!-- this is html comment -->

<%! private int numberOfClients = 5; %>

<%= new Date()%> <br>
<%= new Date().getTime() %> <br>

<%= numberOfClients * 7 %> <br>
<%= request.getHeader("User-Agent") %> <br>
<%= request.getRemoteHost() %> <br>
<%--<%= java.lang.Integer.parseInt(request.getParameter("number")) * numberOfClients %>--%>

<%--<%--%>
<%--String queryData = request.getQueryString();--%>
<%--out.println("Дополнительные данные запроса: " + queryData);--%>
<%--%>--%>

<% if (Math.random() < 0.5) { %>
    <b>Удачного</b> вам дня!
<% } else { %>
    <b>Неудачного</b> вам дня!
<% } %>
<br>

<%-- Самое важное --%>
<%= request.getAttribute("someNumber") %> <br>
<%= request.getAttribute("dog") %> <br>
<%= ((Dog) request.getAttribute("dog")).getNick() %> <br>


<c:set var="someInt" value="7"/>
<c:set var="myName" value="Alex"/>

<c:forEach var="i" begin="1" end="5">
    <c:out value="${i}"/> <br>
</c:forEach>

<br>
<h2>Expression Language starts now</h2>
${someInt} <br>
${myName} <br>

${someNumber} <br>
${dog} <br>
${dog.nick} <br>
${dog.gender} <br>
${dog.gender.display} <br>



</body>
</html>
