<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 11/11/26
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>image</td>
        <td>description</td>
        <td>Category</td>
        <td>Category ID</td>
        <td>active</td>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${listDrink}" var="drink">
        <tr>
            <td>${drink.id}</td>
            <td>${drink.name}</td>
            <td>${drink.price}</td>
            <td>${drink.image}</td>
            <td>${drink.description}</td>
            <td>${drink.category.name}</td>
            <td>${drink.category.id}</td>
            <td>${drink.active}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
