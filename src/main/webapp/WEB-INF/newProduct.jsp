<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>New Product</title>
</head>
<body>
        <h1>New Product</h1>
        <form action="" method="POST">
                <label for="name">Name:</label>
                <input type="text" name="name" id="name"><br>
                <label for="name">Description:</label>
                <input type="text" name="description" id="description"><br>
                <label for="name">Price:</label>
                <input type="number" name="price" id="price"><br>
                <input type="submit" value="Add">
        </form>
</body>
</html>
