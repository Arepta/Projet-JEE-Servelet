
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admins</title>
</head>
<body>
    <h1>Admins</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Username</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="admin" items="${admins}">
                <tr>
                    <td>${admin.id}</td>
                    <td>${admin.username}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
