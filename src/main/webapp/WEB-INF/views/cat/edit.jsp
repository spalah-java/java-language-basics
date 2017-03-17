<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit cat:</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="col-xs-4 centered">
        <h3>Edit cat</h3>

        <c:url value="/cat/edit" var="editUrl"/>
        <form action="${editUrl}" method="post">

            <input type="hidden" name="id" value="${cat.id}">

            <div class="form-group">
                <label for="name">Name:</label>
                <input id="name" type="text" class="form-control" name="name" value="${cat.name}">
            </div>

            <div class="form-group">
                <label>Gender:</label>
                <input type="radio" name="gender" value="FEMALE" ${cat.gender == "FEMALE" ? "checked" : ""}/>Female
                <input type="radio" name="gender" value="MALE" ${cat.gender == "MALE" ? "checked" : ""}/>Male
            </div>

            <div class="form-group">
                <label for="weight">Weight:</label>
                <input id="weight" type="text" class="form-control" name="weight" value="${cat.weight}">
            </div>

            <input type="submit" class="btn btn-success" value="Submit">
        </form>
    </div>
</div>

</body>
</html>
