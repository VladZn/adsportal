<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads list</title>
</head>
<body>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Content</th>
        <th>Phone No</th>
        <th>Category</th>
        <th>Company</th>
    </tr>
    </thead>
    <c:forEach items="${ads}" var="ad">
        <tr>
            <td>${ad.id}</td>
            <td>${ad.name}</td>
            <td>${ad.content}</td>
            <td>${ad.phoneNum}</td>
            <td>${ad.category}</td>
            <td>${ad.company}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
