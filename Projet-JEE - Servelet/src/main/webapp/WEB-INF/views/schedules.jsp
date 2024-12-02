
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Schedules</title>
</head>
<body>
    <h1>Schedules</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Day</th>
                <th>Time</th>
                <th>Room</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="schedule" items="${schedules}">
                <tr>
                    <td>${schedule.id}</td>
                    <td>${schedule.day}</td>
                    <td>${schedule.time}</td>
                    <td>${schedule.room}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
