<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Client</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="col-xs-4 centered">
        <h3>Client:</h3>

        <h4>Name: ${client.name}</h4>
        <h4>Gender: ${client.gender.display}</h4>
        <h4>Balance: ${client.balance}</h4>

        <c:url value="/client/edit?id=${client.id}" var="editUrl"/>
        <a href="${editUrl}" class="btn btn-primary" role="button">Edit</a>

        <c:url value="/client" var="allClientsUrl"/>
        <a href="${allClientsUrl}" class="btn btn-link" role="button">Back to table</a>
    </div>
</div>

</body>
</html>
