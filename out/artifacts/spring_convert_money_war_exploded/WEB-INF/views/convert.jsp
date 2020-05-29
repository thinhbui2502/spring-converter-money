<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/05/2020
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Convert USD to VND</title>
</head>
<body>
<form method="post">
<p>RATE:</p>
    <label>
        <input name="rate" value="${rate}" placeholder="RATE">
    </label> <br>
<p>USD:</p>
    <label>
        <input name="usd" value="${usd}" type="number" placeholder="USD">
    </label><br>
<button type="submit">submit</button>
    <p>RESULT: ${result}</p>
</form>
</body>
</html>
