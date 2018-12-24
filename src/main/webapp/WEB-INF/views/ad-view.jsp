<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ad view</title>
</head>
<body>

    <c:set var="ad" value="${ad}"/>
    <table>
        <thead>
            <tr>
                <th>CAPTION</th>
                <th>VALUE</th>
            </tr>
        </thead>
        <tr>
            <td>ID</td>
            <td>${ad.id}</td>
        </tr>
        <tr>
            <td>NAME</td>
            <td>${ad.name}</td>
        </tr>
    </table>
</body>
</html>
