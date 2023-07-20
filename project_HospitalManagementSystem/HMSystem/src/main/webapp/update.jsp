<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Patient</title>
</head>
<body>
    <h1>Update Patient</h1>

    <%-- Retrieve the patientId from the request parameters --%>
    <% String patientId = request.getParameter("patientId"); %>

    <%-- Display the patientId value in an input field --%>
    <form action="update" method="get">
        <input type="hidden" name="patientId" value="<%= patientId %>">
        Patient ID: <input type="text" name="patientIdInput" value="<%= patientId %>" disable><br>
        <!-- Add other input fields for updating patient information -->
        Name: <input type="text" name="pname"><br>
        City: <input type="text" name="pcity"><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
