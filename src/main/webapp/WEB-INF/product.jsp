<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>Product Page</title>
</head>
<body>
        <div id="info">
                <h1>Product name</h1>
                <h3>Categories:</h3>
                <ul>
                        <% for(int i=0; i< ${length}; i++) { %>
                                <li>Product Name</li>
                        <% } %>
                </ul>
        </div>
        <div id="form">
                <h3>Add Category:</h3>
                <form>
                        <label>Add Category</label>
                        <input type="text" name="name" id="name">
                        <input type="submit" value="Add">
                </form>
        </div>
</body>
</html>