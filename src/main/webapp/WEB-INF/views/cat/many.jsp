<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All Cats</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="col-xs-4 centered">
        <h3>Cats</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Weight</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cats}" var="cat" varStatus="count">
            <tr>
                <th scope="row">${count.index + 1}</th>
                <td>
                    <c:url value="/cat?id=${cat.id}" var="catUrl"/>
                    <a href="${catUrl}">${cat.name}</a>
                </td>
                <td>${cat.gender}</td>
                <td>${cat.weight}</td>
            </tr>
            </c:forEach>
        </table>

        <c:url value="/cat/edit" var="createUrl"/>
        <a href="${createUrl}" class="btn btn-success" role="button">Create new Cat</a>
    </div>
</div>


</body>
</html>
