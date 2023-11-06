<%--
  Created by IntelliJ IDEA.
  User: maccuacu
  Date: 06/07/2023
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="product" items="${searchResults}">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">${product.productName}</h5>
            <p class="card-text">${product.description}</p>
            <p class="card-text">${product.price}</p>
            <a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
        </div>
    </div>
</c:forEach>


</body>
</html>
