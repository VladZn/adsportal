<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
    <h2>Edit ad</h2>

    <form:form method="post" action="/save" modelAttribute="ad">
        <p>
            NAME:
            <form:input path="name"/>
        </p>
        <p>
            CONTENT:
            <form:input path="content"/>
        </p>
        <p>
            PHONE:
            <form:input path="phoneNum"/>
        </p>
        <p>
            COMPANY:
            <form:input path="company"/>
        </p>
        <p>
            CATEGORY:
            <form:input path="category"/>
        </p>
        <p>
            <button type="submit">SAVE</button>
        </p>
    </form:form>
</body>
</html>
